package wordpattern;

import java.util.HashMap;




public class Solution {
    public boolean wordPattern(String pattern, String str) {
    	int i;
    	HashMap<Character, String> map = new HashMap<>();
    	
    	String [] words = str.split(" ");
    	
    	
    	
    	
    	
    	String value;
    	char key;
    	
    	
    	if (words.length != pattern.length()){
    		return false;
    	}
    	
    	
    	
    	for (i = 0; i < pattern.length(); i++){
    		
    		key = pattern.charAt(i);
    		
    		value = map.get(key);
    		
    		
    		if (value == null){
    			if (map.containsValue(words[i])){
    				
    				return false;
    			}
    			
    			
    			
    			map.put(key, words[i]);
    		}else{
    			
    			if (!value.equals(words[i])){
    				
    				return false;
    			}
    			
    			
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
     
    	
    	return true;
    }
}