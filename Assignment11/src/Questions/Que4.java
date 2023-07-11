
/*Given a linked list, write a function to reverse every alternate k nodes (where k is an input to the function)
in an efficient way. Give the complexity of your algorithm.
Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
Output:   3->2->1->4->5->6->9->8->7->NULL.*/

package Questions;

public class Que4 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }

		public ListNode reverse(ListNode h1, int k) {
		
			ListNode prev = null;
		    ListNode curr = h1;
		    ListNode temp = h1;
		    
		    int count = 0; 
		    int check = k; 
		
		    while(check != 0) {
				if(temp==null)
					return h1;
				temp=temp.next;
				check--;
			}
		
		while(curr != null && count < k)
	    {
	        temp = curr.next;
	        
	        curr.next = prev;
	        
	        prev = curr;
	        curr = temp;
	        
	        count++;
	    }
		if(h1!=null) {
			h1.next=curr;
		}
		count=0;
		
		while(count<k-1 && curr!=null) {
			curr=curr.next;
			count++;
		}
	    
	    if(temp != null)
	    {
	        h1.next = reverse(temp, k); 
	        }
	    
	    return prev;
		
		
		
		
		
	}
	
	

}
