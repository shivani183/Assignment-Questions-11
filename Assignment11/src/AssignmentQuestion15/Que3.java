//Implement a Stack using two queues q1 and q2.

package AssignmentQuestion15;

import java.util.*;

public class Que3 {

		Queue<Integer> q1 = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();

		public void push(int x) {
			q1.add(x);

		}
		public int pop() {
			
			while(q1.size()>1) {
				q2.add(q1.remove());
			}
			int popped=q1.remove();
			while(q2.size()>0) {
				q1.add(q2.remove());
			}
			return popped;
		}
		
	public static void main(String[] args) {
		Que3 q= new Que3();
		q.push(2);
		q.push(3);
		System.out.println(q.pop());
		q.push(4);
		System.out.println(q.pop());
        
	}

}
