package permute;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int [] array = new int[nums.length];
        boolean [] used = new boolean [nums.length];
        
        
        
        rec(0, nums, used, lists, array);
        
        
        return lists;
        
    }
    
    private void rec(int pos, int [] nums, boolean [] used, List<List<Integer>> lists, int [] array){
        
        if (pos == nums.length){
            
            lists.add(createList(array));
        }
        
        
        int i;
        for (i = 0; i < nums.length; i++){
            
            if (!used[i]){
            
            	array[pos] = (nums[i]);
                used[i] = true;
                rec(pos + 1, nums, used, lists, array);
                used[i] = false;

            }
            
        }
        
        
        
        
        
        
    }
    
    private List<Integer> createList(int [] array){
    	int i;
    	List<Integer> list = new ArrayList<Integer>();
    	for (i = 0; i < array.length; i++){
    		list.add(array[i]);
    	}
    	
    	return list;
    	
    }

}
