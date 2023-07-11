
/*Given two linked list of the same size, the task is to create a new linked list using those linked lists. The condition 
is that the greater node among both linked list will be added to the new linked list.*/

//Input: list1 = 5->2->3->8
/*list2 = 1->7->4->5
Output: New list = 5->7->4->8

Input:list1 = 2->8->9->3
list2 = 5->3->6->4
Output: New list = 5->8->9->4*/

package Questions;


public class Que1 {
	
	static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
	
	public ListNode MergeLarge( ListNode h1, ListNode h2) {
		
		if(h1==null)
			return h2;
		if(h2==null)
			return h1;
		
		if(h1.val>h2.val) {
			h1.next=MergeLarge(h1.next, h2.next);
			return h1;
		}else {
			h2.next=MergeLarge(h1.next, h2.next);
			return h2;
		}
			
	}

}
