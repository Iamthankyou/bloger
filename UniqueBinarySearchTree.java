class Solution {
    public int numTrees(int n) {
        return (int)catalanNumber((long)(n));
    }
    
    private long catalanNumber(long n){
        return (long)combination(2*n,n)/(n+1);
    }
    
    private long combination(long n,long k){
        long res = 1;
        
        k = (k>n-k)?n-k:k;
        
        for (int i=0; i<k; i++){
            res *= (n-i);
            res /= (i+1);
        }
        
        return res;
    }
}
