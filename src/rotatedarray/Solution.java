package rotatedarray;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution so = new Solution();
		
		int [] nums = {4, 5, 6, 7, 0, 1, 2};
		
		//int [] nums = {5, 1, 3};
		
		//int [] nums = {4,5,6,7,8,1,2,3};
		
		//int [] nums = {8,1,2,3,4,5,6,7};
		
		int i;
		
		for (i = 0; i < 8; i++){
			
			System.out.println(so.search(nums, i));
		}
		
		System.out.println(so.search(nums, 5));
		
		//System.out.println(so.search(nums, 8));
		//System.out.println(so.search(nums, 6));
	}
	
	
    public int search(int[] nums, int target) {
    	
    	int min;
    	int max;
    	int mid;
    	
    	min = 0;
    	max = nums.length - 1;
    	
    	while (max - min > 4){
    		mid = (min + max) >> 1; 
    		
    		if (nums[mid] == target){
    			return mid;
    			
    		}else if (nums[mid] > nums[min]){
    			
    			
  		
    			if (target > nums[mid] || target < nums[min]){
    
    				min = mid + 1;    				
   
			
    			}else{
    				max = mid - 1;
    			
    			
    			}
    		}else{
    			
    			if (target < nums[min] && target > nums[mid]){
    				min = mid + 1; 

    			}else{

    				max = mid - 1;
    			}
    			
    			
    			
    			
    		}
    			
    	}
    	 
    	int i;
    	
    	for (i = min; i <= max; i++){
    		if (nums[i] == target){
    			return i;
    		}
    		
    	}
    	
    	return -1;
    	
   
    }

}
