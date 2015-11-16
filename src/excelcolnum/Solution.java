package excelcolnum;

public class Solution {
	
    public int titleToNumber(String s) {
        int len;
        int base;
        int sum;
        int i;
        int ch;
        int value;
        
        len = s.length();
        
        
        base = 1;
        sum = 0;
        
        for (i = 1; i < len; i++){
        	base *= 26;
        	sum += base;

        	
        }
        
        
        value = 0;
        for (i = 0; i < len; i++){
        	ch = s.charAt(i);
           	
        	
        	value += (ch - 'A') * base;
        	base /= 26;
 
       	
        }
        
        
        System.out.println(sum + value + 1);
  	
    	
    	return sum + value + 1;
    
    }

}
