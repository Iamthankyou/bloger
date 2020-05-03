//duynotes.blogspot.com
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char i:magazine.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        for (char i:ransomNote.toCharArray()){
            if (map.containsKey(i)){
                map.put(i,map.getOrDefault(i,0)-1);
                if (map.get(i)<0){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}
