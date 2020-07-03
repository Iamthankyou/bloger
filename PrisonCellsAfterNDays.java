class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = N%14 == 0 ? 14 : N%14;
        
        for (int i=0; i<N; i++){
            int tmp = cells[0];
            cells[0] = 0;
            for (int j=1; j<7; j++){
                int tmp2 = cells[j];
                cells[j] = tmp == cells[j+1] ? 1 : 0;
                tmp = tmp2;
            }
            cells[7] = 0;
        }
        
        return cells;
    }
}
