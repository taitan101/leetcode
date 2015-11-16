package houserobber2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution so = new Solution();
		
		int [] nums = {1, 1, 2, 1};
		
		System.out.println(so.rob(nums));

	}
	
    public int rob(int[] nums) {
    	
    	if (nums.length == 1){
    		return nums[0];
    	}else if (nums.length == 2){
    		return Math.max(nums[0], nums[1]);
    	}else if (nums.length == 3){
    		return Math.max(nums[0] + nums[2], nums[1]);
    	}else if (nums.length == 0){
    	    return 0;
    	}
    	
    	int i;
    	
    	boolean [] used = new boolean[nums.length];
    	
    	int max;
    	boolean checked;
    	
    	used[0] = true;
    	
    	
    	if (nums[0] > nums[1]){
    		used[1] = true;
    		nums[1] = nums[0];
    	}else{
    		used[1] = false;
    	}
    	
    	if (nums[0] + nums[2] > nums[1]){
    		used[2] = true;
    		nums[2] = nums[0] + nums[2];
    		
    	}else{
    		nums[2] = nums[1];
    		used[2] = used[1];
    	}
    	
    	
    	for (i = 3; i < nums.length; i++){
    		max = Math.max(Math.max(nums[i] + nums[i - 2], nums[i] + nums[i - 3]), nums[i - 1]);
    		
    		checked = true;
    		
    		if (max == nums[i] + nums[i - 2]){
    			checked = checked && used[i - 2];
    		}
    		
    		if (max == nums[i] + nums[i - 3]){
    			checked = checked && used[i - 3];
    		}
    		
    		if (max == nums[i - 1]){
    			checked = checked && used[i - 1];
    		}
    		
    		nums[i] = max;
    		
   
    	}
    	
    	
    	
    	
    	
    	return nums[nums.length - 1];
    	
    	
        
    }

}
