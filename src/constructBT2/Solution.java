package constructBT2;

public class Solution {
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        
        return rec(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        
    }
    
    
    public TreeNode rec(int[] preorder, int[] inorder, int preMin, int preMax, int inMin, int inMax) {
        
        if (inMin == inMax){
            return new TreeNode(inorder[inMax]);
        }else if (inMin > inMax){
            return null;
            
        }
        
        
        
        int val;
        int i;
        
        
        val = preorder[preMin];
        
        for (i = inMin; i <= inMax; i++){
            if (val == inorder[i]){
                break;
            }
        }
        
        TreeNode tn = new TreeNode(val);
        
        tn.left = rec(preorder, inorder, inMin + 1, i, inMin, i - 1);
        tn.right = rec(preorder, inorder, preMax - inMax - i +1, preMax, i + 1, inMax);
    
        
        return tn;

    }
}
