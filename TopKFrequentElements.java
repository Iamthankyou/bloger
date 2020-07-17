class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer,Integer> i:map.entrySet()){
            max = Math.max(max,i.getValue());
        }
        
        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
    
        for (int i=0; i<=max; i++){
            arr[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer,Integer> i:map.entrySet()){
            arr[i.getValue()].add(i.getKey());
        }
        
        int res[] = new int[k];
        int c=0;
        
        for (int i=max; i>=0; i--){
            if (arr[i].size()>0){
                for (int j:arr[i]){
                    res[c++] = j;
                    
                    if (c==k){
                        return res;
                    }
                }
            }
        }
        
        return res;
    }
}
