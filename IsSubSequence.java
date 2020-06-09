class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        
        int count = 0;
        
        if (s.length() == 0){
            return true;
        }
        
        while (i<t.length()){
            if (s.charAt(j) == t.charAt(i)){
                j++;
                count++;
            }
            
            if (count == s.length()&& count != 0){
                return true;
            }
            
            i++;
        }
        
        return count == 0 ? false : count == s.length();
    }
}
