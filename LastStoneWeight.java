// duynotes.blogspot.com
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i: stones){
            pq.offer(i);
        }
        
        while (pq.size()>=2){
            int first = pq.poll();
            int last = pq.poll();
            if (first!=last){
                pq.offer(first-last);
            }
        }
        return pq.size()==1?pq.poll():0;
    }
}
