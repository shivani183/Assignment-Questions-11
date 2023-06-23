package Question3;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Given an array nums containing n distinct numbers in the range [0, n], 
return the only number in the range that is missing from the array.*/

public class Que3 {

	public static int findNum(int arr[] ) {
		int count=0;
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==count)
				count++;
		}
		return count;
	
	}
	public static void main(String[] args) {

		int arr[]= {0,1};
		System.out.println(findNum(arr));
		
	}

}
