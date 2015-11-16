package triangle;

import java.util.List;

public class Solution {

	public Solution() {
		// TODO Auto-generated constructor stub
	}
	
    public int minimumTotal(List<List<Integer>> triangle) {

        int i;
        int j;
        int k;
        List<Integer> list;
        List<Integer> list2;

        int m = triangle.size();
        int [][] mat = new int[m][m];
        

        
        if (triangle.size() == 0){
            return 0;
        }
        
        
        list = triangle.get(m - 1);
        for (i = 0; i < m; i++){
            mat[0][i] = list.get(i);
        }
        
        

        
        for (i = 1; i < m; i++){
            //list = triangle.get(m - i);
            list2 = triangle.get(m - i - 1);
            for (j = i, k = 0; j < m; j++, k++){
                //mat[i][j] = Math.min(list.get(k), list.get(k+1)) + list2.get(k);
            	mat[i][j] = Math.min(mat[i-1][j-1], mat[i-1][j]) + list2.get(k);
                
            }
            
            
            
        }
        
        
        return mat[m-1][m-1];
        
        
    }	
    
   

}
