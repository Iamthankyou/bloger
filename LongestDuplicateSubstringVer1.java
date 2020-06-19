class Solution {
    public String longestDupSubstring(String S) {
        String[] suffixes = new String[S.length()];
        
        for (int i=0; i<S.length(); i++){
            suffixes[i] = S.substring(i,S.length());
        }
        
        Arrays.sort(suffixes);
        
        String lrs = "";
        
        for (int i=0; i<S.length()-1; i++){
            String x = lcp(suffixes[i],suffixes[i+1]);
            
            if (x.length() > lrs.length()){
                lrs = x;
            }
        }
        
        return lrs;
    }
    
    private String lcp(String a, String b){
        int n = Math.min(a.length(),b.length());
        
        for (int i=0; i<n; i++){
            if (a.charAt(i) != b.charAt(i)){
                return a.substring(0,i);
            }
        }
        
        return a.substring(0,n);
    }
}
