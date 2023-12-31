
/*Given an array `nums` of size `n`, return *the majority element*.
The majority element is the element that appears more than `⌊n / 2⌋` times. 
You may assume that the majority element always exists in the array.*/


package AssignmentQuestions24;

import java.util.*;

public class Que3 {

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				count = 0;
			} else {
				count++;
			}
			if (count >= (nums.length / 2)) {
				return nums[i];
			}
			System.out.print(nums[i] + " ");
		}
		return 0;
	}

}
