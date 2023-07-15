
/*You are given an array of integers `nums`, there is a sliding window of size `k` which is moving 
from the very left of the array to the very right. You can only see the `k` numbers in the window.
Each time the sliding window moves right by one position.
Return *the max sliding window*.*/

package AssignmentQuestions24;

import java.util.*;

public class Que7 {

	public int[] maxSlidingWindow(int[] A, int k) {
		int ri = 0, n = A.length;
		int ans[] = new int[n - k + 1];
		Deque<Integer> ad = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			if (!ad.isEmpty() && ad.peek() == i - k)
				ad.poll();
			while (!ad.isEmpty() && A[ad.peekLast()] <= A[i]) {
				ad.pollLast();
			}
			ad.offer(i);
			if (i >= k - 1) {
				ans[ri++] = A[ad.peek()];
			}
		}
		return ans;
	}

}
