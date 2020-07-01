class Solution {
    public int arrangeCoins(int n) {
        double left = 0;
        double right = n/2+1;
        
        if (n==1){
            return 1;
        }
        
        double mid = left+(right-left)/2;

        while (mid != left && mid != right){
            System.out.println(left+","+right+","+mid);
            if (mid*(mid+1)/2 == n){
                return (int)mid;
            }
            
            if (mid*(mid+1)/2>=n){
                right = mid;
            }
            else{
                left = mid;
            }
            
            mid = left+ (right-left)/2;
        }        
        return Math.round(right)*(Math.round(right)+1)/2 <=n ? (int) right : (int) Math.round(right -1);
    }
}
