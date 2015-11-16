package houserobber;

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
    	
    	nums[1] = Math.max(nums[0], nums[1]);
    	
		nums[2] = Math.max(nums[0] + nums[2], nums[1]);
    	
    	for (i = 3; i < nums.length; i++){
    		nums[i] = Math.max(Math.max(nums[i] + nums[i - 2], nums[i] + nums[i - 3]), nums[i - 1]);
    		
    		
    	}
    	
    	
    	return nums[nums.length - 1];
    	
    	
        
    }

}
