package bullscows;

public class Solution {
    public String getHint(String secret, String guess) {
        int i;
        int j;
        int a = 0;
        int b = 0;
        char ch1;
        char ch2;
        boolean usedSecret [] = new boolean[secret.length()];
        boolean usedGuess [] = new boolean[guess.length()];
        
        
        for (i = 0; i < guess.length(); i++){
            
            ch1 = guess.charAt(i);
            if (ch1 == secret.charAt(i)){
                a++;
                usedSecret[i] = true;
                usedGuess[i] = true;

            }
            
            

        }
        
        for (i = 0; i < guess.length(); i++){
            
        	if (usedGuess[i]){
        		continue;
        	}
        	
        	
        	ch1 = guess.charAt(i);
      
            
            for (j = 0; j < secret.length(); j++){
                if (usedSecret[j] == false){
                    if (ch1 == secret.charAt(j)){
                        b++;
                        usedSecret[j] = true;
                        
                        break;
                    }

                }
                
                
            }
        }
        
        return a +"A"+b+"B";
        
    
        
        
    }
}
