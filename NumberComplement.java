//duynotes.blogspot.com
class Solution {
    public int findComplement(int num) {
        if (num == 1){
            return 0;
        }
        
        int bitLength = (int)(Math.log(num)/Math.log(2)) + 1;
        
        long res = pow(2,bitLength) -1;
        return (int)(num^res);
    }
    
    private long pow(int a, int b){
        if (b==0){
            return 1;
        }

        if (b%2==0){
            return pow(a,b/2)*pow(a,b/2);
        }
        else{
            return a*pow(a,b/2)*pow(a,b/2);
        }
    }
}
