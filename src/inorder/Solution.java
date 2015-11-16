package inorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }	

    public List<Integer> inorderTraversal(TreeNode root) {
    	ArrayList<Integer> al = new ArrayList<>();
    	
    	
    	
    	inorder(root, al);
    	
    	
    	
    	
        return al;
    }
    
    
    private void inorder(TreeNode root, ArrayList<Integer> al){
    	
    	if (root != null){
    		inorder(root.left, al);
    		
    		al.add(root.val);
    		
    		inorder(root.right, al);
    		
    	}
    	
    	
    	
    }
    
    
	
}
