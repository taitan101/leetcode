package postorder;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	
	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }		
	
	
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode current;
        
        if (root == null){
            return list;
        }
        
        stack.push(root);
        
        
        while (!stack.isEmpty()){
            current = stack.pop();
            
            if (current == null){
                current = stack.pop();
                
                list.add(current.val);
                continue;
            }
            

            stack.push(current);
            stack.push(null);
            

            if (current.right != null){
                stack.push(current.right);
            }
            

            if (current.left != null){
                stack.push(current.left);
                    
            }

        }

        
        return list;
    }	

}
