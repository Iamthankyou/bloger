class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue((a,b)->(map.get(b) - map.get(a)));
                                                        
        for (char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
                                                        
        pq.addAll(map.keySet());
            
        StringBuilder res = new StringBuilder();
                                                        
        while (!pq.isEmpty()){
            char c = pq.remove();
            for (int i=0; i<map.get(c); i++){
                res.append(c);
            }
        }
                                                        
        return res.toString();
    }
    
}
