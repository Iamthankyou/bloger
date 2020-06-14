class Pair{
    int dst;
    int price;
    
    public Pair(int dst, int price){
        this.dst = dst;
        this.price = price;
    }
    
    public Pair(){}
}

class City{
    int src;
    int dst;
    int price;
    
    public City(){}
    
    public City(int src, int dst, int price){
        this.src = src;
        this.dst = dst;
        this.price = price;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        
        if (n<0 || flights == null || flights[0].length == 0 || K<0){
            return -1;
        }
        
        Map<Integer,ArrayList<Pair>> graph = new HashMap<>();
        
        for (int[] arr:flights){ 
            if (graph.containsKey(arr[0])){
                graph.get(arr[0]).add(new Pair(arr[1],arr[2]));
            }
            else{
                ArrayList<Pair> list = new ArrayList<>();
                list.add(new Pair(arr[1],arr[2]));
                graph.put(arr[0],list);
            }
        }
        
        for (int[] arr:flights){
            List<Pair> list = graph.get(arr[0]);
            System.out.print(arr[0]+":");
            for (Pair pair:list){
                System.out.print(pair.dst+","+pair.price);
            }
            System.out.println();
        }
        
        PriorityQueue<City> pq = new PriorityQueue<>((City a, City b)->(a.price-b.price));
        
        pq.offer(new City(src,0,0));
        
        System.out.println("1");
        
        while (!pq.isEmpty()){
            City city = pq.poll();
            
            if (city.src == dst){
                return city.price;
            }
            
            if (city.dst > K){
                continue;
            }
            
            List<Pair> edge = graph.get(city.src);
            
            if (edge != null){
                for (Pair iter:edge){
                    System.out.print(iter.dst+","+iter.price);
                    pq.offer(new City(iter.dst,city.dst+1,city.price+iter.price));
                }                
            }
        }
        
        return -1;
    }
}
