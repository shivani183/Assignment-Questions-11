
/*Given two sorted linked lists consisting of N and M nodes respectively. The task is to merge both of the lists (in place
) and return the head of the merged list.

Input: a: 5->10->15, b: 2->3->20
Output: 2->3->5->10->15->20*/

package Questions;

public class Que6 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		
		if(l1.val<l2.val) {
			l1.next=mergeTwoLists(l1.next, l2);
			return l1;
		}else
			{l2.next=mergeTwoLists(l1, l2.next);
			return l2;}
	}

}
