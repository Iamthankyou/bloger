class Solution {
    public String toHex(int num) {
        char pieces[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder res = new StringBuilder();
        
        if (num == 0){
            return "0";
        }
        
        long n = num;
        
        if (n<0){
            n+=Math.pow(2,32);
        }
        
        while (n!=0){
            res.append(pieces[(int)((long)n%16)]);
            n/=16;
        }
        
        return res.reverse().toString();
    }
    
    
}
