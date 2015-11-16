package containsduplicate;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public boolean containsDuplicate(int[] nums) {
    	
    	int i;
   	
    	Integer integer;
    	
    	Hashtable<Integer, Integer> ht = new Hashtable<>();
    	
    	for (i = 0; i < nums.length; i++){
    		
    		integer = ht.get(nums[i]);
    		   		
    		if (integer == null){
    			
        		ht.put(nums[i], 0);
    		}else{
    			return true;
    		}
 		
    	}
    	

    	
    	
    	return false;    	
        
    }
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i;
        
        Set <Integer> set = new HashSet<>();
        Integer element;
        
        
        for (i = 0; i < k; i++){
        	
        	element = nums[i];
        	
        	if (set.contains(element)){
        		return true;
        	}else{
        		set.add(element);
        	}
    
        }
        
        
        for (; i < nums.length; i++){
        	
        	element = nums[i];
        	
        	if (set.contains(element)){
        		return true;
        	}else{
        		set.add(element);
        		set.remove(nums[i - k]);
        	}
    
        }        
        
        return false;
    }
	
}
