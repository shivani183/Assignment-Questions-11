
//Given a number , write a program to reverse this number using stack.

package AssignmentQuestion16;

import java.util.Stack;

public class Que5 {
	
	public static void reverse(StringBuffer s) {
		
		Stack<Character> s1= new Stack<>();
		int n= s.length();
		
		for(int i=0;i<n;i++) {
			char x= s.charAt(i);
			s1.push(x);
		}
		
		for (int i = 0; i < n; i++) {
            char a = s1.pop();
            s.setCharAt(i, a);
        }
		
		System.out.println(s);
		
	}
public static void main(String[] args) {
		
		StringBuffer name= new StringBuffer("365");
		reverse(name);}
	
	

}
