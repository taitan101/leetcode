package search2dmat;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int min;
        int max;
        int mid;
        
        min = 0;
        max = matrix.length - 1;
        
        
        while (max > min){
        	mid = (min + max) >> 1;
        	
        	if (matrix[mid][0] > target){
        		
        		
        		max = mid - 1;
        	}else if (matrix[mid][0] < target){
        		
        		min = mid + 1;
        	}else{
        		return true;
        	}
      	
        }
        
        
        if (target > matrix[min][0]){
            return binarysearch(matrix[min], target);
        	
        }else if (target < matrix[min][0]){
        	
        	return min > 0 && binarysearch(matrix[min - 1], target);
        	
        }else{
            return true;
        }
        

        		
  
    
    }
    
    public boolean binarysearch(int [] matrix, int target){
    	
        int min;
        int max;
        int mid;
        
        min = 0;
        max = matrix.length - 1;
        
        
        while (max > min){
        	mid = (min + max) >> 1;
        	
        	if (matrix[mid] > target){
        		
        		
        		max = mid - 1;
        	}else if (matrix[mid] < target){
        		
        		min = mid + 1;
        	}else{
        		return true;
        	}
      	
        }
        
        
        if (matrix[min] == target){
        	return true;
        }else{
        	return false;           	
        	
        }
        		
  
 	
    	
    }


}
