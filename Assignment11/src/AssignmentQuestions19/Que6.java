
//Given two sorted arrays, the task is to merge them in a sorted manner.

package AssignmentQuestions19;

import java.util.Arrays;

public class Que6 {

	public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < n1) {
			arr3[k++] = arr1[i++];
		}

		while (j < n2) {
			arr3[k++] = arr2[j++];
		}

		Arrays.sort(arr3);
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 5, 7 };
		int n1 = arr1.length;

		int arr2[] = { 2, 4, 6, 8 };
		int n2 = arr2.length;

		int arr3[] = new int[n1 + n2];
		mergeArrays(arr1, arr2, n1, n2, arr3);

	}

}
