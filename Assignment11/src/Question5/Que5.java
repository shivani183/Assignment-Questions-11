package Question5;

/*Given two integer arrays nums1 and nums2, return an array of their intersection. 
Each element in the result must be unique and you may return the result in any orde*/

import java.util.ArrayList;

public class Que5 {
	public static int[] newArray(int[] num1, int[] num2) {
		
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0;i< num1.length;i++)
        {
            for(int j = 0;j< num2.length;j++)
            {
                if(num1[i] == num2[j])
                {
                    if(arr.contains(num1[i]))
                    {
                        continue;
                    }
                    else
                    {
                        arr.add(num1[i]);
                    }
                }
            }
        }
        int[] ans = arr.stream().mapToInt(i -> i).toArray();
        return ans;
    }

	public static void main(String[] args) {

		int nums1[]= {1,3,4,1,4};
		int nums2[]= {1,4,9,5};
		int arr[]=newArray(nums1,nums2);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
			
		
	}

}
