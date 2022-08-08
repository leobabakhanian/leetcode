import java.util.*;

public class MajorityElement {

		// Running tests in main
	    public static void main (String[] args) {
	    	
	    	int[] nums = {2,1,2,2,2,1,1};
	    	
	    	System.out.println(majorityElement(nums));
	    }
	    
	    // Return majority element in array
	    public static int majorityElement(int[] nums) {
	    	
	    	HashMap<Integer,Integer> map = new HashMap<>();
	    	int res = 0;
	    	
	    	for(int num : nums) {
	    		
	    		if(!map.containsKey(num))
	    			map.put(num, 1);
	    		else
	    			map.put(num, map.get(num) + 1);
	    		
	    		if(map.get(num) > nums.length / 2)
	    			res = num;
	    	}
	    	
	    	return res;
	    }
}

