package validSudoku;

public class Solution {

        public boolean isValidSudoku(char[][] board) {
            
            int i;
            boolean result;
            
            for (i = 0; i < 9; i++){
                result = checkRow(board[i]);
                
                if (!result){
                    return false;
                }
                
                result = checkCol(board, i);
                
                if (!result){
                    return false;
                }
                
            }
            
            
            result = checkCell(board);
            
            if (result){
                return true;
            }else{
                return false;
            }
            
          
            
            
            
        }
        
        private boolean checkRow(char [] row){
            int i;
            int index;
            
            boolean [] test = new boolean[9];
            
            for (i = 0; i < row.length; i++){
                if (row[i] != '.'){
                    index = row[i]-'1';
                    if (test[index]){
                        return false;
                    }else{
                        test[index] = true;
                    }

                }
            }
            
            return true;
            
        }
        
        private boolean checkCol(char [][] board, int colIndex){
            int i;
            int index;
            
            boolean [] test = new boolean[9];
            
            for (i = 0; i < board.length; i++){
                if (board[i][colIndex] != '.'){
                    index = board[i][colIndex]-'1';
                    if (test[index]){
                        return false;
                    }else{
                        test[index] = true;
                    }

                }
            }
            
            
            
            return true;
            
        }
        
        private boolean checkCell(char [][] board){
            int i;
            int j;
            int index;
            boolean result;
            
            boolean [] test = new boolean[9];
            
            for (i = 0; i < board.length; i += 3){
                for (j = 0; j < board.length; j += 3){
                    
                    result = checkSingleCell(board, i, j);
                    
                    if (!result){
                        return false;
                    }
                    
                }
                
                
            }
            
            
            
            return true;
            
        }     
        
        
        private boolean checkSingleCell(char [][] board, int rolIndex, int colIndex){
            int i;
            int j;
            int index;
            boolean result;
            
            
            boolean [] test = new boolean[9];
            
            for (i = rolIndex; i < rolIndex + 3; i++){
                for (j = colIndex; j < colIndex + 3; j++){
                    
                   if (board[i][j] != '.'){
                        index = board[i][j]-'1';
                        if (test[index]){
                            return false;
                        }else{
                            test[index] = true;
                        }

                    }
                    
                    
                    
                }
                
                
            }
            
            
            
            return true;
            
        }          

	
	

}
