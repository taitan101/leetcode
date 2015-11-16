package rotate;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int x;
        int y;
        int temp;
        
        
        int i;
        int j;
        
        x= 0;
        y = n - 1;
        
        
        while (y > x){
            
            for (i = 0; i < y - x; i++){
                temp = matrix[x][x+i];
                
                matrix[x][x+i] = matrix[y-i][x];
                matrix[y-i][x] = matrix[y][y-i];
                matrix[y][y-i] = matrix[x+i][y];
                matrix[x+i][y] = temp;
            }            
            x++;
            y--;
        }

    }	
	

}
