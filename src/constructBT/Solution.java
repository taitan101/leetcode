package constructBT;

public class Solution {
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        
        return rec(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
        
    }
    
    
    public TreeNode rec(int[] inorder, int[] postorder, int inMin, int inMax, int postMin, int postMax) {
        
        if (inMin == inMax){
            return new TreeNode(inorder[inMax]);
        }else if (inMin > inMax){
            return null;
            
        }
        
        
        
        int val;
        int i;
        
        
        val = postorder[postMax];
        
        for (i = inMin; i <= inMax; i++){
            if (val == inorder[i]){
                break;
            }
        }
        
        TreeNode tn = new TreeNode(val);
        
        tn.left = rec(inorder, postorder, inMin, i - 1, postMin, postMin +i-inMin-1);
        tn.right = rec(inorder, postorder, i + 1, inMax, postMax - inMax + i, postMax - 1);
    
        
        return tn;

    }
}
