package jumpgame2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution so = new Solution();
		
		int [] nums = {2,3,1,1,4};
		
		
		System.out.println(so.jump(nums));
		
		
	}
	
	
    public int jump(int[] nums) {
    	
    	int i;
    	int j;

    	int [] counts = new int[nums.length];
    	
    	counts[0] = 0;
    	
    	for (i = 1; i < nums.length; i++){
    		counts[i] = Integer.MAX_VALUE-1;
    		
    	}
    	
    	
    	for (i = 1; i < nums.length; i++){
    		for (j = 0; j < i; j++){
    			if (nums[j] + j >= nums[i]){
    				counts[i] = Math.min(counts[i], counts[j] + 1);
    				
    				
    			}
    			
    			
    		}
   		
    	}
    	
    	
    	
    	return counts[counts.length - 1];
    }
    
    


}
