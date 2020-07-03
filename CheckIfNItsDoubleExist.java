class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for (int i:arr){
            if (i==0){
                if (map.get(i) >=2){
                    return true;
                }
            }
            
            if (map.containsKey(i*2) && i!=0){
                return true;
            }
        }
        
        return false;
    }
}
