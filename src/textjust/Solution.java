package textjust;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<String> fullJustify(String[] words, int maxWidth) {
        int s;
        int t;
        int space;
        int sum;
        int white;
        int extra;
        int i;
        int j;
        
        
        
        
  
        
        
        List<String> list = new ArrayList<String>();
        StringBuilder sb;
        
        if (maxWidth == 0){
        	
        	if (words.length > 0){
        		
        		list.add("");
        	}
       	        	
        	return list;
        }
        
        
        

        t = -1;
        
        while (true){
            space = 0;
            
            t++;
            s = t;
            
            while (t <  words.length && space + words[t].length() <= maxWidth){
                space += words[t].length();
                space++;
                t++;
            }
            t--;
            
            
            
            if (t == words.length - 1){
            	sb = new StringBuilder();
        	 

            	sum = 0;
            	
            	
            	
            	
            	sb.append(words[s]);
            	
            	sum += words[s].length();
            	
            	
            	for (i = s + 1; i <= t; i++){
            		sb.append(' ');
            		sb.append(words[i]);
                
            		
                
            		sum += words[i].length();
            		sum++;
               
            	}            	
        	
        
            	for (j = 0; j < maxWidth - sum; j++){
            		sb.append(' ');
            	}
            	list.add(sb.toString());
            	break;
        	
        	
            }else if (s == t){
                sb = new StringBuilder();
                
                
                sb.append(words[s]);
                
                
                for (j = 0; j < maxWidth - words[s].length(); j++){
                    sb.append(' ');
                } 

                list.add(sb.toString());
            	
            	continue;
            	
            	
            	
            }
            
            
            
            sum = 0;
            for (i = s; i <= t; i++){
                sum += words[i].length();
            }
            
            white = (maxWidth - sum) / (t - s);
            extra = (maxWidth - sum) % (t - s);
            
            
            sb = new StringBuilder();
            
            
            sb.append(words[s]);
            
            if (extra > 0){
            	sb.append(' ');
            	extra--;
            	
            }
            
            for (j = 0; j < white; j++){
                sb.append(' ');
            }
            
            
            for (i = s + 1; i <= t - 1; i++){
            	sb.append(words[i]);
                
            	if (extra > 0){
                	sb.append(' ');
                	extra--;
                	
                }
                
                for (j = 0; j < white; j++){
                    sb.append(' ');
                    
                }
            }
            
            sb.append(words[t]);
            
            
            
            
            list.add(sb.toString());
            
            
            
        }
        
        
        return list;
        
        
        
        
    }	

}
