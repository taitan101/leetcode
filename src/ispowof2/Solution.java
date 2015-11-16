package ispowof2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution so = new Solution();
		int i;
		
		
		for (i = 0; i< 1000; i++ ){
			System.out.println(i + "->" + so.isPowerOfTwo(i));
			
			
		}
		
		

	}

    public boolean isPowerOfTwo(int n) {
        
        return (n > 0 && ((n & (n -1)) == 0));
        
    }	
	
}
