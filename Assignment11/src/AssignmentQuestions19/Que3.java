
/*Given an array of integers `nums`, sort the array in ascending order and return it.

You must solve the problem **without using any built-in** functions in `O(nlog(n))` 
time complexity and with the smallest space complexity possible.*/

package AssignmentQuestions19;

public class Que3 {

	
	 public int[] sortArray(int[] nums) {
	        int n = nums.length;
	        int max = nums[0];
	        int min = nums[0];
	        for (int num : nums) {
	            max = Math.max(max, num);
	            min = Math.min(min, num);
	        }
	        int len = max - min;
	        int[] arr = new int[len + 1];
	        for (int num : nums) {
	            arr[num - min]++;
	        }
	        int index = 0;
	        for (int i = 0; i <= len; i++) {
	            while (arr[i] > 0) {
	                nums[index] = min;
	                index++;
	                arr[i]--;
	            }
	            min++;
	        }
	        return nums;
	    }
}
