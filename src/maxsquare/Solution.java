package maxsquare;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int i;
        int j;
        int max;
        int min;
        
        
        if (matrix.length == 0){
            return 0;
        }
        
        
        int [][] results = new int[matrix.length][matrix[0].length];
        
        max = 0;
        for (i = 0; i < matrix.length; i++){
            if (matrix[i][0] == '1'){
                results[i][0] = 1;
                max = 1;
            }
            
        }

        for (i = 1; i < matrix[0].length; i++){
            if (matrix[0][i] == '1'){
                results[0][i] = 1;
                max = 1;
            }
            
        }
        
        for (i = 1; i < matrix.length; i++){
            for (j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == '0'){
                    results[i][j] = 0;
                }else{
                    min = Integer.min(results[i-1][j], results[i][j-1]);
                    min = Integer.min(min, results[i-1][j-1]);
                    max = Integer.max(max, min + 1);
                    results[i][j] = min + 1;
                    
                }
                


            }
        }
        
        
        
        return max * max;
        
    }
}
