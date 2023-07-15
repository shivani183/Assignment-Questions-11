
/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in 
the result must appear as many times as it shows in both arrays and you may return the result 
in any order.*/

package AssignmentQuestions19;

import java.util.ArrayList;
import java.util.Arrays;

public class Que8 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		     Arrays.sort(nums1);
		     Arrays.sort(nums2);
		    ArrayList<Integer> res = new ArrayList<>();
		     int p1=0,p2=0;
		     while(p1<nums1.length && p2<nums2.length){
		         if(nums1[p1]<nums2[p2]){
		             p1++;
		         }
		         else if(nums1[p1]>nums2[p2]){
		             p2++;
		         }
		         else{
		         res.add(nums1[p1]);
		         p1++;
		         p2++;
		         }
		     }
		     int result[] = new int[res.size()];
		     for(int i=0;i<res.size();i++){
		         result[i] = res.get(i);
		     }
		     return result;
		    }

}
