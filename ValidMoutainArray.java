class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length == 0 || A.length == 1 || A.length == 2){
            return false;
        }
        
        int i=0;
        
        for (;i<A.length-1 && A[i]<A[i+1];i++);        
        if (i == A.length-1 || i == 0){
            return false;
        }
        
        for (;i<A.length-1 && A[i]>A[i+1];i++);
        
        if (i==A.length-1){
            return true;
        }
        
        return false;
    }
}
