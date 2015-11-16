package repeateddna;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Solution {
	private static int MASK = Integer.MAX_VALUE - (11 << 18);
	

    class MutableBoolean{
        private boolean value;
        
        
        public MutableBoolean(){
            value = false;
        }
        
        public void setTrue(){
            value = true;
        }
        
        public boolean getValue(){
            return value;
        }
        
        
        
    }
    
    public List<String> findRepeatedDnaSequences(String s) {
    	
    	
    	
    	int i;
    	
    	List<String> list = new ArrayList<String>();
    	HashMap<Integer, MutableBoolean> hm = new HashMap<>();
    	Integer key;
    	MutableBoolean element;
    	
    	if (s.length() <= 10){
    		return list;
    	}
    	
    	
    	key = newKey(s);
    	hm.put(key, new MutableBoolean());
    	
    	
    	for (i = 1; i <= s.length() - 10; i++){
    		key = shiftKey(key.intValue(), s.charAt(i + 9));
    		
    		element = hm.get(key);
    		
    		if (element == null){
    			hm.put(key, new MutableBoolean());
    		}else{
    			
    			if (!element.getValue()){
    				list.add(s.substring(i, i + 10));

    			}
    			
    			
    			
    		    element.setTrue();
    		}
    		
    		
    	}
    	
    	return list;
        
    }
    
    
    public Integer shiftKey(int pre, char ch){
    	
    	int base;
    	
		if (ch == 'A'){
			base = 0;
		}else if (ch == 'T'){
			base = 1;
		}else if (ch == 'C'){
			base = 2;
		}else{
			base = 3;
		}
		pre &= MASK;
		pre <<= 2;
		pre += base;
		
		return new Integer(pre);
    	
    }
    
    
    public Integer newKey(String s){
    	int val;
    	int base;
    	int i;
    	char ch;
    	val = 0;
    	
    	for (i = 0; i < 10; i++){
    		ch = s.charAt(i);
    		
    		if (ch == 'A'){
    			base = 0;
    		}else if (ch == 'T'){
    			base = 1;
    		}else if (ch == 'C'){
    			base = 2;
    		}else{
    			base = 3;
    		}
    		
    		val <<= 2;
    		val += base;
    		
    		
    		
    		
    	}
    	
    	
    	
    	
    	return new Integer(val);
    	
    	
    	
    }
	
}
