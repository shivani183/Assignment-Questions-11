/*Given an array arr[ ] of size N having elements, the task is to find the next greater 
element for each element of the array in order of their appearance in the array.Next 
greater element of an element in the array is the nearest element on the right which is
greater than the current element.If there does not exist next greater of current 
element, then next greater element for current element is -1. For example, next greater
of the last element is always -1.*/

package AssignmentQuestion15;

import java.util.*;

public class Que1 {

	public void isValid(int[] s) {
		int n = s.length;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				st.push(-1);
				break;}
			for (int j = i + 1; j < n; j++) {
				if (s[i] < s[j]) {
					st.push(s[j]);
					break;
				}
				if (j == n-1)
					st.push(-1);
			}
		}
		Object[] vals = st.toArray();
		for (Object obj : vals) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		int [] x= {6, 8, 0, 1, 3};
		Que1 q=new Que1();
		q.isValid(x);
		

	}

}
