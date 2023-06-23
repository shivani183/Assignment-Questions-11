
/*A peak element is an element that is strictly greater than its neighbors.

Given a **0-indexed** integer array `nums`, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to **any of the peaks**.
You may imagine that `nums[-1] = nums[n] = -∞`. In other words, an element is always considered 
to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in `O(log n)` time.*/

package Question2;

public class Que2 {
	public static int indexIs(int arr[]) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int m = (s + e) / 2;
			
			if (m == e) {
				if (arr[m] > arr[m - 1])
					return m;
				else
					e = m - 1;
			}
			if (m == 0) {
				if (arr[m] > arr[m + 1])
					return m;
				else
					s = m + 1;
			} else {
				if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1])
					return m;
				if (arr[m] < arr[m + 1])
					s = m + 1;
				else
					e = m - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

		int[] nums = { 1,2,3,1 };
		System.out.println(indexIs(nums));
	}

}
