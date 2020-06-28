class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> graph = new HashMap<>();
        LinkedList<String> res = new LinkedList<>();
        
        for (List<String> iter:tickets){
            if (!graph.containsKey(iter.get(0))){
                PriorityQueue<String> queue = new PriorityQueue<>();
                queue.offer(iter.get(1));
                graph.put(iter.get(0),queue);
            }
            else{
                graph.get(iter.get(0)).offer(iter.get(1));        
            }
        }
        
        dfs(res,graph,"JFK");
        res.addFirst("JFK");
        
        return res;
    }
    
    private void dfs(LinkedList<String> res, HashMap<String,PriorityQueue<String>> graph, String dist){
        PriorityQueue<String> pq = graph.get(dist);
        
        while (pq!=null && !pq.isEmpty()){
            String tmp = pq.poll();
            dfs(res,graph,tmp);
            res.addFirst(tmp);
        }
        
        return;
    }
}
