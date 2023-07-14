package AssignmentQuestion18;

import java.util.Arrays;

public class Que7 {

	public static int lengthOfLIS(int[] nums) {
		if (nums.length == 0)
			return 0;
		int[] arr = new int[nums.length];
		Arrays.fill(arr, 1);

		for (int i = 1; i < nums.length; ++i)
			for (int j = 0; j < i; ++j)
				if (nums[j] < nums[i])
					arr[i] = Math.max(arr[i], arr[j] + 1);

		return Arrays.stream(arr).max().getAsInt();
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,3,2,3};
		System.out.println(lengthOfLIS(arr));
	}

}
