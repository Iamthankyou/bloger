// duynotes.blogspot.com
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for (String word:strs){
            
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            // My key = wordSort
            String key = new String(chars);
            
            if (!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            
            map.get(key).add(word);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
