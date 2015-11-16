package rotatearray;

public class Solution {
	
	public static void main(String args[]){
		
		Solution so = new Solution();
		
		int [] nums = {1,2,3,4,5,6,7};
		
		
		so.rotate(nums, 3);
	}
	
	
    public void rotate(int[] nums, int k) {
    	int i;
    	
    	
    	k = k % nums.length;
    	
    	
    	int [] temp = new int[k];
    	
    	for (i = 0; i < k; i++){
    		temp[i] = nums[nums.length - k + i];
    		
    	}
    	
    	for (i = nums.length - k -1; i >= 0; i--){
    		nums[i + k] = nums[i];
   		
    	}
    	
    	for (i = 0; i < k; i++){
    		nums[i] = temp[i];
    		
    	}
    	
    	i = -1;
    	
        
    }	

}
