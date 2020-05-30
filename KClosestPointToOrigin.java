class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->((b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1])));
                                                              
        for (int[] point:points){
            pq.add(point);
            if (pq.size() > K){
                pq.remove();
            }
        }
                                                              
        int[][] res = new int[K][2];
                                                              
        while (K--!=0){
            res[K] = pq.remove();   
        }
                                                              
        return res;
    }
}
