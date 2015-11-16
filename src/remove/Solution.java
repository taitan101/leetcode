package remove;



public class Solution {

    public int removeDuplicates(int[] nums) {
    	int i;
    	int next;
    	int val;
    	int count;
    	
    	if (nums.length == 0){
    		return 0;
    	}else if (nums.length == 1){
    		return 1;
    	}
    	
    	count = 0;
    	i = 0;
    	next = 1;
    	while (true){
    		val = nums[i];
    		i++;
    		
    		while (i < nums.length && nums[i] == val){
    			i++;
    		}
    		
    		if (i == nums.length){
    			return count + 1;
    		}
    		
    		count++;
    		nums[next] = nums[i]; 
    		next++;
    		
    		
    	}
    	
    	
    	//return 0;
    	
    	

        
    }	
	
}
