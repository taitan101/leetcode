package summaryrange;

import java.util.ArrayList;
import java.util.List;


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution so = new Solution();
		
		int [] nums = {0,1,2,4,5,7};
		
		so.summaryRanges(nums);
		
	}
	
	
    public List<String> summaryRanges(int[] nums) {
    	
    	int i;
    	int frontend;
    	int backend;
    	
    	ArrayList<String> al = new  ArrayList<>();
    	
    	
    	i = 0;
    	while (i < nums.length){
    	
    	
    		frontend = nums[i];
    		i++;
    		
    		while (i < nums.length){
    			if ((nums[i-1] + 1) != nums[i]){
    				break;
    			}
    			
    			
    			i++;
    		}
    		
    		
    		if (frontend != nums[i-1]){
    			al.add(frontend + "->" + nums[i-1]);
    			
    		}else{
    			
    			al.add(frontend + "");
    		}


    		
    		
    	}
    	
    	
    	
    	
    	return al;
        
    }

}
