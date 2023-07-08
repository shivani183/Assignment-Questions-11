
/*Given two linked lists, insert nodes of second list into first list at alternate positions of first list.
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become 
5->12->7->10->17->2->13->4->11->6 and second list should become empty. The nodes of second list should only be 
inserted when there are positions available. For example, if the first list is 1->2->3 and second list is 4->5->6->7->8,
then first list should become 1->4->2->5->3->6 and second list to 7->8.
Use of extra space is not allowed (Not allowed to create additional nodes), i.e., insertion must be done in-place.
Expected time complexity is O(n) where n is number of nodes in first list.*/

package Questions;


public class Que7 {
	
	ListNode head;
	static class ListNode 
	{ 
	    int data; 
	    ListNode next; 
	}; 

	void merge(Que7 q)
    {
		ListNode p_curr = head, q_curr = q.head;
		ListNode p_next, q_next;
  
        while (p_curr != null && q_curr != null) {
  
            p_next = p_curr.next;
            q_next = q_curr.next;
  
            q_curr.next = p_next; 
            p_curr.next = q_curr; 
  
            p_curr = p_next;
            q_curr = q_next;
        }
        q.head = q_curr;
    }
	public static void main(String[] args) {
		

	}

}
