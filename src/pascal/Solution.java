package pascal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<List<Integer>> generate(int numRows) {
        int i;
        int j;
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> pre;
        
        if (numRows == 0){
            return lists;
        }
        
        list.add(1);
        lists.add(list);
        
         for (i = 1; i < numRows; i++){
            list = new ArrayList<Integer>();
            pre = lists.get(i - 1);
            
            list.add(1);
            for (j = 1; j < i; j++){
                
                list.add(pre.get(j) + pre.get(j - 1));
                
            }
            list.add(1);
            
            
            lists.add(list);
            
            
            
        }
        
        
        return lists;
        
        
        
        
        
        
    }	

}
