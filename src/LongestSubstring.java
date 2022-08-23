import java.util.*;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		
		int i = 0, j = 0, max = 0;
		HashSet<Character> set = new HashSet<>();
		
		while(i < s.length()) {
			
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				i++;
				max = Math.max(set.size(), max);
			}
			else {
				set.remove(s.charAt(j));
				j++;
			}
		}
		
		return max;
	}
}