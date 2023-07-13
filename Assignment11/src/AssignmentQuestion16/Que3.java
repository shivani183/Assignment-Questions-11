
/*Given a stack with push(), pop(), and empty() operations, The task is to delete the middle element
 of it without using any additional data structure.

Input  : Stack[] = [1, 2, 3, 4, 5, 6]
Output : Stack[] = [1, 2, 4, 5, 6]
*/
package AssignmentQuestion16;

import java.util.Stack;

public class Que3 {
	public static Stack<Character> deleteMiddle(Stack<Character> s, int curr) {

		int n = s.size();
		if (s.empty() || curr == n)
			return s;
		char x = s.pop();

		deleteMiddle(s, curr+1);

		if (curr != n / 2)
			s.push(x);
		
		return s;
	}
	public static void main(String[] args) {
		Stack<Character> x = new Stack<Character>();
		x.push('1');
		x.push('2');
		x.push('3');
		x.push('4');
		x.push('5');
		x.push('6');

		Stack<Character> s = deleteMiddle(x, 0);
		Object[] obj = s.toArray();
		for (Object o : obj)
			System.out.println(o);

	}

}
