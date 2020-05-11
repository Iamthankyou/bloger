//duynotes.blogspot.com
class Solution {
    public int findJudge(int N, int[][] trust) {
        int count[] = new int[N+1];
        
        for (int[] arr:trust){
            count[arr[0]]--;
            count[arr[1]]++;
        }
        
        for (int i = 1; i<count.length; i++){
            if (count[i] == N-1){
                return i;
            }
        }
        
        return -1;
    }
}
