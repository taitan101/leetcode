package range2d;

public class NumMatrix {
    private int [][] sums;

    public NumMatrix(int[][] matrix) {
        int i;
        int j;
        
        if (matrix.length == 0){
            sums = new int[1][1];
        }else{
            sums = new int[matrix.length + 1][matrix[0].length + 1];
        }
        

        
        
        
        
        
        sums[0][0] = 0;
        
        for (i = 1; i < sums.length; i++){
            sums[i][0] = 0;
        }
        for (i = 1; i < sums[0].length; i++){
            sums[0][i] = 0;
        }
        
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < sums[0].length - 1; j++){
                
                sums[i+1][j+1] = 
                matrix[i][j] + sums[i][j+1] + sums[i+1][j] - sums[i][j];             
                
                
                
            }
        }

        
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
/*
    	int a, b, c;
    	
    	if (row1 > 0){
    		a = sums[row1 - 1][col2];
    	}else{
    		a = 0;
    	}
    	
    	if (col1 > 0){
    		b = sums[row2][col1 - 1];
    	}else{
    		b = 0;
    	}
    	
    	if (col1 > 0 && row1 > 0){
    		c = sums[row1-1][col1-1];
    	}else{
    		c = 0;
    	}
    	*/
    	
    	
    	if (row2 >= sums.length - 1 || col2 >= sums[0].length - 1){
    		return 0;
    	}
    	
        return sums[row2+1][col2+1] - sums[row1][col2+1] - sums[row2+1][col1] + sums[row1][col1];
        
    }
}

