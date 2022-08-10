
public class MaximumTime {

	// Running tests in main
    public static void main (String[] args) {
    	
    	String t = "??:5?";
    	
    	System.out.println(maxTime(t));
    }
    
    public static String maxTime(String t) {
    	
    	char[] c = t.toCharArray();
    	
    	if(c[0] == '?' && c[1] == '?') {
    		
    		c[0] = '2';
    		c[1] = '3';
    	}
    	else if (c[0] == '?' && c[1] != '?') {
    		
    		if(c[1] < '4')
    			c[0] = '2';
    		else
    			c[0] = '1';
    	}
    	else if(c[0] != '?' && c[1] == '?') {
    		
    		if(c[0] < '2')
    			c[1] = '9';
    		else
    			c[1] = '3';
    	}
    	
    	if(c[3] == '?')
    		c[3] = '5';
    	
    	if(c[4] == '?')
    		c[4] = '9';
    	
    	return String.valueOf(c);
    }
}
