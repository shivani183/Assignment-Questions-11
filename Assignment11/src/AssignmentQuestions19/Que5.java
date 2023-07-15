
/*Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number 
is followed by a negative and vice-versa maintaining the order of appearance. The number of positive and negative numbers 
need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, 
they too appear at the end of the array.*/

package AssignmentQuestions19;

public class Que5 {

	void rightrotate(int arr[], int n, int out, int curr) {
		int temp = arr[curr];
		for (int i = curr; i > out; i--)
			arr[i] = arr[i - 1];
		arr[out] = temp;
	}

	void rearrange(int arr[], int n) {
		int outPlace = -1;

		for (int index = 0; index < n; index++) {
			if (outPlace >= 0) {
				if (((arr[index] >= 0) && (arr[outPlace] < 0)) || ((arr[index] < 0) && (arr[outPlace] >= 0))) {
					rightrotate(arr, n, outPlace, index);

					if (index - outPlace >= 2)
						outPlace = outPlace + 2;
					else
						outPlace = -1;
				}
			}
			if (outPlace == -1) {
				if (((arr[index] >= 0) && ((index & 0x01) == 0)) || ((arr[index] < 0) && (index & 0x01) == 1))
					outPlace = index;
			}
		}
	}
}
