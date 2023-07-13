
//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

package AssignmentQuestion15;

import java.util.*;

public class Que8 {
	public int waterTrap(int[] arr) {
		
		Stack<Integer> st = new Stack<>();
		int n = arr.length;
		int cur1[] = new int[n];
		cur1[0] = arr[0];
		st.push(arr[0]);
		for (int i = 1; i < n; i++) {
			while (st.size() != 0 && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				cur1[i] = arr[i];
			} else {
				cur1[i] = st.peek();
			}
			st.push(cur1[i]);
		}
		st.clear();
		int cur2[] = new int[n];

		cur2[n - 1] = arr[n - 1];
		st.push(arr[n - 1]);

		for (int i = n - 1; i >= 0; i--) {

			while (st.size() != 0 && st.peek() <= arr[i]) {
				st.pop();
			}
			if (st.size() == 0) {
				cur2[i] = arr[i];
			} else {
				cur2[i] = st.peek();
			}
			st.push(cur2[i]);
		}
		int rain = 0;
		for (int i = 0; i < n; i++) {
			int maxValue = Math.min(cur1[i], cur2[i]);
			rain += maxValue - arr[i];
		}
		return rain;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		Que8 que= new Que8();
		System.out.println(que.waterTrap(height));

	}

}
