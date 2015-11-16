package permutationsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public String getPermutation(int n, int k) {
    	int i;
    	List<Character> list = new ArrayList<Character>(); 
    	StringBuilder sb = new StringBuilder();
    	
    	for (i = 1; i <= n; i++){
    		list.add((char)('0' + i));
    	}
    	
    	
    	perm(list, k - 1, sb);
    	
    	return sb.toString();
    	
    	
    }
    
    public void perm(List<Character> list, int k, StringBuilder sb){
    	
    	if (list.size() == 1){
    		sb.append(list.get(0));
    		return;
    	}
    	
    	int i;
    	int value;
    	int index;
    	
    	value = 1;
    	for (i = 2; i < list.size(); i++){
    		value *= i;
    		
    	}
    	
    	
    	index = k / value;
    	
    	sb.append(list.get(index));
    	list.remove(index);
    	
    	
    	k %= value;
    	
    	
    	perm(list, k, sb);
    	
  	
    	
    	
    	
    	
    	
    	
    }

}
