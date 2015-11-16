package candy;

public class Solution {

    public int candy(int[] ratings) {
        int i;
        int sum;
        int [] score = new int[ratings.length];
        
        if (ratings.length == 0){
            return 0;
        }else if (ratings.length == 1){
            return 1;
        }
        
        
        if (ratings[0] > ratings[1]){
            score[0] = 2;
            score[1] = 1;
        }else if (ratings[0] == ratings[1]){
            score[0] = 1;
            score[1] = 1;
        }else{
            score[0] = 1;
            score[1] = 2;
        }
        
        for (i = 2; i < ratings.length; i++){
            if (ratings[i] > ratings[i-1]){
                score[i] = score[i-1] + 1;

            }else{
                score[i] = 1;
            }
            
        }
        
        
        
        
        
        
        sum = 0;
        
        for (i = 0; i < ratings.length; i++){
            sum += score[i];
        }
        return sum;
        
        
        
    }

}
