package AssignmentQuestion18;

import java.util.*;

public class Que1 {

	public int[][] merge(int[][] n) {
		
		Arrays.sort(n, (a, b) -> a[0] - b[0]);
		int s = n[0][0], e = n[0][1], k = n.length;
		List<int[]> nm = new ArrayList<>();
		for (int i = 1; i < k; i++) {
			if (e <= n[i][1]) {
				if (e >= n[i][0]) {
					e = n[i][1];
				} else {
					nm.add(new int[] { s, e });
					s = n[i][0];
					e = n[i][1];
				}
			}
		}
		nm.add(new int[] { s, e });
		return nm.toArray(new int[0][]);
	}

	public static void main(String[] args) {

	}

}
