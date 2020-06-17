class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0){
            return ;
        }
        
        for (char[] arr:board){
            for (char i:arr){
                System.out.print(i);
            }
            System.out.println();
        }
        
        System.out.println();
        
        for (int i=0; i<board[0].length; i++){
            if (board[0][i] == 'O'){
                board[0][i] = '#';
                dfsUp(board,1,i);
            }
            
            if (board[board.length-1][i] == 'O'){
                board[board.length-1][i] = '#';
                dfsBottom(board,board.length-2,i);
            }
        }   
        
        for (int i=0; i<board.length; i++){
            if (board[i][0] == 'O'){
                board[i][0] = '#';
                dfsLeft(board,i,1);
            }
            
            if (board[i][board[0].length-1] == 'O'){
                board[i][board[0].length-1] = '#';
                dfsRight(board,i,board[0].length-2);
            }
        }   
        
        
        for (char[] arr:board){
            for (char i:arr){
                System.out.print(i);
            }
            System.out.println();
        }
        
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                board[i][j] = board[i][j] == '#' ? 'O':'X'; 
            }
        }
    }
    
    public void dfsUp(char[][] board, int x, int y){
        if (x<0 || y<0 || x>=board.length || y>=board[0].length || board[x][y]!='O'){
            return;
        }
        
        board[x][y] = '#';
        if (x==1 && y ==3){
            System.out.println("?");
        }
        dfsUp(board,x+1,y);
        dfsUp(board,x,y-1);
        dfsUp(board,x,y+1);
        
        return;
    }
    
    public void dfsBottom(char[][] board, int x, int y){
        if (x<0 || y<0 || x>=board.length || y>=board[0].length || board[x][y]!='O'){
            return;
        }
        
        board[x][y] = '#';
        
        dfsBottom(board,x-1,y);
        dfsBottom(board,x,y-1);
        dfsBottom(board,x,y+1);
        
        return;
    }
    
    public void dfsLeft(char[][] board, int x, int y){
        // System.out.println(x+","+y);
        
        if (x<0 || y<0 || x>=board.length || y>=board[0].length || board[x][y]=='X'){
            return;
        }
        
        board[x][y] = '#';
        
        dfsLeft(board,x,y+1);
        dfsLeft(board,x+1,y);
        dfsLeft(board,x-1,y);
        
        return;
    }
    
    public void dfsRight(char[][] board, int x, int y){
        // System.out.println(x+","+y);
        if (x<0 || y<0 || x>=board.length || y>=board[0].length || board[x][y]=='X'){
            return;
        }
        
        board[x][y] = '#';
        
        dfsRight(board,x,y-1);
        dfsRight(board,x+1,y);
        dfsRight(board,x-1,y);
        
        return;
    }
}
