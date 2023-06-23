/*Suppose an array of length `n` sorted in ascending order is **rotated** between `1` and `n` times. 
 * For example, the array `nums = [0,1,2,4,5,6,7]` might become:
- `[4,5,6,7,0,1,2]` if it was rotated `4` times.
- `[0,1,2,4,5,6,7]` if it was rotated `7` times.
Notice that **rotating** an array `[a[0], a[1], a[2], ..., a[n-1]]` 1 time results in the array 
`[a[n-1], a[0], a[1], a[2], ..., a[n-2]]`.
Given the sorted rotated array `nums` of **unique** elements, return *the minimum element of this array*.
You must write an algorithm that runs in `O(log n) time`*/

package Question6;

public class Que6 {
	 public static int minElntIs(int[] n) {
	        int s = 0;
	        int e = n.length-1;
	        while (s < e) {
	            int m = (e + s)/2;
	            if (n[m] > n[e]){
	                s = m+1;
	            }
	            else {
	                e = m;
	            }
	        }
	        return n[s];
	    }
public static void main(String[] args) {
	int arr[]= {4,5,6,7,1,2};
	System.out.println(minElntIs(arr));
}
}
