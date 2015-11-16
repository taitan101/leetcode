package lca2;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}	

public class Solution {
	
	
	
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if (root == null){
            return null;
        }
        
        Stack<Boolean> stack1 = new Stack<>();
        Stack<Boolean> stack2 = new Stack<>();
        
        
        search(p, q);

        return null;
        
        
    }
    
    public boolean search(TreeNode root, TreeNode query){
    	if (root == null){
    		return false;
    	}else if (root == query){
    		return true;
    	}else{
    		return search(root.left, query) || search(root.right, query);
    	}
   	
    }
    
    public boolean rec(TreeNode root, TreeNode query, Stack<Boolean> stack) {
        if (root.val == query.val){
            return true;
        }
        
        
        if (root.left != null){
            stack.push(false);
            if (rec(root.left, query, stack)){
                return true;
            }
            stack.pop();
        }
        
        if (root.right != null){
            stack.push(true);
            if (rec(root.right, query, stack)){
                return true;
            }
            stack.pop();
        }
        
        return false;
        
        
        
    }	
	

}
