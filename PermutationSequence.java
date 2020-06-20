class Solution {
    private int count = 0;
    
    public String getPermutation(int n, int k) {
        char s[] = new char[n];
        boolean free[] = new boolean[n+1];
        return bt(free,s,0,n,k);
    }
    
    private String bt(boolean[] free,char[] s, int i, int n, int k){
        if (i == n){
            count++;
            String res = new String(s);
            return res;
        }
        else{
            for (int j=1; j<=n; j++){
                if (free[j] == false && count < k){
                    s[i] = (char)(j + '0');      
                    free[j] = true;
                    bt(free,s,i+1,n,k);
                    free[j] = false;
                }
            }                
        }
        
        String res = new String(s);
        return res;
    }
}
