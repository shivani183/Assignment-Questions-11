
/*Given a **sorted** integer array `arr`, two integers `k` and `x`, return the `k` closest integers to `x` in the array. 
The result should also be sorted in ascending order.
An integer `a` is closer to `x` than an integer `b` if:
- `|a - x| < |b - x|`, or
- `|a - x| == |b - x|` and `a < b`*/

package AssignmentQuestions24;

import java.util.*;

public class Que8 {

	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int l = 0;
		int h = arr.length - 1;

		while (h - l >= k) {
			if (Math.abs(arr[l] - x) > Math.abs(arr[h] - x)) {
				l++;
			} else
				h--;
		}

		List<Integer> ans = new ArrayList<>();
		for (int i = l; i <= h; i++) {
			ans.add(arr[i]);
		}
		return ans;
	}

}
