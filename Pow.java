class Solution {
    public double myPow(double x, int n) {
        if (n==0){
            return 1;
        }
        
        double half = myPow(x,n/2);
        double res = half * half;
        
        if (n%2!=0){
            res*=n<0?1.0/x:x;
        }

        return res;
    }
    
}
