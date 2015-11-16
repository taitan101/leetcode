package lca;



public class Solution {
	
	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }	
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        TreeNode min;
        TreeNode max;
        
        if (root == null){
            return null;
        }else{
            
            if (p.val < q.val){
                min = p;
                max = q;
            }else{
                min = q;
                max = p;
            }
            
            
            
            return rec(root, min, max);
        }
        
        
    }
    
    public TreeNode rec(TreeNode root, TreeNode min, TreeNode max) {
        if (root == min || root == max){
            return root;
        }
        
        
        if (root.val < max.val && root.val > min.val){
            return root;
        }
        
        
        if (root.val < min.val){
            return rec(root.right, min, max);
        }else{
            return rec(root.left, min, max);
        }
        
        
        
    }	

}
