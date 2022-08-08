import java.util.*;

public class ValidParentheses {

	// Running tests in main
    public static void main (String[] args) {
    	
    	String s = "{{[[([{}])]]}}";
    	
    	System.out.println(isValid(s));
    }
    
    /* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
       determine if the input string is valid. */
    public static boolean isValid(String s) {
    	
    	Stack<Character> stack = new Stack<>();
    	
    	for(char c : s.toCharArray()) {
    		
    		if(c == '(')
    			stack.push(')');
    		else if(c == '{')
    			stack.push('}');
    		else if(c == '[')
    			stack.push(']');
    		else if(stack.isEmpty() || stack.pop() != c)
    			return false;
    	}
    	
    	return stack.isEmpty();
    }
}
