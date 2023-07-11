
/*Given a linked list of **N** nodes such that it may contain a loop.
A loop here means that the last node of the link list is connected to the node at position X(1-based index). 
If the link list does not have any loop, X=0.
Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.*/

package AssignmentQuestions14;

public class Que1 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	public static int removeLoop(Node head) {
		Node slow = head;
		Node fast = head;
		if (head == null || head.next != null) 
			return 0;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				while (slow.next != fast) {
					slow = slow.next;
					}
				slow.next = null;
				return 1;					}
		}
		return 0;
		
	}
	}
