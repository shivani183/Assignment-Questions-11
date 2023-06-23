package Question8;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the 
result must appear as many times as it shows in both arrays and you may return the result in any order.
*/
import java.util.Arrays;

public class Que8 {

	 public static int[] intersect(int[] nums1, int[] nums2) {
	        int[] ans = new int[1001];
	        int[] finalAns = new int[1001];

	        for (int i : nums1) {
	            ans[i]++;
	        }
	        int count = 0;
	        for (int i : nums2) {
	            if (ans[i] > 0) {
	                finalAns[count++] = i;
	                ans[i]--;
	            }
	        }
	        return Arrays.copyOfRange(finalAns, 0, count);
	    }

	public static void main(String[] args) {

		int nums1[]= {1,51,51,1};
		int nums2[]= {51,51};
		int arr[]=intersect(nums1,nums2);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
			
		
	}

}
