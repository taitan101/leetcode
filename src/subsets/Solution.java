package subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        boolean [] flags = new boolean[nums.length];
        
        Arrays.sort(nums);
        
        rec(0, nums, lists, flags);
        return lists;
        
    }
    
    private void rec(int pos, int [] nums, List<List<Integer>> lists, boolean [] flags){
        if (pos == nums.length){
            lists.add(createList(nums, flags));
            return;
        }
        
        
        flags[pos] = false;
        rec(pos + 1, nums, lists, flags);
        flags[pos] = true;
        rec(pos + 1, nums, lists, flags);
        
        
    }
    
    private List<Integer> createList(int [] nums, boolean [] flags){
    	int i;
    	List<Integer> list = new ArrayList<Integer>();
    	for (i = 0; i < nums.length; i++){
    	    
    	    if (flags[i]){
    		    list.add(nums[i]);
    	    }
    	}
    	
    	return list;
    	
    }	
	
}
