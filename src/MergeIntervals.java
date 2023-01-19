import java.util.Arrays;
import java.util.Stack;

public class MergeIntervals {

	public int[][] merge(int[][] intervals) {
        
		Arrays.sort(intervals, (a1,a2) -> a1[0]-a2[0]);
		Stack<int[]> s = new Stack<>();
		s.push(intervals[0]);
		
		int i = 1;
		
		while(!s.isEmpty() && i < intervals.length) {
			int[] curr = s.peek();
			int[] next = intervals[i++];
			
			if(curr[1] >= next[0]) {
				s.pop();
				curr[1] = Math.max(curr[1], next[1]);
				s.push(curr);
			}
			else
				s.push(next);
		}
		
		return s.toArray(new int[s.size()][2]);
    }
}
