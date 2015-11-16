package anagram;

public class Solution {
	
    public boolean isAnagram(String s, String t) {
        int [] counts = new int[26];
        int i;
        int index;
        
        
        for (i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            
            
        }
        
        
        for (i = 0; i < t.length(); i++){
            
            index = t.charAt(i) - 'a';
            
            
            if (counts[index] < 1){
                return false;
            }
            
            counts[index]--;
            
            
        }
        
        
        
        return true;
        
        
        
        
        
        
    }	

}
