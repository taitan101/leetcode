package RectArea;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int area;
    	
    	area = (C-A) * (D-B) + (G-E) * (H-F);
    	
    	return area - overlappedArea(A, B, C, D, E, F, G, H);
    	
        
    }
    
    
    private int overlappedArea(int A, int B, int C, int D, int E, int F, int G, int H) {
    	int blx;
    	int bly;
    	int urx;
    	int ury;
    	
    	if (E >= C || A >= G || F >= D || H <= B){
    		return 0;
    		
    	}
    	
    	blx = Math.max(A, E);
    	bly = Math.max(B, F);
    	
    	urx = Math.min(C, G);
    	ury = Math.min(D, H);
    	
    	
    	
    	
    	
    	
    	return (blx - urx) * (bly - ury);
    }

}
