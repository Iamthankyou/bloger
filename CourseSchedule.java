class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
        int[] visit = new int[numCourses];
        
        for (int[] i:prerequisites){
            if (graph.containsKey(i[0])){
                graph.get(i[0]).add(i[1]);
            }
            else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i[1]);
                graph.put(i[0],l);
            }
        }
        
        for (int i=0; i<numCourses; i++){
            if (!dfs(graph,visit,i)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(HashMap<Integer,ArrayList<Integer>> graph, int[] visit, int v){
        if (visit[v] == 1){
            return false;
        }
        
        if (visit[v] == 2){
            return true;
        }
        
        visit[v] = 1;
        
        
        if (graph.containsKey(v)){
            for (int i:graph.get(v)){
                if (!dfs(graph,visit,i)){
                    return false;
                }
            }            
        }
        
        visit[v] = 0;
        
        return true;
    }
}
