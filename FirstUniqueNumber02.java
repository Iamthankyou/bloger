//duynotes.blogspot.com
class FirstUnique {
    
    private LinkedHashSet<Integer> set = new LinkedHashSet<>();
    private HashMap<Integer,Integer> map = new HashMap<>();
        
    public FirstUnique(int[] nums) {
        for (int i:nums){
            add(i);
        }
    }
    
    public int showFirstUnique() {
        if (set.size()>0){
            for (int i:set){
                return i;
            }
        }
        
        return -1;
    }
    
    public void add(int value) {
        if (map.containsKey(value)){
            set.remove(value);
        }
        else{
            map.put(value,value);
            set.add(value);
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
