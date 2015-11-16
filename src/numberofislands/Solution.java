package numberofislands;

public class Solution {
	
    public int numIslands(char[][] grid) {
    	
    	
        if (grid.length == 0 ){
            return 0;
        }
        
        if (grid[0].length == 0){
            return 0;
        }    	
    	
    	int num;
    	int i;
    	int j;
    	boolean [][] visited =  new boolean[grid.length][grid[0].length];
    	
    	
    	num = 0;
    	
    	for (i = 0; i < grid.length; i++){
    		for (j = 0; j < grid[0].length; j++){
    			
    			if (grid[i][j] == '1' && !visited[i][j]){
    				visited[i][j] = true;
    				
    				dfs(grid, visited, i, j);
    				
    				num++;
    			}
    			  			
    			
    			
    			
    			
    		}
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	return num;
    }

	private void dfs(char[][] grid, boolean[][] visited, int i, int j) {
		// TODO Auto-generated method stub
		
		
		if (i > 0 && grid[i-1][j] == '1' && !visited[i - 1][j]){
			visited[i - 1][j] = true;
	
			dfs(grid, visited, i - 1, j);
			
		}
		
		if (j > 0 && grid[i][j-1] == '1' &&!visited[i][j - 1]){
			visited[i][j - 1] = true;
	
			dfs(grid, visited, i, j - 1);
			
		}
		
		if (i < grid.length - 1 && grid[i+1][j] == '1' && !visited[i + 1][j]){
			visited[i + 1][j] = true;
	
			dfs(grid, visited, i + 1, j);
			
		}
		
		if (j < grid[0].length - 1 && grid[i][j+1] == '1' && !visited[i][j + 1]){
			visited[i][j+1] = true;
	
			dfs(grid, visited, i, j+1);
			
		}
		
		
		
		
		
		
	}
    
    
	
	
	

}
