
/*Given the `head` of a singly linked list, group all the nodes with odd indices together followed by the nodes with 
even indices, and return *the reordered list*.
The **first** node is considered **odd**, and the **second** node is **even**, and so on.
Note that the relative order inside both the even and odd groups should remain as it was in the input.
You must solve the problem in `O(1)` extra space complexity and `O(n)` time complexity.*/

package AssignmentQuestions14;

class ListNode3 {
	 int val;
	 ListNode3 next;
	 ListNode3() {}
	 ListNode3(int val) { this.val = val; }
	 ListNode3(int val, ListNode3 next) { this.val = val; this.next = next; }
	 }
	 
public class Que5 {	 

	    public ListNode3 oddEvenList(ListNode3 head) {
	        if(head==null)
	        return null;
	    ListNode3 head1=head.next;
	         ListNode3 slow=head;
	         ListNode3 fast=head1;
	         ListNode3 c1=slow;
	        ListNode3 c2=fast;
	        
	        while(slow!=null&&fast!=null){
	        	
	            if(slow.next!=null)
	            	c1=slow.next.next;
	            else
	            	c1=null;
	            if(fast.next!=null)
	            	c2=fast.next.next;
	            else 
	            	c2=null;
	            slow.next=c1;
	            fast.next=c2;
	            slow=c1;
	            fast=c2;
	        }
	        ListNode3 l=head;
	        while(l.next!=null){
	            l=l.next;
	        }
	        l.next=head1;
	        return head;
	    }


}
