package wordsearch2;

import java.util.ArrayList;
import java.util.List;


public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		Solution so = new Solution();
		
		List<String> results;
		
//		char [][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}, };
		char [][] board =
				{
				  {'o','a','a','n'},
				  {'e','t','a','e'},
				  {'i','h','k','r'},
				  {'i','f','l','v'}
				};

				
		String [] words = {"oath","pea","eat","rain"};
		
		results = so.findWords(board, words);
		
		
		for (i = 0; i < results.size(); i++){
			
			System.out.println(results.get(i));
			
		}
		
		
		//System.out.println(so.exist(board, "ABCCED"));
		//System.out.println(so.exist(board, "SEE"));		
		//System.out.println(so.exist(board, "ABCB"));

	}
	
	
    public List<String> findWords(char[][] board, String[] words) {
    	int i;
    	
    	List<String> results = new ArrayList<>();
    	
    	
    	for (i = 0; i < words.length; i++){
    		if (exist(board, words[i])){
    			results.add(words[i]);
    			
    		}
    		
    		
    	}
   	
    	
    	
    	return results;
    }
	
	
    public boolean exist(char[][] board, String word) {
    	int i;
    	int j;
    	
    	boolean [][] used = new boolean[board.length][board[0].length];
    	boolean result;
    	
    	
    	for (i = 0; i < board.length; i++){
    		for (j = 0; j < board[0].length; j++){
    			
    			if (word.charAt(0) == board[i][j]){
    				
    				used[i][j] = true;
    				
    				result = walk(board, word, used, i, j, 1);
    				
    				used[i][j] = false;
    				
    				if (result){
    					return true;
    					
    				}
		
    			
    			
    			
    			}
    		}
    		
    		
    	}
    	
    	return false;

    }
    
    private boolean walk(char[][] board, String word, boolean[][] used, int x, int y, int index){
    	
    	//System.out.println(index + "=>" + x + ", " + y);
    	
    	if (index == word.length()){
    		return true;
    	}
    	
    	boolean result;
    	
    	
    	if (x > 0 && !used[x-1][y] && word.charAt(index) == board[x-1][y]){
    		used[x-1][y] = true;
    		
    		result = walk(board, word, used, x - 1, y, index + 1);
    		
    		
    		used[x-1][y] = false;
    		if (result){
    			return true;
    		}
 		
    	}
    	
    	if (y > 0 && !used[x][y-1] && word.charAt(index) == board[x][y-1]){
    		used[x][y-1] = true;
    		
    		result = walk(board, word, used, x, y-1, index + 1);
    		

    		
    		used[x][y-1] = false;
 		
    		if (result){
    			return true;
    		}
    	}   
    	
    	
    	if (x <= board.length - 2 && !used[x+1][y] && word.charAt(index) == board[x+1][y]){
    		used[x+1][y] = true;
    		
    		result = walk(board, word, used, x + 1, y, index + 1);
    		
    		
    		used[x+1][y] = false;
    		
    		if (result){
    			return true;
    		}
 		
    	}
    	
    	if (y <= board[0].length - 2 && !used[x][y+1] && word.charAt(index) == board[x][y+1]){
    		used[x][y+1] = true;
    		
    		result = walk(board, word, used, x, y+1, index + 1);
    		
    		
    		used[x][y+1] = false;
    		
    		if (result){
    			return true;
    		}
 		
    	}    	
    	
    	
    	
    	
    	
    	
    	
    	
    	return false;
    
    }	

}
