package maxsubarray;

public class Solution {
	
    public int maxSubArray(int[] nums) {
    	
    	int i;
    	int max;
        int [] mat = new int[nums.length];
        
        

        mat[0] = nums[0];
        
        
        for (i = 1; i < nums.length; i++){
   	
        	
        	mat[i] = Math.max(nums[i], nums[i] + mat[i-1]);

        	
        }
        
        max = nums[0];
        for (i = 1; i < nums.length; i++){
        	max = Math.max(max, mat[i]);
        	
        	
        
        }
        
        
        return max;
        
        
        
        
        
        
        
        
        
        
    }
    
    public int minPathSum(int[][] grid) {
        int m;
        int n;
        int i;
        int j;
        
        
        m = grid.length;
        n = grid[0].length;
        
        int [][] mat = new int[m][n];
        
        
        mat[0][0] = grid[0][0];
        
        
        for (i = 1; i < m; i++){
            mat[i][0] = mat[i-1][0] + grid[i][0];
            
            
            
        }
        
        for (i = 1; i < n; i++){
            mat[0][i] = mat[0][i-1] + grid[0][i];
        }
        
        for (i = 1; i < m; i++){
            for (j = 0; j < n; j++){
                
                
                
                mat[i][j] = Math.min(mat[i-1][j],mat[i][j-1]) + grid[i][j];
                
                
            }
            
        }
        
        return mat[m][n];
        
        
        
    }    
    

}
