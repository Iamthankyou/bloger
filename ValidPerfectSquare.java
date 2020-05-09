class Solution {
    public boolean isPerfectSquare(int num) {
        int x = floorSqrt(num,0,num);
        return x*x == num;
    }
    
    private int floorSqrt(long num, long left, long right){
        long mid = (left+right)/2;
        if (left <= right){
            if (mid*mid <= num && (mid+1)*(mid+1)>num){
                return (int)(mid);
            }
            else if (mid*mid <num){
                return floorSqrt(num,mid+1,right);
            }
            else{
                return floorSqrt(num,left,mid-1);
            }    
        }
        
        return 0;
    }
}
