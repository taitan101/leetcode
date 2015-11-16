package lettercombination;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
	
	
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hm = new HashMap<>();
        List<String> list = new ArrayList<String>();
        char [] word = new char[digits.length()];
        
        
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        
        
        rec(digits, 0, list, hm, word);
        
        return list;
        
    }
    
    private void rec(String digits, int index,  List<String> list, HashMap<Character, String> hm, char [] word){
        int i;
        String  str; 
        
        if (index == digits.length()){
            
            list.add(String.valueOf(word));
            
            return;
        }
        
        str = hm.get(digits.charAt(index));
        
        for (i = 0; i < str.length(); i++){
            
            word[index] = str.charAt(i);
            
            rec(digits, index + 1, list, hm, word);
            
        }

        
    }	

}
