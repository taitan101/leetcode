package wordladder;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution {
	
    public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
    	
    	if (beginWord.equals(endWord)){
    		return 0;
    	}
    	
    	int level;
    	String str;
    	String next;
    	
        Queue<String> queue = new LinkedList<>();
        Iterator<String> iter; 
        
        Set<String> visisted = new HashSet<>();
        
        queue.add(beginWord);
        queue.add(null);
        level = 1;
        
        visisted.add(beginWord);
        
        while (!queue.isEmpty()){
        	str = queue.poll();
        	
        	
        	
        	
        	
        	if (str != null){
        		
        		if (match(str, endWord)){
        			return level + 1;
        		}
        		
        		
        		iter = wordDict.iterator();
 
        		
        		while (iter.hasNext()){
        			
        			next = iter.next();
        			
        			
        			if (!visisted.contains(next) && match(str, next)){
        				
        				queue.add(next);
        				
        				visisted.add(next);
        				
        			}
       			
        		}
        		


       		
        		
        		
        	}else{
        		level++;
        		
        		if (!queue.isEmpty()){
            		queue.add(null);
        		}
        		

        		
        	}
        	
        	
        	
        	
        	
        	
        	
        }
        

        
        
        
        
        
        return 0;
    }
    
    
    private boolean match(String s1, String s2){
    	int i;
    	int count;
    	
    	count = 0;
    	
    	for (i = 0; i < s1.length(); i++){
    		if (s1.charAt(i) == s2.charAt(i)){
    			count++;
    		}
    	}
    	
    	return count >= s1.length() - 1;
    	
    	
    	
    }
	

}
