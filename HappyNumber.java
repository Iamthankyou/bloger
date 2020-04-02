// duynotes.blogspot.com
class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        
        do{
            slow = opSum(slow);
            fast = opSum(opSum(fast));
        }
        while(slow!=fast);
        
        if (slow == 1){
            return true;
        }
        else {
            return false;
        }
    }
    
    public int opSum(int n){
        int res = 0;
        
        while (n>0){
            res+=(n%10)*(n%10);
            n/=10;
        }
        
        return res;
    }
}
