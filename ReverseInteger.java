class Solution {
    public int reverse(int x) {
        int res = 0;
    
        try{
            while (x!=0){
                res = Math.multiplyExact(res,10) + x%10;
                x/=10;   
            }
        }
        catch(Exception e){
            return 0;
        }
        
        return res;
    }
}

