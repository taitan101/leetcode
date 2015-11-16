package shortestpalindrome;

public class Solution {
	
    public String shortestPalindrome(String s) {
    	int i;
    	int j;

    	StringBuilder sb = new StringBuilder();
    	
    	
    	for (i = 1; i <= s.length(); i++){
    		
    		if (isPalindrome(s, s.length() - i)){
    			
    			for (j = 1; j < i; j++){
    				sb.append(s.charAt(s.length() - j));
    								
    				
    				
    			}
    			
    			
    			
    			
    			
    			
    			sb.append(s);
    			
    			break;
    		}
    	}
    	
    	
    	
    	return sb.toString();
    	
    	
    	
    	
    }	
    
    private boolean isPalindrome(String s, int end){
    	int start;
    	
    	start = 0;
    	
    	
    	while (end > start){
    		
    		if (s.charAt(start) != s.charAt(end)){
    			return false;
    			
    		}
    		
    		start++;
    		end--;
    		
    		
    	}
    	return true;
    	
    	
    	
    	
    }
	

}
