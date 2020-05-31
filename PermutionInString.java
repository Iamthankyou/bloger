//duynotes.blogspot.com
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        
        for (char i:s1.toCharArray()){
            freq[i-'a']++;
        }
        
        int[] window = new int[26];
        
        for (int i=0; i<s2.length(); i++){
            window[s2.charAt(i) - 'a']++;

            if (i>=s1.length()){
                window[s2.charAt(i-s1.length())-'a']--;    
            }
            
            if (Arrays.equals(freq,window)){
                return true;
            }            
        }
        
        return false;
    }
}
