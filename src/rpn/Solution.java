package rpn;

import java.util.Stack;

public class Solution {
	
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        int i;
        int val1;
        int val2;
        int result;
        
        
        for (i = 0; i < tokens.length; i++){
            if (tokens[i].equals("*")){
                val1 = Integer.parseInt(stack.pop());
                val2 = Integer.parseInt(stack.pop());
                result = val1 * val2;
                
                stack.push(String.valueOf(result));
                
                
            }else  if (tokens[i].equals("+")){
                val1 = Integer.parseInt(stack.pop());
                val2 = Integer.parseInt(stack.pop());
                result = val1 + val2;
                
                stack.push(String.valueOf(result));
                
                
            }else  if (tokens[i].equals("/")){
                val1 = Integer.parseInt(stack.pop());
                val2 = Integer.parseInt(stack.pop());
                result = val2 / val1;
                
                stack.push(String.valueOf(result));
                
                
            }else  if (tokens[i].equals("-")){
                val1 = Integer.parseInt(stack.pop());
                val2 = Integer.parseInt(stack.pop());
                result = val2 - val1;
                
                stack.push(String.valueOf(result));
                
                
            }else{
                stack.push(tokens[i]);
                
            }
        }
        
        
        return Integer.parseInt(stack.pop());
        
        
        
        
    }	

}
