import java.util.*;

public class ContainsDuplicate {

	// Running tests in main
    public static void main (String[] args) {
    	
    	int[] nums = {1,2,3};
    	
    	System.out.println(containsDuplicate(nums));
    }
    
    /* Given an integer array nums, return true if any value appears at least twice in the array,
     *  and return false if every element is distinct. */
    public static boolean containsDuplicate(int[] nums) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for(int num : nums) {
    		
    		if(map.containsKey(num))
    			map.put(num, map.get(num) + 1);
    		else 
    			map.put(num, 1);
    		
    		if(map.get(num) > 1)
    			return true;
    	}
    	
    	return false;
    }
}
