package main.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfThree {
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		
		List<List<Integer>> output = SumOfThree.threeSum(nums);
        System.out.println(output); // Expected: [[-1, -1, 2], [-1, 0, 1]]
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		
		Set<List<Integer>> result = new HashSet<>();
	    for(int i = 0; i  < nums.length - 2; i ++) {
			Set<Integer>seen = new HashSet<Integer>();
			for(int j = i + 1; j < nums.length; j ++) {
				int complement = -nums[i] - nums[j];
				if(seen.contains(complement)) {
					List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
					Collections.sort(triplet);
					result.add(triplet);
				}
				seen.add(nums[j]);
			}
		}
		
		return new ArrayList<>(result);
	}
}
