
//Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.
/*
Input:
LinkedList = 1 <--> 3 <--> 4
x = 3
Output:1 3
Explanation:After deleting the node at
position 3 (position starts from 1),
the linked list will be now as 1->3.*/

package Questions;

public class Que8 {

	static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	public ListNode deketeNode(ListNode h1, int x) {
		ListNode curr = h1;
		ListNode prev = null;
		int count = 1;

		if (h1 == null || h1.next == null) {
			return null;
		}
		if (count == 1) {
			h1 = h1.next;
			return h1;
		}
		while (curr != null && count < x) {
			curr = curr.next;
			count++;
		}
		if (curr == null)
			return h1;
		if (curr.next != null)
			prev.next = curr.next;
		else {
			prev.next = null;
		}
		curr.next = null;
		prev = null;

		return h1;
	}

}
