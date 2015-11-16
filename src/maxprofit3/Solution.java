package maxprofit3;

public class Solution {
	
    public int maxProfit(int[] prices) {
        int profit1 = 0;
        int profit2 = 0;
        int profit;
        
        
        int buy;
        int sell;
        int current;
        int i;
        

        i = 0;
        
        while (i < prices.length){
            current = prices[i];
            i++;
            
            while (i < prices.length){
                if (current < prices[i]){
                    break;
                }else{
                    current = prices[i];
                    i++;
                }
            
            }
            
            if (i == prices.length){
                
                break;
                
            }
            
            i--;
            buy = prices[i];
            

            
            
            current = prices[i];
            i++;
            
            
            while (i < prices.length){
                if (current > prices[i]){
                    break;
                }else{
                    current = prices[i];
                    i++;
                }
            
            }
            
            if (i == prices.length){
                sell = prices[--i];
                
                profit = sell - buy;
            
            
            
                if (profit1 < profit2 && profit > profit1){
                    profit1 = profit;
                }else if (profit > profit2){
                    profit2 = profit;
                }
            	
                break;
                
            }
            
            
            sell = prices[--i];
            
            profit = sell - buy;
            
            
            
            if (profit1 < profit2 && profit > profit1){
                profit1 = profit;
            }else if (profit > profit2){
                profit2 = profit;
            }
    
            
            
            
        }
        
        
        return profit1 + profit2;
        
        
        
        
        
    }	

}
