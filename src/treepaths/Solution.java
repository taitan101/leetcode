package treepaths;

import java.util.ArrayList;
import java.util.List;




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        List<Integer> elements = new ArrayList<Integer>();
        
        
        if (root != null){
            
            
            path(root, list, elements, 0);
        }
        
        return list;
        

    }
    
    
    private void path(TreeNode root, List<String> list, List<Integer> elements, int depth){
        
        if (root.left == null && root.right == null){
        	
            if (depth == elements.size()){
                elements.add(root.val);
            }else{
                
                elements.set(depth, root.val);
            }        	
        	
            addPath(list, elements, depth);
            
        }
        
        
        if (root.left != null){
            
            
            if (depth == elements.size()){
                elements.add(root.val);
            }else{
                
                elements.set(depth, root.val);
            }
            
            
            
            path(root.left, list, elements, depth + 1);
            
        }
        
        
        if (root.right != null){
            
            
            if (depth == elements.size()){
                elements.add(root.val);
            }else{
                
                elements.set(depth, root.val);
            }
            
            
            
            path(root.right, list, elements, depth + 1);
            
        }        


    }
    
    private void addPath(List<String> list, List<Integer> elements, int depth){
        
        int i;
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(elements.get(0));
        
        
        for (i = 1; i <= depth; i++){
            
            sb.append("->");
            sb.append(elements.get(i));
        }
        
        
        list.add(sb.toString());
        
    }	

}
