
/*Write a function that takes a list sorted in non-decreasing order and deletes any duplicate nodes from the list. 
The list should only be traversed once.For example if the linked list is 11->11->11->21->43->43->60 then 
removeDuplicates() should convert the list to 11->21->43->60.
Example 1:Input: LinkedList: 11->11->11->21->43->43->60   Output: 11->21->43->60*/

package Questions;

public class Que2 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }
	
	public ListNode removeDuplicate( ListNode h1) {
		
		ListNode curr=h1;
		
		while(curr!=null && curr.next!=null) {
			if(curr.val==curr.next.val)
				curr.next=curr.next.next;
			else
				curr=curr.next;
		}
		return h1;
		
		
		
	}
	
	

}
