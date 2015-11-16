package removeelement;

public class Solution {
	
    public int removeElement(int[] nums, int val) {
        int i;
        int bound;
        int count;
        
        bound = nums.length - 1;
        count = 0;
        
        for (i = 0; i <= bound;){
            if (nums[i] == val){
            	if (nums[bound] != val){
            	
            	
            		nums[i] = nums[bound];
                	bound--;
                	count++;
                	i++;
            	}else{
                	bound--;
                	count++;
            		
            		
            	
            	}
            }
        }
        

        
        
        return nums.length - count;   
        
        
    }

}
