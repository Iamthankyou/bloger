class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> block = new HashSet<>();
            
            for (int j=0; j<9; j++){
                if (!row.add(board[i][j]) && board[i][j] != '.'){
                    return false;
                }    
                if (!col.add(board[j][i]) && board[j][i] != '.'){
                    return false;
                }
                
                int r = i/3*3 + j/3;
                int c = i%3*3 + j%3;
                
                if (!block.add(board[r][c]) && board[r][c] != '.'){
                    return false;
                }
            }
        }
        
        return true;
    }
}
