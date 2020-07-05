class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0;
        
        for (int val=x^y; val>0; val=val>>1){
            if ((val&1)!=0){
                dist++;
            }
        }
        
        return dist;
    }
}
