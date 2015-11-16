package nqueens;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution so = new Solution();

	}
	
    public List<List<String>> solveNQueens(int n) {
    	int i;
    	int j;
    	
    	List<List<String>> results = new ArrayList<List<String>>();
    	
    	char [][] board = new char[n][n];
    	
    	for (i = 0; i < n; i++){
    		for (j = 0; j < n; j++){
    			board[i][j] = '.';
    			
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
        return results;
    }
	
	

}
