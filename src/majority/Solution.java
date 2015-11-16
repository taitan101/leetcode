package majority;

import java.util.Enumeration;
import java.util.Hashtable;

public class Solution {
	
	
	class IncreasableInteger{
		private int value;
		
		
		public IncreasableInteger(int value){
			this.value = value;
		}
		
		public void increase(){
			
			value++;
		}
		
		public int getValue(){
			
			return value;
		}
		
		
		
	}
	
    public int majorityElement(int[] nums) {
    	
    	int i;
    	
    	Hashtable <Integer, IncreasableInteger> ht = new Hashtable <Integer, IncreasableInteger>();
    	IncreasableInteger ii;
    	
    	
    	for (i = 0; i < nums.length; i++){
    		ii = ht.get(nums[i]);
    		
    		if (ii == null){
    			ht.put(nums[i], new IncreasableInteger(1));
    			
    		}else{
    			ii.increase();

    		}
    		

    	}
    	

    	
    	Enumeration<Integer> e = ht.keys();
    	
    	int threshold = nums.length >> 1;
    	Integer key;
    	
    	while (e.hasMoreElements()){
    		
    		key = e.nextElement();
    		
    		if (ht.get(key).getValue() > threshold){
    			
    			return key.intValue();
    		}
    		
    		
    	}
    	
    	
    	return 0;
    	
    	
    	
    	
    	
        
    }

}
