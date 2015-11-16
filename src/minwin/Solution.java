package minwin;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;

public class Solution {
	
    public String minWindow(String s, String t) {
        int x;
        int y;
        int i;
        Character key;
        MutableInteger mi;
        
        int frontend;
        int backend;
        
        
        if (t.length() > s.length()){
        	return "";
        }
        
        HashMap<Character, MutableInteger> counts = new HashMap<Character, MutableInteger>();

        for (i = 0; i < t.length(); i++){
            key = t.charAt(i);
            mi = counts.get(key);
            
            if (mi == null){
                counts.put(key, new MutableInteger(1));
            }else{
            	mi.increase();
            }
       
        }        

        
    	Iterator<MutableInteger> it = counts.values().iterator();
        
        while (it.hasNext()){
            mi = it.next();
            
            mi.setThreshold();
            
            
        
        }        
        
        
        frontend = 0;
        backend = s.length() + 1;
        
        x = 0;
        y = 0;
        
        
        while (true){
            while (y < s.length() && check(counts)){
                
                mi = counts.get(s.charAt(y));
                
                if (mi != null){
                	
                    mi.increase();
                }
                

                y++;
            }
            
            
            if (check(counts)){
                break;
            }
            
            
            if ((y - x) < backend - frontend){
                frontend = x;
                backend = y;
                
            }
            
            
            mi = counts.get(s.charAt(x));
            
            if (mi != null){            
            
            	mi.decrease();
            }
            x++;

        }
        
        if (frontend == 0 && backend == s.length() + 1){
        	return "";
        }else{
        
        
        	return s.substring(frontend, backend);
        }
        
    }
    
    
    private boolean check(HashMap<Character, MutableInteger> counts){
    	Iterator<MutableInteger> it = counts.values().iterator();
        MutableInteger mi;
        
        while (it.hasNext()){
            mi = it.next();
            
            
            if (mi.isLess()){
                return true;
            }
        
        }
        
        return false;
        
    }    
    
    class MutableInteger{
        int value;
        int threshold;
        
        public MutableInteger(){
            value = 0;
        }
        
        public MutableInteger(int value){
            this.value = value;
        }
        
        public void increase(){
            
            value++;
        }
        
        public void decrease(){
            
            value--;
        }
        
        public int getValue(){
            
            return value;
        }
        
        public boolean isLess(){
            return value < threshold;
        }
        
        public void setThreshold(){
        	
        	this.threshold = value;
        	value = 0;
        }
        
        
        
        
    }	
	

}
