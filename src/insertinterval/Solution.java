package insertinterval;

import java.util.ArrayList;
import java.util.List;


 class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }

public class Solution {
	
	
	
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	int i;
    	int j;
    	int k;
    	i = 0;
    	Interval cur;
    	Interval pre;
    	List<Interval> results = new ArrayList<Interval>();
    	
    	
    	
    	while (i < intervals.size()){
    		cur = intervals.get(i);
    		
    		if (newInterval.start < cur.start){
    			break;
    		}
    		i++;
    	}
    	
    	
    	if (i == 0){
    		cur = intervals.get(0);
    		cur.start = newInterval.start;
    		pre = cur;
    		
    	}else if (i == intervals.size()){
    		cur = intervals.get(i - 1);
    		
    		if (newInterval.start > cur.end){
    			intervals.add(newInterval);
    			return intervals;
    		}else{
    			cur.end = newInterval.end;
    			return intervals;
    		}
    		
    	}else{
    		
    		cur = intervals.get(i - 1);
    		
    		if (newInterval.start > cur.end){
    			cur = intervals.get(i);
    			cur.start = newInterval.start;
    			cur.end = Math.max(cur.end, newInterval.end);
    			pre = cur;
    			

    		}else{
    			cur.end = Math.max(cur.end, newInterval.end);
    			pre = cur;
    			
    			i--;
    			
    		}
    		
    		
    		
    	}
    		
    	
    	for (k = 0; k < i; k++){
    		results.add(intervals.get(k));
    	}
    		
    	j = i + 1;
    	
    	while (j < intervals.size()){
    		cur = intervals.get(j);
    		
    		if (pre.end < cur.end){
    			break;
    		}
    		
    		
    	}
    	
    	
    	if (i == intervals.size()){
    		return results;
    	}else{
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    	}
    	

    	j = intervals.size() - 1;
    	
    	while (j >= 0){
    		cur = intervals.get(j);
    		
    		    		
    		if (newInterval.end < cur.start){
    			break;
    		}
    		j--;
    	}
    	    	
    	
    	
    	
    	for (k = 0; k < i; k++){
    		results.add(intervals.get(k));
    	}
    	

     	cur = intervals.get(i);
    	if (newInterval.start > cur.end){
    		//not overlapped
       
    		results.add(intervals.get(i));

        	
        	
       	
    		cur = intervals.get(j);
        	
        	
    		if (newInterval.end >= cur.start){
    			
    			newInterval.end = cur.end;
    			
    			results.add(newInterval);
    			
    			
    			for (k = j + 1; k < intervals.size(); k++){
    				results.add(intervals.get(k));
    				
    			}
    			
    			
    			
    		}else{
    			
    			results.add(newInterval);
    			
    			
    			for (k = j; k < intervals.size(); k++){
    				results.add(intervals.get(k));
    				
    			}    			
    			
    		}
    		
    	
    	}else{

    		newInterval.start = cur.start;
    		
    		cur = intervals.get(j);
    		
    		if (newInterval.end >= cur.start){
    			
    			newInterval.end = cur.end;
    			
    			results.add(newInterval);
    			
    			
    			for (k = j + 1; k < intervals.size(); k++){
    				results.add(intervals.get(k));
    				
    			}
    			
    			
    			
    		}else{
    			
    			results.add(newInterval);
    			
    			
    			for (k = j; k < intervals.size(); k++){
    				results.add(intervals.get(k));
    				
    			}    			
    			
    		}    		
	
    		
    		
    	}
  	
    	
    	
    	
    	return intervals;
        
    }	
	

}
