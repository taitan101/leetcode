package reversebits;

public class Solution {

    public int reverseBits(int n) {
    	
    	
    	print(n);
    	
    	return n;
    }
    
    
    
    public void print(int n){
    	int i;
    	int mask = 1 << 30;
    	
    	
    	if (n < 0){
			System.out.print("1");
    	}else{
			System.out.print("0");    		
    	}
    	
    	
    	for (i = 1 ; i < 32; i++){
    		if ((n & mask) != 0){
    			System.out.print("1");
    		}else{
    			System.out.print("0");
    			
    		}
    		mask >>= 1;
    		
    		
    	}
    	System.out.println();
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    
	
}
