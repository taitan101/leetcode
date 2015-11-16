package interleaving;

import java.util.Stack;

public class Solution {
	

	
    public boolean isInterleave(String s1, String s2, String s3) {
        
    	
        int i;
        int j;
        
        if (s1.length() + s2.length() != s3.length()){
            return false;
        }
        
        boolean [][] mat = new boolean[s1.length() + 1][s2.length() + 1];
        
        mat[0][0]= true;
        
        for (i = 1; i <= s1.length(); i++){
            if (mat[i-1][0]){
                if (s1.charAt(i - 1) == s3.charAt(i - 1)){
                    mat[i][0] = true;
                }
            }else{
                break;
            }
        }
        
        for (i = 1; i <= s2.length(); i++){
            if (mat[0][i - 1]){
                if (s2.charAt(i - 1) == s3.charAt(i - 1)){
                    mat[0][i] = true;
                }
            }else{
                break;
            }
        }
        
        
        for (i = 1; i <= s1.length(); i++){
            for (j = 1; j <= s2.length(); j++){
                if (mat[i - 1][j]){
                    if (s1.charAt(i - 1) == s3.charAt(i + j - 1)){
                        mat[i][j] = true;
                    }
                    
                    
                    
                }
                
                
                if (mat[i][j - 1]){
                    if (s2.charAt(j - 1) == s3.charAt(i + j - 1)){
                        mat[i][j] = true;
                    }                    
                    
                    
                }
                                
                
                
            }
        }
    	
        return mat[s1.length()][s2.length()];
    	
    	

    }	
	

}
