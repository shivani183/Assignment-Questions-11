
/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result 
must be unique and you may return the result in any order
*/
package AssignmentQuestions19;

import java.util.Arrays;

public class Que7 {
	
	public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int[]arr = new int[Math.min(nums1.length,nums2.length)];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(k==0 || nums1[i]!=arr[k-1]){
                    arr[k]=nums1[i];
                    k++;
                }
                i++;
                j++;
            }else if(nums1[i]>nums2[j]) j++;
            else i++;                
          }
        int[]ans = new int[k];
        for(int a=0;a<k;a++){
            ans[a]=arr[a];
        }
        return ans;
    }

}
