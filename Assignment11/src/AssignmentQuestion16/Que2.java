
//Given a stack of integers, sort it in ascending order using another temporary stack.
/*Input : [34, 3, 31, 98, 92, 23]
Output : [3, 23, 31, 34, 92, 98]*/

package AssignmentQuestion16;

import java.util.*;

public class Que2 {

	public static Stack<Integer> sortStack(Stack<Integer> input) {

		Stack<Integer> st = new Stack<Integer>();
		while (!input.isEmpty()) {
			int tmp = input.pop();

			while (!st.isEmpty() && st.peek() < tmp) {
				input.push(st.pop());
			}
			st.push(tmp);
		}
		return st;
	}

	public static void main(String[] args) {
		Stack<Integer> x = new Stack<Integer>();
		x.add(34);
		x.add(3);
		x.add(31);
		x.add(98);
		x.add(92);
		x.add(23);

		Stack<Integer> s = sortStack(x);
		Object[] obj = s.toArray();
		for (Object o : obj)
			System.out.println(o);

	}

}
