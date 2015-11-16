package isostr;

import java.util.Hashtable;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        
        int i;
        
        Hashtable<Character, Character> ht = new Hashtable<>();
        
        Character ch;
        
        
        
        for (i = 0; i < s.length(); i++){
            
        	ch = ht.get(s.charAt(i));
        	
        	if (ch == null){
        		if (ht.contains(t.charAt(i))){
        			return false;
        		}
        		
        		
        		ht.put(s.charAt(i)	, t.charAt(i));
        	}else if (ch.charValue() != t.charAt(i)){
        		return false;
        		
        	}
        	


            
            
            
        }
        
        return true;
        
        
        
    }	
	
}
