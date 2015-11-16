package compareversion;

public class Solution {
    public int compareVersion(String version1, String version2) {
    	
    	int i;
    	String [] digits1;
    	String [] digits2;
    	
    	
    	if (version1.indexOf('.') == -1){
    		digits1 = new String[1];
    		digits1[0] = version1;
    	}else{
    		digits1 = version1.split("\\.");
    	}
    	
    	
    	
    	if (version2.indexOf('.') == -1){
    		digits2 = new String[1];
    		digits2[0] = version2;
    	}else{
    		digits2 = version2.split("\\.");    		
    		
    	}
    	
    	
    	int value1;
    	int value2;
    	
    	
    	for (i = 0; i < digits1.length && i < digits2.length; i++){
    		value1 = Integer.parseInt(digits1[i]);
    		value2 = Integer.parseInt(digits2[i]);
    		
    		if (value1 > value2){
    			return 1;
    		}else if (value1 < value2){
    			return -1;
    		}
    		
    		
    		
    		
    	}
    	
    	
    	if (digits1.length == digits2.length){
        	return 0;
    	}else if (digits1.length > digits2.length){
        	for (;i < digits1.length; i++){
        		value1 = Integer.parseInt(digits1[i]);
        		        		
        		if (value1 > 0){
        			return 1;
        		}
        		    		
        		
        	}
        	return 0;

    		
    	}else{
        	for (;i < digits2.length; i++){
        		value2 = Integer.parseInt(digits2[i]);
        		        		
        		if (value2 > 0){
        			return -1;
        		}
        		    		
        		
        	}
        	return 0;
    	}
    	

    	
    	
    	
        
    }	
	
	

}
