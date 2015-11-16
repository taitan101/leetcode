package maxprofit;

public class Solution {
    public int maxProfit(int[] prices) {
    	
    	
    	return maxProfit(prices, 0, prices.length - 1);
        
        
    }
    
    
    public int maxProfit(int[] prices, int start, int end){
    	
    	
    	if (end <= 0){
    		return 0;
    	}
    	
    	
    	int min;
    	int max;
    	int value;
    	int index;
    	int i;
    	
    	min = Integer.MAX_VALUE;
    	index = -1;
    	
    	for (i = start; i <= end; i++){
    		if (prices[i] < min){
    			min = prices[i];
    			index = i;
    		}
    	}
    	
    	
    	max = 0;
    	for (i = index + 1; i <= end; i++){
    		value = prices[i] - min;
    		
    		if (value > max){
    			max = value;
    		}
    	
    	}
    	
    	
    	return Math.max(max, maxProfit(prices, 0, index - 1));
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    }
	

}
