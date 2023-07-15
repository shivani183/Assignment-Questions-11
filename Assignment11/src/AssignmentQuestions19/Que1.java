
/*You are given an array of `k` linked-lists `lists`, each linked-list is 
sorted in ascending order.
*Merge all the linked-lists into one sorted linked-list and return it**/

package AssignmentQuestions19;

import java.util.*;

class ListNode {
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

public class Que1 {

	public ListNode mergeKLists(ListNode[] lists) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < lists.length; i++) {
			while (lists[i] != null) {
				list.add(lists[i].val);
				lists[i] = lists[i].next;
				System.out.println(" ");
			}
		}

		Collections.sort(list);
		ListNode head = null;

		if (list.size() > 0)
			head = new ListNode(list.get(0));
		else
			return head;

		ListNode curr = head;

		for (int i = 1; i < list.size(); i++) {
			curr.next = new ListNode(list.get(i));
			curr = curr.next;
		}

		curr.next = null;

		return head;
	}

}
