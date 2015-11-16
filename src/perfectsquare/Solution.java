package perfectsquare;

public class Solution {
    public int numSquares(int n) {
    	int i;
    	int j;
    	int k;

    	int frontend;
    	int backend;
    	int base;
    	int min;
    	int exp;
    	int [] squares;
    	int bound;
    	
 
    	
        
        if (n <= 0){
            return 0;
        }
        
        
        exp = ((int)Math.sqrt(n)) + 3;
        
        squares = new int[exp];
        

        for (i = 0; i < exp; i++ ){
        	squares[i] = i * i;
        	
        }
        
        
        

        int [] results = new int[n + 1];
        
        results[0] = 0;
        
        base = 1;
        frontend = squares[base];
        base++;
        backend = squares[base]  ;
        
        
        for (i = 1; i <= n; i = frontend){
        	bound = Integer.min(n, backend - 1);
        	for (j = i; j <= bound; j++){
        		min = Integer.MAX_VALUE;
        		for (k = base - 1 ; k >= 1; k--){
        			min = Integer.min(min, results[j - squares[k]]);
        		}
        		
        		results[j] = min + 1;
        		
        		
        		
        	}
        	
        	frontend = backend;
        	base++;
        	backend = squares[base];
        	
  	
        	
        	
        }
        
      
        return results[n];
        
    }
}
