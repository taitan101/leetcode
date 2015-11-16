package lengthlastword;

public class Solution {

    public int lengthOfLastWord(String s) {
        int result;
        
        s = s.trim();
        
        result = s.lastIndexOf(' ');
        
        if (result == -1){
            return s.length();
            
        }else if (result == s.length() - 1){
            
            return 0;
        }else{
            
            return s.length() - result - 1;
        }
        
        
    }	
	
}
