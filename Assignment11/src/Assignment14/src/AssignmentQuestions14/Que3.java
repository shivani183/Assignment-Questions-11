
/*Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:(i) 
a next pointer to the next node,(ii) a bottom pointer to a linked list where this node is head.Each of the 
sub-linked-list is in sorted order.Flatten the Link List such that all the nodes appear in a single level while 
maintaining the sorted order. Note: The flattened list will be printed using the bottom pointer instead of next 
pointer.*/

package AssignmentQuestions14;

public class Que3 {

	Node head;

	class Node {
		int data;
		Node next, below;

		Node(int data) {
			this.data = data;
			next = null;
			below = null;
		}
	}

	Node merge(Node x, Node y) {
		if (x == null)
			return y;
		if (y == null)
			return x;
		Node result;
		if (x.data < y.data) {
			result = x;
			result.below = merge(x.below, y);
		}
		else {
			result = y;
			result.below = merge(x, y.below);
		}
		result.next = null;
		return result;
	}

	Node singleLink(Node head) {
		if (head == null || head.next == null)
			return head;
		head.next = singleLink(head.next);
		head = merge(head, head.next);
		return head;
	}

}
