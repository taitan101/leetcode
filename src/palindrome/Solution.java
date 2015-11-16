package palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        int min;
        int max;
        char ch1;
        char ch2;
        
        min = 0;
        max = s.length() - 1 ;
        
        
        
        
        while (true){
            while ( max > min && !Character.isLetterOrDigit(s.charAt(max))){
                max--;
            }
            
            while ( max > min && !Character.isLetterOrDigit(s.charAt(min))){
                min++;;
            }
            
            
            if (max <= min){
                break;
            }
            
            
            ch1 = Character.toLowerCase(s.charAt(max));
            ch2 = Character.toLowerCase(s.charAt(min));
            
            
            if (ch1 == ch2){
                max--;
                min++;
            }else{
                return false;
            }
            
            
            
        }
        
        
        
        return true;
        
        
        
        
        
    }
	
}
