package pow;

public class Solution {
	
    public double myPow(double x, int n) {
    	double result;

    	
    	result = 1.0;
    	
    	if (n == 0){
    		return 1.0;
    	}else if (n == -1){
    		return 1 / x;
    		
    		
    		
    	}else if (n == Integer.MIN_VALUE){
    		n++;
    		
			result = recPow(x, -n >> 1);
			result *= result;
			
			if ((n & 1) == 1){
 			
    			result *= x;
    			
    		}
			result = 1 / result;
			
			result /= x;
			
    	
    	}else if (n < -1){
    	
    		
    		
			result = recPow(x, -n >> 1);
			result *= result;
			
			if ((n & 1) == 1){
 			
    			result *= x;
    			
    		}
			result = 1 / result;
    		
    		
    	}else if (n == 1){
    		return x;
    		
    	}else if (n > 1){
    	
    		//result = x;
    		
    		
			result = recPow(x, n >> 1);
			result *= result;
			
			if ((n & 1) == 1){
 			
    			result *= x;
    			
    		}
    		
    		
    	}
    	
    	return result;
    	
    	
    	
    	
        
    }	
	
    public double recPow(double x, int n){
    	
    	double result;
    	
    	if (n == 1){
    		return x;
    	}else{
    		
    		result = recPow(x, n >> 1);
    		
    		result *= result;
    		
    		if ((n & 1) == 1){
    			result *= x;
    		}
    		
    		
    		
    	}
    	
    	return result;
    	
    	
    	
    	
    	
    }

}
