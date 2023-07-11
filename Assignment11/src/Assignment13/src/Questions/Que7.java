
/*Given a Doubly Linked List, the task is to reverse the given Doubly Linked List.
Original Linked list 10 8 4 2
Reversed Linked list 2 4 8 10
*/
package Questions;

public class Que7 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }
	
	public ListNode mergeTwoLists(ListNode h1){
		ListNode curr=h1;
		ListNode prev=null;
		
		while(curr!=null) {
			ListNode temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
		
		
	}

}
