
/*Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive 
integer smaller than or equal to length of the linked list.*/

package AssignmentQuestions14;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }

public class Que6 {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode curr = head;
        int length = 1;
        while(curr.next != null){
            length++;
            curr = curr.next;
        }
        curr.next = head;
        k = length - k % length;
        while(k-- > 0) 
        	curr = curr.next;
        	head = curr.next; 
        	curr.next = null;
        	return head;
    }

}
