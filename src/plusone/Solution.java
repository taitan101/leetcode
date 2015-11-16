package plusone;

public class Solution {
	
    public int[] plusOne(int[] digits) {
        int i;
        
        int cin;
        
        int sum;
        
        int [] results;
        
        cin = 0;
        
        for (i = digits.length - 1; i >= 0; i--){
            sum = digits[i] + cin;
            
            if (sum >= 10){
                cin = 1;
                
                sum -= 10;
            }else{
                cin = 0;
            }
            
            digits[i] = sum;
            
            
        }
        
        if (cin == 1){
            
            results = new int[digits.length + 1]; 
            
            results[0] = 1;
            
            
            for (i = 0; i < digits.length; i++){
                results[i+1] = digits[i];
                
            }
            
            
            
            
            
            
            
        }else{
            results = digits;
            
        }
        
        
        return results;
        
        
        
        
        
        
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pos;
        
        pos = m + n - 1;
        
        m--;
        n--;
        
        while (m >= 0 && n >= 0){
            if (nums1[m] > nums2[n]){
                nums1[pos] = nums1[m];
                m--;
                
            }else{
                nums1[pos] = nums2[n];
                n--;
            }
            
            pos--;
        }
        
        while (n >= 0){

            nums1[pos] = nums2[n];
            n--;
            pos--;
        }        
        
        
        
        
    }    

}
