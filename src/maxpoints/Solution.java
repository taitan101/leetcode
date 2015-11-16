package maxpoints;

import java.util.HashMap;
import java.util.Map;





class MutableInteger{
	private int value;
	
	public MutableInteger(int value){
		this.value = value;
	}
	
	public void increase(){
		value++;
	}
	
	public int getValue(){
		return value;
	}
	
}



class Point {
     int x;
     int y;
     Point() { x = 0; y = 0; }
     Point(int a, int b) { x = a; y = b; }
}

public class Solution {
	
    public int maxPoints(Point[] points) {
        int i;
        int j;
        int maxCount;
        int maxR;
        int repeat;
        double slope;
        MutableInteger mi;
        Map<Double,MutableInteger> map = new HashMap<>();
        
        if (points.length <= 2){
            return points.length;
        }
        
        maxCount = 1;
       
        
        for (i = 0; i < points.length; i++){
            map.clear();
            repeat = 0;
            maxR = 0;
            for (j = i + 1; j < points.length; j++){
                if (isRepeat(points[i], points[j])){
                    repeat++;
                    continue;
                }
                
                slope = slope(points[i], points[j]);
                
                
                mi = map.get(slope);
                
                if (mi == null){
                    map.put(slope, new MutableInteger(1));
                    maxR = Math.max(maxR, 1);
                }else{
                    mi.increase();
                    
                    maxR = Math.max(maxR, mi.getValue());
                    
                }
                

            }
            maxCount = Math.max(maxCount, maxR + repeat);
        }
        return maxCount + 1;
        
        
        
        
        
    }
    
    private boolean isRepeat(Point a, Point b){
    	
    	return a.x == b.x && a.y == b.y;
    	
    }
    
    private double slope(Point a, Point b){
    	int dx = a.x - b.x;
    	int dy = a.y - b.y;
    	
    	
    	if (dx == 0){
    		return Double.POSITIVE_INFINITY;
    	}else if (dy == 0){
    		return 0;
    	}else{
    		return (double)dy / dx;
    	}
    	
    	
    	
    	
    	
    	
    	
    
    }

}
