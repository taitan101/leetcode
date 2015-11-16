package decodeways;

public class Solution {
    public int numDecodings(String s) {
        
        int i;
        int [] dp = new int[s.length()];
        char ch1;
        char ch2;
    	
        if (s.length() == 0){
        	return 0;
        }
        


        
        
        ch1 = s.charAt(0);
        
        
        if (ch1 >= '1' && ch1 <= '9'){
            dp[0] = 1;
        }else{
           	dp[0] = 0;
        }
        
        
        ch1 = s.charAt(0);
        ch2 = s.charAt(1);
        
        dp[1] = 0;
        
       
        

        		

        
        
        
        for (i = 1; i < dp.length; i++){

            
            
            ch1 = s.charAt(i-1);
            ch2 = s.charAt(i);
            
            dp[i] = 0;
            
            
            
            
            if (ch2 != '0'){
            	dp[i] += dp[i-1];
            }
            
            
            
            
            if (ch1 == '1'){
                
            	dp[i]++;
                
                
                
            }else if (ch1 == '2'){
                if (ch2 >= '0' && ch2 <= '6'){
                    
                	dp[i]++;
                    
                }
            }
       
         
        }
        
        
        return dp[dp.length - 1];
        
        
        
    }	

}
