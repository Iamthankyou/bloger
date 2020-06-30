class Solution {
    public int[] sortedSquares(int[] A) {
        int i = 0;
        int j = 0;
        int[] res = new int[A.length];
        int k = 0;
        
        while (j<A.length && A[j]<=0){
            j++;
        }
        
        i = j-1;
        
        while (i>=0 && j<A.length){
            if (A[i]*A[i]<A[j]*A[j]){
                res[k++] = A[i]*A[i];        
                i--;
            }
            else{
                res[k++] = A[j]*A[j];
                j++;
            }
        }
        
        while (i>=0){
            res[k++] = A[i]*A[i];
            i--;
        }
        
        while (j<A.length){
            res[k++] = A[j]*A[j];
            j++;
        }
        
        return res;
    }
}
