package lifegame;

public class Solution {
    public void gameOfLife(int[][] board) {
        int m;
        int n;
        int i;
        int j;
        
        m = board.length;
        n = board[0].length;
        
        
        for(i = 0; i < m; i++){
           for (j = 0; j < n; j++){
                
                
                check(board, m - 1, n - 1, i, j);               
           } 
            
        }
        
        for(i = 0; i < m; i++){
           for (j = 0; j < n; j++){
                if ((board[i][j] & 2) == 0){
                    board[i][j] = 0;
                }else{
                    board[i][j] = 1;
                }       
                
             
           } 
            
        }
        
        
        
        
    }

    private void check(int[][] board, int m, int n, int i, int j){
        int live = 0;
        
        
        if (i >= 1 && j >= 1){
            if ((board[i-1][j-1]  & 1) == 1){
                live++;
            }
        }
        
        if (i >= 1){
            if ((board[i-1][j]  & 1) == 1){
                live++;
            }
        }
        
        if (i >= 1 && j < n){
            if ((board[i-1][j+1]  & 1) == 1){
                live++;
            }
        }
        
        if (j < n){
            if ((board[i][j+1]  & 1) == 1){
                live++;
            }
        }
        
        if (i < m && j < n){
            if ((board[i+1][j+1]  & 1) == 1){
                live++;
            }
        }
        
        if (i < m ){
            if ((board[i+1][j]  & 1) == 1){
                live++;
            }
        }
        
        if (i < m && j >= 1 ){
            if ((board[i+1][j-1] & 1) == 1){
                live++;
            }
        }
        
         if (j >= 1 ){
            if ((board[i][j-1] & 1)  == 1){
                live++;
            }
        }
        
        
        
        if ((board[i][j] & 1) == 1){
            if (live == 2 || live == 3){
                board[i][j] = 3;
            }
        }else{
            if (live == 3){
                board[i][j] = 2;
            }
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    
}