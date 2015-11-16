package restoreip;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        int [] digits = new int[4];
        List<String> list = new ArrayList<String>();
        rec(s, 0, 0, digits, list);
        
        
        return list;
    }
    
    private void rec(String s, int start, int depth, int [] digits, List<String> list){
        int i;
        int value;
        
        if (depth == 3){
            if (s.length() - start > 3 || start == s.length()){
                return;
            }
            
            if (s.charAt(start) == '0' && start < s.length() - 1){
            	return;
            }
            

            value = Integer.parseInt(s.substring(start, s.length()));
            
            if (value >= 0 && value <= 255){

                
              	list.add(digits[0] + "." + digits[1] + "." + digits[2] + "." + value);
                
                
            }

       

        }else{
        	/*
            for (i = start; i < s.length() && i < start + 3 ; i++ ){
            	if (i > start && s.charAt(start) == '0'){
                	break;
                }
            	
            	value = Integer.parseInt(s.substring(start, i + 1));
                
                if (value >= 0 && value <= 255){
                    digits[depth] =  value;
                    
                    rec(s, i + 1, depth + 1, digits, list);                
                    
                    
                }

            }
            */

        
        	if (start < s.length()){
        		value = Integer.parseInt(s.substring(start, start + 1));
            
        		if (value >= 0 && value <= 255){
        			digits[depth] =  value;
                
        			rec(s, start + 1, depth + 1, digits, list);                
                
                
        		}

        	}
        	
        	if (start < s.length() && s.charAt(start) == '0'){
        		return;
        	}
        	
        	if (start + 1 < s.length()){
        		value = Integer.parseInt(s.substring(start, start + 2));
            
        		if (value >= 0 && value <= 255){
        			digits[depth] =  value;
                
        			rec(s, start + 2, depth + 1, digits, list);                
                
                
        		}

        	}
        	
        	if (start + 2 < s.length()){
        		value = Integer.parseInt(s.substring(start, start + 3));
            
        		if (value >= 0 && value <= 255){
        			digits[depth] =  value;
                
        			rec(s, start + 3, depth + 1, digits, list);                
                
                
        		}

        	}
        	
        	
        	
        	
        	
        	
        }
        
        
        
        
        
    }	
	

}
