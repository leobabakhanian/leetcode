
public class MoveZeroes {

	// Running tests in main
    public static void main (String[] args) {
    	
    	int[] nums = {2,0,1,5,0,3,12}, res = moveZeroes(nums);
    	
    	for(int i : res)
    		System.out.print(i + " ");
    }
    
    /* Given an integer array nums, move all 0's to the end of it while 
       maintaining the relative order of the non-zero elements. */
    public static int[] moveZeroes(int[] nums) {
    	
    	int curr = 0;
    	
    	for (int i = 0; i < nums.length; i++) {
    		
    		if(nums[i] != 0) {
    			nums[curr] = nums[i];
    			curr++;
    		}
    	}
    	
    	for(; curr < nums.length; curr++)
    		nums[curr] = 0;
    	
    	return nums;
    }
}
