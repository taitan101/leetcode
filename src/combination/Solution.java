package combination;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();

        int [] array = new int[k];
        
        
        rec(n, k, lists, array, 1, 0);
        
        System.out.println(lists.size());
        
        return lists;
        
        
    }
    
    
    private void rec(int n, int k, List<List<Integer>> lists, int [] array, int index, int pos){
        if (pos == k){
            lists.add(createList(array));            
            
            return;
        }
        
        int i;
        
        
        for (i = index; i <= n; i++){

                
                array[pos] = i;
                rec(n, k, lists, array, i + 1, pos+1);

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
