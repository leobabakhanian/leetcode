import java.util.*;

public class ValidAnagram {

	// Running tests in main
    public static void main (String[] args) {
    	
    	String s = "anagram", t = "nagaram";
    	
    	System.out.println(isAnagram(s,t));
    }
    
    // Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    public static boolean isAnagram(String s, String t) {
    	
    	char[] s2 = s.toCharArray(), t2 = t.toCharArray();
    	
    	Arrays.sort(s2);
    	Arrays.sort(t2);
    	
    	if(Arrays.equals(s2, t2))
    		return true;
    	
    	return false;
    }
}
