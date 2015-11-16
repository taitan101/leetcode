package slidingwindowmax;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i;
        int j;
        int max;
        
        if (nums.length == 0){
            return nums;
        }else if (nums.length < k){
            k = nums.length;
        }
        
        int [] results = new int[nums.length - k + 1];
        
        
        for (i = 0; i < nums.length - k + 1; i++){
            
            max = nums[i];
            for (j = 1; j < k; j++){
                max = Math.max(max, nums[i + j]);
                
                
                
                
            }
            results[i] = max;
            
            
        }
        
        
        return results;
        
    }

}
