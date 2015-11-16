package numbersrange;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();
		
		int i;
		
		
		
		System.out.println(so.rangeBitwiseAnd(4, 7));
		System.out.println(so.rangeBitwiseAnd(2147483646, 2147483647));
		System.out.println(so.rangeBitwiseAnd(3, 3));
		System.out.println(so.rangeBitwiseAnd(6, 7));
		System.out.println(so.rangeBitwiseAnd(1, 3));
		System.out.println(so.rangeBitwiseAnd(10, 11));
	}
	
	
    public int rangeBitwiseAnd(int m, int n) {
    	

    	if (m == 0){
    		return 0;
    	}else if (m >= 1 << 30){
    		
    		

    		int base;
    		
    		
    		base = 1 << 30;
    		int result = base;
    		
    		while (base > 0){
    			base >>= 1;
    		
    			if (((base & m) != 0) && ((base & n) != 0) && ((n - m) < base)){
    				result += base;
    			}
    			
    			
    		}
    		
    		return result;
    		
    	}else if (m == n){
    	    return m;
    	}
    	
    	int base;
    	
    	
    	
    	
    	
    	base =1;
    	
    	while (m >= base){
    		
    		base <<= 1;
    	}
    	
    	if (n < base){
    		
    		base >>= 1;
    		int result = base;
    		
    		while (base > 0){
    			base >>= 1;
    		
    			if (((base & m) != 0) && ((base & n) != 0) && ((n - m) < base)){
    				result += base;
    			}
    			
    			
    		}
    		
    		return result;
    	
    	
    	
    	}else{
    		return 0;
    	}

    	
    	
    	
    	
    	
        
    }

}
