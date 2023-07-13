
/*Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. 
Operators will only include the basic arithmetic operators like *, /, + and -.*/

package AssignmentQuestion15;

import java.util.*;

public class Que6 {
	
	static int postFix(StringBuffer st) {
		int n = st.length();

		Stack<Integer> it = new Stack<>();

		for (int i = 0; i < n; i++) {
			char ch = st.charAt(i);
			if (Character.isDigit(ch)) 
				it.push(ch-'0');
			else {
				int a= it.pop();
				int b= it.pop();
				
				switch(ch) {
				case '+':
					it.push(b+a);
					break;
				case '-':
					it.push(b-a);
					break;
				case '*':
					it.push(a*b);
					break;
				case '/':
					it.push(b/a);
					break;
				}
			}
		}
		return it.pop();
	}
	public static void main(String[] args) {
		StringBuffer name= new StringBuffer("231*+9-");
		System.out.println(postFix(name));

	}

}
