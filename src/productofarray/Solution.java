package productofarray;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i;
        
        int value;
        
        int [] results = new int[nums.length];
        
        value = nums[nums.length - 1];
        
        results[0] = nums[0];
        
        for (i = 1; i < nums.length; i++){
            results[i] = nums[i] * results[i - 1];
        }
        
        value = 1;
        for (i = nums.length - 1; i > 0; i--){
            results[i] = results[i-1] * value;
            value *= nums[i];
        }
        
        results[0] = value;
        
        
        return results;
        
        
    }	
	

}
