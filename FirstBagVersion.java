//duynotes.blogsp
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarySearch(1,n);        
    }
    
    private int binarySearch(int left, int right){
        
        while (left<=right){
            int mid = left + (right-left)/2;
            if (isBadVersion(mid) && !isBadVersion(mid-1)){
                return mid;
            }
        
            if (!isBadVersion(mid)){
                return binarySearch(mid+1,right);
            }
        
            return binarySearch(left,mid-1);    
        }
        
        return 0;
    }
}
