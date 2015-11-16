package twosum;

import java.util.Hashtable;

public class Solution {
	
	public static void main(String args[]){
		
		Solution so = new Solution();
		
		int [] nums = {2, 7, 11, 15};
		int target = 9;
		
		int [] result;
		
		
		result = so.twoSum(nums, target);
		System.out.println(result[0] + "," + result[1]);
		
		
		
	}
	
	
	
    public int[] twoSum(int[] nums, int target) {
    	int i;
    	int value;
    	int [] result = new int[2];
    	Integer backend;
    	
    	
    	Hashtable<Integer, Integer> ht = new Hashtable<>();
    	
    	for (i = 0; i < nums.length; i++){
    		ht.put(nums[i], i + 1);
    		
    	}
    	
    	
    	for (i = 0; i < nums.length; i++){
    		
    		value = target - nums[i];
    		
    		backend = ht.get(value);
    		
    		
    		if (backend != null){
    			result[0] = i + 1;
    			result[1] = backend;
    			

    			
    			
    		}
    		
    		
    		
    		
    	}
    	
    	
    	return result;
    	
	        
    }

	

}
