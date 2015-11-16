package uniquepaths;

public class Solution {
	
    public int uniquePaths(int m, int n) {
        
        int i;
        int j;
        int [][] mat = new int[m][n];
        
        for (i = 0; i < m; i++){
            mat[i][0] = 1;   
        }
        
        for (i = 1; i < n; i++){
            mat[0][i] = 1;   
        }
        
        
        for (i = 1; i < m; i++){
            for (j = 1; j < n; j++){
                
                mat[i][j] = mat[i-1][j] + mat[i][j-1];
                
            }
            
            
        }
        
        return mat[m-1][n-1];
        
        
        
        
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int i;
        int j;
        int m;
        int n;
        
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        
        
        int [][] mat = new int[m][n];
        
        
        if (obstacleGrid[0][0] == 1){
        	return 0;
        }else{
        	mat[0][0] = 1;
        }
        
        
        
        
        for (i = 1; i < m; i++){
        	
        	if (obstacleGrid[i][0] == 0){
                mat[i][0] = mat[i-1][0];
        	}else{
                mat[i][0] = 0;
        	}
        	
   
        }
        
        for (i = 1; i < n; i++){
        	if (obstacleGrid[0][i] == 0){
                mat[0][i] = mat[0][i-1];
        	}else{
                mat[0][i] = 0;
        	}
        }
        
        
        for (i = 1; i < m; i++){
            for (j = 1; j < n; j++){
                
            	if (obstacleGrid[i][j] == 0){
            	
            		mat[i][j] = mat[i-1][j] + mat[i][j-1];
            	}else{
            		mat[i][j] = 0;
            	}
                
            }
            
            
        }
        
        return mat[m-1][n-1];
        
    }    
    

}
