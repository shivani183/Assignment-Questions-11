
//You are given a string S, the task is to reverse the string using stack.

package AssignmentQuestion15;

import java.util.Stack;

public class Que5 {
	
	static void reverseStr(StringBuffer st) {
		
		int n=st.length();
		
		Stack<Character> ch= new Stack<>();
		
		for(int i=0;i<n;i++) {
			char x= st.charAt(i);
			ch.push(x);
		}
		
		for (int i = 0; i < n; i++) {
            char a = ch.pop();
            st.setCharAt(i, a);
        }
		System.out.println(st);
		
	}

	public static void main(String[] args) {
		
		StringBuffer name= new StringBuffer("GeeksforGeeks");
		reverseStr(name);

	}

}
