class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int tmp = x;
        
        while (tmp>0){
            res=res*10+tmp%10;
            tmp/=10;
        }
        
        return res-x==0;
    }
}
