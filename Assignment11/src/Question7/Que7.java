/*Given an array of integers `nums` sorted in non-decreasing order,
find the starting and ending position of a given `target` value.
If `target` is not found in the array, return `[-1, -1]`.
You must write an algorithm with `O(log n)` runtime complexity.*/

package Question7;

import java.util.ArrayList;

public class Que7 {
	public static int[] startEndPosition(int[]arr, int target) {
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				num.add(i);
			}
		}
		if(num.isEmpty())
			{num.add(-1);
			num.add(-1);}
	
		int disp[]=num.stream().mapToInt(x->x).toArray();
		return disp;
	
	}
	public static void main(String[] args) {
		int arr[]= {};
		int target=0;
		int ans[]=startEndPosition(arr,target);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
