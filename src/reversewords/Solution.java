package reversewords;

public class Solution {
    public String reverseWords(String s) {
        int i;
        String [] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        if (splits.length == 0){
        	return "";
        }
        
        
        for (i = splits.length - 1; i >= 0; i--){
            if (!splits[i].equals("")){
            
                
                sb.append(splits[i]);
                break;
            }
            
        }
        
        
        for (i = splits.length - 2; i >= 0; i--){
            if (!splits[i].equals("")){
            
                sb.append(' ');
                sb.append(splits[i]);
            }
            
        }
        
        return sb.toString();
        
        
        
        
    }

}
