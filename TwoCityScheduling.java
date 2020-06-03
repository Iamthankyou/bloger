class Solution {
    public int twoCitySchedCost(int[][] costs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(Math.abs(b[0]-b[1])-Math.abs(a[0]-a[1])));
        int res = 0;
        int numsA = 0;
        int numsB = 0;
        
        for (int arr[]: costs){
            pq.add(arr);
        }

        System.out.println(costs.length/2);
        while (!pq.isEmpty()){
            if ((pq.peek()[0]<=pq.peek()[1] && numsA <costs.length/2) || numsB == costs.length/2){
                numsA++;
                res+=pq.peek()[0];
            }
            else{
                numsB++;
                res+=pq.peek()[1];
            }
              
            pq.remove();
        }
        
        return res;
    }
}
