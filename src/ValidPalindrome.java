
public class ValidPalindrome {

	// Running tests in main
    public static void main (String[] args) {
    	
    	String s = "A man, a plan, a canal: Panama";
    	
    	System.out.println(isPalindrome(s));
    }
    
    // Given a string s, return true if it is a palindrome, or false otherwise.
    public static boolean isPalindrome(String s) {
    	
    	s = s.replaceAll("[^a-zA-Z0-9]", "");
    	s = s.toLowerCase();
    	
    	int i = 0, j = s.length() - 1;
    	
    	if(s == " " || s.isEmpty())
    		return true;
    	
    	while(i < j) {
    		
    		if(s.charAt(i) != s.charAt(j))
    			return false;
    		
    		i++; 
    		j--;
    	}
    	
    	return true;
    }
}
