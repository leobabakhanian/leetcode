
public class ClimbStairs {

	public int climbStairs(int n) {

        // Base cases
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;
        
        int one = 1, two = 2, all = 0;
        
        for(int i = 2; i < n; i++){
            all = one + two;
            one = two;
            two = all;
        }
        
        return all;
    }
}
