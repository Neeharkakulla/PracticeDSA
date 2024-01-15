package src.main;

import java.util.Arrays;
import java.util.HashMap;

public class AddTwoNums {

	public static void main(String[] args) {
		Solution_4 solution_4 = new Solution_4();
		System.out.println(Arrays.toString(solution_4.twoSum(new int[] { 1, 2, 3, 4, 5, 6 }, 4)));
	}
}

class Solution_4 {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> complimentMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			if (complimentMap.containsKey(compliment))
				return new int[] { complimentMap.get(compliment), i };
			complimentMap.put(nums[i], i);
		}
		return new int[] {};
	}
}
