package hindex;

import java.util.Arrays;

public class Solution {
	
    public int hIndex(int[] citations) {

        int h;
        Arrays.sort(citations);
        
        
        
        h = citations.length;
        if (citations[0] >= h){
            
            return h;
        }
        
        for (h = citations.length - 1; h > 0; h--){
            if (citations[citations.length - h] >= h){
                return h;
            }
            
            
            
            
        }
        

        return 0;
        
        
        
    }
    
    public int hIndex2(int[] citations) {
        int min;
        int max;
        int mid;
        
        int len = citations.length; 
        min = 0;
        max = len - 1;
        mid = (max + min) >> 1;
        
        while (min <= max){
            mid = (max + min) >> 1;
            
            if (citations[mid] > len - mid){
                
                
                max = mid - 1;
            }else if (citations[mid] < len - mid){
                
                min = mid + 1;
                
            }else{
                return len - mid;
            }
            
            
            
            
            
            
        }
        
        return len - mid;
        
        
        
    }    
	

}
