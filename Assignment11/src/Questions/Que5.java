
/*Given a linked list and a key to be deleted. Delete last occurrence of key from linked. The list may have duplicates.
Input:   1->2->3->5->2->10, key = 2
Output:  1->2->3->5->10*/

package Questions;

public class Que5 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }
	
	static ListNode deleteLast(ListNode head,int x){
		ListNode curr = head;
		ListNode prev = null;
	      
	    while (curr != null){
	        if (curr.val == x)
	            prev = curr;
	        curr = curr.next;
	    }
	    
	    if (prev != null && prev.next == null){
	        curr = head;
	        while (curr.next != prev)
	        {
	            curr = curr.next;
	        }
	        curr.next = null;
	    }
	      
	    if (prev != null && prev.next != null){
	        prev.val = prev.next.val;
	        curr = prev.next;
	        prev.next = prev.next.next;
	    }
	    return head;
	}

}
