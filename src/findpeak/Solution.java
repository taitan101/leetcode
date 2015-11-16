package findpeak;

public class Solution {
	
    public int findPeakElement(int[] nums) {
        int i;
        
        if (nums.length == 1){
            return 0;
        }
        
        
        if (nums[0] > nums[1]){
            return 0;
        }
        
        
        for (i = 1; i < nums.length - 1; i++){
            
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        
        
        
        
        if (nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }
        
        return nums.length - 1;
        
        
    }	

}
