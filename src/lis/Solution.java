package lis;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if (nums.length == 0){
            return 0;
        }
        
        int i;
        int j;
        int max;
        int min;
        int [] results = new int[nums.length];
        int [] mins = new int[nums.length];
        
        for (i = 0; i < nums.length; i++){
            results[i] = 1;
            mins[i] = nums[i];
        }
        

        max = results[0];
        
       
        for (i = 1; i < nums.length; i++){
            max = results[i];
            min = mins[i];
            for (j = 0; j < i; j++){
                if (nums[i] > mins[j]){
                	if (results[j] + 1 > max){
                		max = results[j] + 1;
                		min = nums[i];
                	}else if (results[j] + 1 == max && nums[i] < min){
                  		min = nums[i];
                	}
                }else{
                	if (results[j]> max){
                		max = results[j];
                		min = mins[j];
                	}
                	
                	

                }
            }
            
            results[i] = max;
            mins[i] = min;
        }
        
        return max;
        
        
    }
}
