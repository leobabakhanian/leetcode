import java.util.*;

public class TwoSum {

	// Running tests in main
    public static void main (String[] args) {
    	
    	int[] nums = {4,5,8,12,6,2,1,7};
    	int target = 20;
    	
    	int[] res = twoSum(nums,target);
    	
    	for(int i : res)
    		System.out.print(i + " ");
    }
    
    // Return indexes of two elements that make up target sum
    public static int[] twoSum(int[] nums, int target) {
    	
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int[] res = new int[2];
    	
    	for(int i = 0; i < nums.length; i++) {
    		
    		if(map.containsKey(target - nums[i])) {
    			res[1] = i;
    			res[0] = map.get(target - nums[i]);
    		}
    		
    		map.put(nums[i], i);
    	}
    	
    	return res;
    }
}
