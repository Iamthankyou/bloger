// duynotes.blogspot.com
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
        List<Integer> res = new ArrayList<>();
        
        for (char i:p.toCharArray()){
            freq[i-'a']++;
        }
        
        int[] window = new int[26];
        
        for (int i=0; i<s.length(); i++){
            window[s.charAt(i) - 'a']++;

            if (i>=p.length()){
                window[s.charAt(i-p.length())-'a']--;    
            }
            
            if (Arrays.equals(freq,window)){
                res.add(i-p.length()+1);
            }            
        }
        
        return res;
    }
}
