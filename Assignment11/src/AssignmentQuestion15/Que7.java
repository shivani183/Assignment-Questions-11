
/*Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the `MinStack` class:

- `MinStack()` initializes the stack object.
- `void push(int val)` pushes the element `val` onto the stack.
- `void pop()` removes the element on the top of the stack.
- `int top()` gets the top element of the stack.
- `int getMin()` retrieves the minimum element in the stack.

You must implement a solution with `O(1)` time complexity for each function.*/

package AssignmentQuestion15;

import java.util.Stack;

class MinStack {

	Stack<int[]> st;

	public MinStack() {
		st = new Stack<>();
	}

	public void push(int val) {
		if (st.isEmpty()) {
			st.push(new int[] { val, val });
			return;
		}
		int currmin = st.peek()[1];
		st.push(new int[] { val, Math.min(currmin, val) });
	}

	public void pop() {
		st.pop();
	}

	public int top() {
		return st.peek()[0];
	}

	public int getMin() {
		return st.peek()[1];
	}
}

public class Que7 {

	public static void main(String[] args) {
		
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin(); 
		minStack.pop();
		minStack.top();   
		minStack.getMin(); 

	}

}
