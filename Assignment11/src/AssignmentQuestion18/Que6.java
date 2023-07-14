

package AssignmentQuestion18;

import java.util.Arrays;
import java.util.Comparator;

public class Que6 {
	
	public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(p -> p[1]));

        int arrow = points[0][1];
        int ans = 1;

        for (int[] point : points)
            if (point[0] > arrow) {
                ans++;
                arrow = point[1];
            }
        return ans;
    }
	public static void main(String[] args) {
		int[][] points = {{10,16},{2,8},{1,6},{7,12}};
		System.out.println(findMinArrowShots(points));
	}

}
