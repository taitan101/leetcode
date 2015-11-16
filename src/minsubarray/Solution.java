package minsubarray;

public class Solution {
	
	
    public int minSubArrayLen(int s, int[] nums) {
    	int result = nums.length + 1;
    	
    	
    	int frontend;
    	int backend;
    	int sum;
    	
    	frontend = 0;
    	backend = 0;
    	sum = 0;
    	
    	
    	
    	while (true){
    		while (backend < nums.length && sum < s){
    			sum += nums[backend];
    			backend++;
    			
    		}
    	
    		if (backend == nums.length){
    			break;
    		}
    		
    		result = Math.min(result, backend - frontend);
    		sum -= nums[frontend];
    		frontend++;
    	}
    	
    	while (sum >= s){
    		result = Math.min(result, backend - frontend);
    		sum -= nums[frontend];
    		frontend++;
    	
    	}
    	
    	if (result > nums.length){
    		result = 0;
    	}
    
    	return result;
    
    }

}
