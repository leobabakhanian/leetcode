
public class GasStation {

	// Running tests in main
    public static void main (String[] args) {
    	
    	int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
    	
    	System.out.println(canCompleteCircuit(gas,cost));
    }
    
    /* Given two integer arrays gas and cost, return the starting gas station's 
     * index if you can travel around the circuit once in the clockwise direction,
     *  otherwise return -1. */
    public static int canCompleteCircuit(int[] gas, int[] cost) {
    	
    	int remaining = 0, solution = 0, prev = 0;
    	
    	for(int i = 0; i < gas.length; i++) {
    		
    		remaining += gas[i] - cost[i];
    		
    		if(remaining < 0) {
    			solution = i + 1;
    			prev += remaining;
    			remaining = 0;
    		}
    	}
    	
    	if(solution == gas.length || remaining + prev < 0)
    		return -1;
    	else
    		return solution;
    }
}
