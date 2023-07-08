
/*Given a singly linked list, find if the linked list is [circular].
A linked list is called circular if it is not NULL-terminated and all nodes are connected in the form
of a cycle. Below is an example of a circular linked list.*/


package Questions;


public class Que8 {
	
	class ListNode 
	  { int val; ListNode next; ListNode(int d) { 
		  next = null; 
		  val =d; }
	  }
	 
	public static void main(String args[])
  {
  }
  static boolean removeLoop(ListNode head)
  {
  	ListNode slow = head;
  	ListNode fast = head;
      boolean flag = false;

      while (slow !=null && fast!=null && fast.next!=null) {
      	slow = slow.next;
      	fast = fast.next.next;
      	if(slow==fast)
      		return true;
      }
		return false;
  }

}
