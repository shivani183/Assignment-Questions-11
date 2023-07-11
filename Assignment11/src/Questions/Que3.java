
/*Given a linked list of size N. The task is to reverse every k nodes (where k is an input to the function) 
in the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should be 
considered as a group and must be reversed (See Example 2 for clarification).*/

/*
Input:
LinkedList: 1->2->2->4->5->6->7->8
K = 4
Output:4 2 2 1 8 7 6 5
Explanation:
The first 4 elements 1,2,2,4 are reversed first
and then the next 4 elements 5,6,7,8. Hence, the
resultant linked list is 4->2->2->1->8->7->6->5.
*/

package Questions;

public class Que3 {
	
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	      }

		public ListNode removeDuplicate(ListNode h1, int k) {
		
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
	    
	    if(temp != null)
	    {
	        h1.next = removeDuplicate(temp, k); 
	        }
	    
	    return prev;
		
		
		
		
		
	}
	
	

}
