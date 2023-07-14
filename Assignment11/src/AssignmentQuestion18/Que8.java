package AssignmentQuestion18;

public class Que8 {

	public static boolean find132pattern(int[] nums) {
		int n = nums.length;
		int start = nums[0];

		for (int i = 1; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (start<nums[j] && nums[j]<nums[i])
					return true;
			}
			start = Math.min(nums[i], start);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(find132pattern(nums));

	}

}
