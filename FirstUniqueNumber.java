class FirstUnique {
    
    private LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        
    public FirstUnique(int[] nums) {
        for (int i:nums){
            add(i);
        }
    }
    
    public int showFirstUnique() {
        if (map.size()>0){
            ArrayList<Integer> list = new ArrayList<>(map.values());
            return list.get(0);
        }
        
        return -1;
    }
    
    public void add(int value) {
        if (map.containsKey(value)){
            map.remove(value);
        }
        else{
            map.put(value,value);    
        }
        
    }
}
