package sede;



public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if (root == null){
    		return "";
    	}else{
    		StringBuilder sb = new StringBuilder();

    		sb.append(root.val);
    		sb.append("<(");
    		sb.append(serialize(root.left));
    		sb.append(")");
    		sb.append(">(");
    		sb.append(serialize(root.right));
    		sb.append(")");
    		
    		return sb.toString();
    		
    		
    		
    	}
    	
    	
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return helper(data, 0 , data.length() - 1 );
    }
    
    
    public TreeNode helper(String data, int start, int end) {
    	if (end < start){
    		return null;
    		
    	}else{
    		int pos;
    		int counter;
    		int i;
    		pos = data.indexOf("<", start);
    		TreeNode root;
    		
    		if (pos == -1){
    			pos = data.indexOf(")", start);
    			root = new TreeNode(Integer.parseInt(data.substring(start, pos)));
        		return root;
    			
    		}
    		
    		
    		root = new TreeNode(Integer.parseInt(data.substring(start, pos)));
    		
    		counter = 1;
    		
    		for (i = pos + 1; i < end; i++){
    			if (data.charAt(i) == '<'){
    				counter++;
    			}else if (data.charAt(i) == '>'){
    				counter--;
    				
    				if (counter == 0){
    					break;
    				}
    				
    			}
    		}
    		
    		root.left = helper(data, pos + 2, i - 2);
    		root.right = helper(data, i + 2, end -1);    		
    		
    		
    		
    		return root;
    		
    		
    		
    		
    	}
    	
    	
        
    }
}
