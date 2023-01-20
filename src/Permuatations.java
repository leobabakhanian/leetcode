import java.util.ArrayList;
import java.util.List;

public class Permuatations {

	public List<List<Integer>> permute(int[] nums) {
        
		List<List<Integer>> res = new ArrayList<>();
		findPermutations(res, new ArrayList<>(), nums);
		
		return res;
    }
	
	private void findPermutations(List<List<Integer>> res, List<Integer> temp, int[] nums) {
		
		if(temp.size() == nums.length)
			res.add(new ArrayList<>(temp));
		else {
			for(int i = 0; i < nums.length; i++) {
				if(temp.contains(nums[i]))
					continue;
				
				temp.add(nums[i]);
				findPermutations(res, temp, nums);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
