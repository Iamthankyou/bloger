// duynotes.blogspot.com
class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<>();
        int res = 0;
        
        for (char i:J.toCharArray()){
            set.add(i);
        }   
        
        for (char i:S.toCharArray()){
            if (set.contains(i)){
                res++;
            }
        }
        
        return res;
    }
}
