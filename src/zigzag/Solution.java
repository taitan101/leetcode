package zigzag;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Queue<TreeNode> next;
        Queue<TreeNode> cur;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        boolean headingRight; 
        
        TreeNode tn;
        
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        
        cur = new LinkedList<TreeNode>();
        
        
        if (root != null){
            cur.add(root);


        }
        
        headingRight = true;
        
        while (!cur.isEmpty()){
            list = new ArrayList<Integer>();
            
            if (headingRight){
            
            
            
            	next = new LinkedList<TreeNode>();
            
            	while (!cur.isEmpty()){
            
                	tn = cur.poll();
                	list.add(tn.val);
                
                	if (tn.right != null){
                    	next.add(tn.right);
                	}
                	if (tn.left != null){
                    	next.add(tn.left);
                	}
            	}
            	lists.add(list);
            
            	cur = next;
            }else{
            	
            	
            	
            	
            }

        }
        
        
        
        
        
        return lists;
        
        
        
        
    }	

}
