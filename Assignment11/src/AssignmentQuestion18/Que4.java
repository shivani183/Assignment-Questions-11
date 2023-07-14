package AssignmentQuestion18;

import java.util.Arrays;

public class Que4 {

	public int maximumGap(int[] nums) {
		Arrays.sort(nums);
		int max = 0;
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i] - nums[i - 1];
			if (max < temp)
				max = temp;
		}
		return max;
	}

	public static void main(String[] args) {

	}

}
