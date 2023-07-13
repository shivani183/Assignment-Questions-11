
//You are given a stack St. You have to reverse the stack using recursion.
/*Input:St = {3,2,1,7,6}
Output:{6,7,1,2,3}*/

package AssignmentQuestion15;

import java.util.Stack;

public class Que4 {
	
	static void reverse(Stack st) {
		
		Stack<Integer> s1= new Stack<>();
		
		for(int i=0;i<st.size();i++) {
			int b=(int) st.pop();
			s1.push(b);
		}
		  
		  Object[] vals = s1.toArray(); 
		  for (Object obj : vals) 
			  System.out.println(obj);
	}

		public static void main(String[] args) {
			Stack<Integer> x= new Stack<>();
			x.push(3);
			x.push(2);
			x.push(1);
			x.push(7);
			x.push(6);
			reverse(x);
			

	}

}
