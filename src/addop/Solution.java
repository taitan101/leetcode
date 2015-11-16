package addop;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
    public List<String> addOperators(String num, int target) {
        List<String> list = new ArrayList<String>();
        char [] operators = new char[num.length()];
        
        
        if (num.length() == 0){
            return list;
        }
        
        
        rec(num, 1, num.charAt(0) - '0', target, list, operators);
        
        
        return list;
        
    }
    
    
    public void rec(String num, int index, int current, int target, List<String> list, char [] operators){
        if (num.length() == index){
            if (current == target){
                
                list.add(gen(num, operators));                
            }
            
            return;
        }
        
        operators[index] = '+';
        rec(num, index + 1, current + (num.charAt(index) - '0'), target, list, operators);
        
        operators[index] = '-';
        
        rec(num, index + 1, current - (num.charAt(index) - '0'), target, list, operators);        
        
        operators[index] = '*'; 
        
        rec(num, index + 1, current * (num.charAt(index) - '0'), target, list, operators);        
        
        

        
        
    }
    
    
    public String gen(String num, char [] operators){
        StringBuilder sb = new StringBuilder();
        int i;
        
        sb.append(num.charAt(0));
        
        
        for (i = 1; i < num.length(); i++){
            sb.append(operators[i]);
            sb.append(num.charAt(i));
            
            
        }
        
        
        
        
        return sb.toString();
        
        
        
    }	

}
