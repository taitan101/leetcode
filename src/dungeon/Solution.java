package dungeon;

public class Solution {
	
    public int calculateMinimumHP(int[][] dungeon) {
        int [][] mat = new int[dungeon.length][dungeon[0].length];
        int [][] min = new int[dungeon.length][dungeon[0].length];
        int i;
        int j;
        
        int val1;
        int val2;
        int pivot;
 
        
        
        mat[0][0] = dungeon[0][0];
        min[0][0] = dungeon[0][0];
        
        
        for (i = 1; i < mat.length; i++){
            mat[i][0] = mat[i-1][0] + dungeon[i][0];
            min[i][0] = Math.min(min[i-1][0], mat[i][0]);
            
        }
        
        for (i = 1; i < mat[0].length; i++){
            mat[0][i] = mat[0][i-1] + dungeon[0][i];
            min[0][i] = Math.min(min[0][i-1], mat[0][i]);
            
        }
        


        
        
        for (i = 1; i < mat.length; i++){
            for (j = 1; j < mat[0].length; j++){
            	
            	
            	
            	if (dungeon[i][j] >= 0){
                    if (min[i-1][j] > min[i][j-1]){
                        
                        mat[i][j] = dungeon[i][j] + mat[i-1][j];
                        min[i][j] = min[i-1][j];
                    }else{
                        
                        mat[i][j] = dungeon[i][j] + mat[i][j-1];
                        min[i][j] = min[i][j-1];
                    }            		
         		
            	}else{
            		
            		val1 = dungeon[i][j] + mat[i-1][j];
            		val2 = dungeon[i][j] + mat[i][j-1];
            		pivot = Math.max(val1, val2);
            		
            		
            		if (pivot < min[i-1][j] && pivot < min[i][j-1]){
            			if (pivot == val1){
                            mat[i][j] = val1;
                            min[i][j] = mat[i][j];            				
            				
            			}else{
                            mat[i][j] = val2;
                            min[i][j] = mat[i][j]; 
            				
            			}
            			
            			
            			
            			
            		}else{
                        if (min[i-1][j] > min[i][j-1]){
                            
                            mat[i][j] = dungeon[i][j] + mat[i-1][j];
                            min[i][j] = min[i-1][j];
                        }else{
                            
                            mat[i][j] = dungeon[i][j] + mat[i][j-1];
                            min[i][j] = min[i][j-1];
                        }             			
            			
            			
            		
            		}
      		
            		
            	}

       
                
            }
            

        }
        
        i = mat.length - 1;
        j = mat[0].length - 1;
        
        if (min[i][j] <= 0){
            return -min[i][j] + 1;

        }else{
     
            return 1;
        }
        
        
        
    }
    
    public int max4num(int a, int b, int c, int d){
    	if (a < b){
    		a = b;
    	}
    	
    	if (c < d){
    		c = d;
    	}
    	
    	if (a > c){
    		return a;
    	}else{
    		return c;
    	}
    	
    	
    }
	

}
