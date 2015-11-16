package addbinary;

public class Solution {

    public String addBinary(String a, String b) {
        int s1;
        int s2;
        int cin;
        int sum;
        StringBuffer sb = new StringBuffer();
        
        s1 = a.length() - 1;
        s2 = b.length() - 1;
        cin = 0;
        
        while (s1 >= 0 && s2 >= 0){
            sum = 0;
            
            sum += cin;
            
            if (a.charAt(s1) == '1'){
                sum++;
            }
            
            if (b.charAt(s2) == '1'){
                sum++;
            }
            
            if (sum == 0 || sum == 2){
                sb.append('0');
            }else{
                sb.append('1');
            }
            
            if (sum >= 2){
                cin = 1;
            }else{
                cin = 0;
            }
            
            s1--;
            s2--;
            
        }
        
        while (s1 >= 0){
            sum = 0;
            
            sum += cin;
            
            if (a.charAt(s1) == '1'){
                sum++;
            }
            

            if (sum == 0 || sum == 2){
                sb.append('0');
            }else{
                sb.append('1');
            }
            
            if (sum >= 2){
                cin = 1;
            }else{
                cin = 0;
            }
           
            s1--;
         }
         
         
         while (s2 >= 0){
            sum = 0;
            
            sum += cin;
            

            if (b.charAt(s2) == '1'){
                sum++;
            }
            
            if (sum == 0 || sum == 2){
                sb.append('0');
            }else{
                sb.append('1');
            }
            
            if (sum >= 2){
                cin = 1;
            }else{
                cin = 0;
            }
            
            s2--;
            
        }
         
        if (cin == 1){
        	sb.append('1');
        }
        
        
        return sb.reverse().toString();
        
        
        
    }
    
    class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    }
    
    public int maxDepth(TreeNode root) {
        
        return depth(root, 0);
        
    }
    
    
    private int depth(TreeNode root, int dep){
        if (root == null){
            
            return dep;
            
        }else{
            
            return Math.max(depth(root.left, dep + 1), depth(root.right, dep + 1));
            
            
        }
        
        
        
        
        
    }
    
    public int[] plusOne(int[] digits) {
        int i;
        
        int cin;
        
        int sum;
        
        int [] results;
        
        cin = 0;
        
        for (i = digits.length - 1; i >= 0; i--){
            sum = digits[i] + cin;
            
            if (sum >= 10){
                cin = 1;
                
                sum -= 10;
            }else{
                cin = 0;
            }
            
            digits[i] = sum;
            
            
        }
        
        if (cin == 1){
            
            results = new int[digits.length + 1]; 
            
            results[0] = 1;
            
            
            for (i = 0; i < digits.length; i++){
                results[i+1] = digits[i];
                
            }
            
            
            
            
            
            
            
        }else{
            results = digits;
            
        }
        
        
        return results;
        
        
        
        
        
        
    }    
	
	
}
