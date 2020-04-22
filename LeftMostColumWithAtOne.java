/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int m = binaryMatrix.dimensions().get(0);
        int n = binaryMatrix.dimensions().get(1);
        
        if (m == 0 || n == 0){
            return -1;
        }
        
        int res = -1;
        int r = 0, c = n-1;
        while (r<m && c >=0){
            if (binaryMatrix.get(r,c)==1){
                res = c;
                c--;
            }
            else{
                r++;
            }
        }
        return res;
        
    }
}
