package rightside;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	
	 
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}

	
	
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> list = new ArrayList<>();
    	
    	if (root != null){
    		dfs(root, list, 1);
    	}
    	
    	
    	
    	return list;
    	
    	
    }



	private void dfs(TreeNode root, List<Integer> list, int depth) {
		if (list.size() < depth){
			list.add(root.val);
		}
		
		if (root.right != null){
			dfs(root.right, list, depth + 1);
		}
		
		if (root.left != null){
			dfs(root.left, list, depth + 1);
		}
		
		
		
	}
	
	

}
