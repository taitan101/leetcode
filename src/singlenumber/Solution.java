package singlenumber;

public class Solution {
	
    public int singleNumber(int[] nums) {
        
        int i;
        
        
        for (i = 1; i < nums.length; i++){
            nums[0] ^= nums[i];
            
        }
        
        return nums[0];
        
    }	

}
