package distinctsubseq;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	
    public int numDistinct(String s, String t) {

    	int i;
    	int j;
    	int ls;
    	int lt;
    	int [][] dp;
    	
    	ls = s.length();
    	lt = t.length();
    	
    	if (ls < lt){
    		return 0;
    	}
    	
    	dp = new int[lt + 1][ls + 1] ;
    	
    	for (i = 0; i <= lt; i++){
    		dp[i][0] = 0;
    		
    	}
    	
    	for (i = 0; i <= ls; i++){
    		dp[0][i] = 1;
    		
    	}
    	
    	for (i = 1; i <= lt; i++){
    		for (j = 1; j <= ls; j++){
    			if (t.charAt(i - 1) == s.charAt(j - 1)){
    				
    				dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
    				
    			}else{
    				dp[i][j] = dp[i][j-1];
    				
    			}
   			
    		}
    	}
    	
    	
    	
   
    	
    	
    	
    	
    	
    	return dp[lt][ls];
    }
    
    
    private int count2(HashMap<Character, ArrayList<Integer>> hm, String t, int pos, int [] pre, int thre, int bound){
    	int result;
    	int i;
    	int current;
    	int tmp;
    	
    	ArrayList<Integer> list;
    	
    	if (thre == bound ){
    		return 0;
    	}

   	
    	list = hm.get(t.charAt(pos));
    	
	
    	
    	result = 0;
    	


    	for (i = 0; i < list.size(); i++){
    		current = list.get(i);
    		
    		if (current > thre){
    			break;
    		}
    		
    		
    	}
    	
    	pre[pos] = i;
    	if (pos == t.length() - 1){
    		
    		return list.size() - i;
    	}
    	    	
    	

    	
    	

    	

    	for (; i < list.size(); i++){
    		
    		current = list.get(i);
    		
    		//tmp = pre[pos+1];
    		
 			result += count2(hm, t, pos + 1, pre, current, bound);
 			
 			//pre[pos+1] = tmp;
		
    		
    	}

    	
    	
    	
    	
    	
    	
    	
    	return result;
    }
    
    
    private int count(String s, String t, int index, int pos, int [] last){
    	
    	int i;
    	int result;
    	int bound;
    	
    	result = 0;
    	bound = s.length() - t.length() + 1 + pos;
    	
    	if (pos == t.length() - 1){
    		
  		
    		
    		
    		return last[index];
    		
    	}
    	
    	
    	for (i = index; i < bound; i++){
    		
    		if (s.charAt(i) == t.charAt(pos)){
    			/*
    			if (pre[pos] == i){
    				result++;
    			}else{
    				pre[pos] = i;
        			result += count(s, t, i + 1, pos + 1, pre);
    				
    			}
    			*/

    			result += count(s, t, i + 1, pos + 1, last);
    		}
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    	return result;
    }
    

	private int composite(char[] str, String t, int index, int delete) {
		
		int i;
		char backup;
		int result = 0;
		
		if (delete == 0){
		
			return check(str, t);
			
		}
		
		
		for (i = index; i < str.length; i++){
			backup = str[i];
			
			str[i] = '*';
			
			result += composite(str, t, i + 1, delete -1 );
			
			str[i] = backup;
			
			
		}
		
		
		return result;
		
	}

	private int check(char[] str, String t) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int len = t.length();
		
		x = 0;
		y = 0;
		
		
		while (y < len){
			while (str[x] == '*'){
				x++;
			}
			
			if (str[x] != t.charAt(y)){
				return 0;
			}
			x++;
			y++;
			
		}
		
	
		
		
		
		return 1;
	}	
	

}
