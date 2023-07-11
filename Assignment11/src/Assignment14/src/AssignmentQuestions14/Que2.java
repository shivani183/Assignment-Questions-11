
/*A number N is represented in Linked List such that each digit corresponds to a node in linked list. 
You need to add 1 to it.*/

package AssignmentQuestions14;

public class Que2 {
	static class Node{
	    int data;
	    Node next;
	    
	    }
	
	public static Node reverse(Node head) {
		Node prev=null;
		Node temp;
		
		while(head!=null ) {
			temp=head.next;
			head.next=prev;
			prev=head;
			head=temp;			
		}
		return head;
	}
	 static Node newNode(int data)
	    {
	        Node new_node = new Node();
	        new_node.data = data;
	        new_node.next = null;
	        return new_node;
	    }

	public static Node addOne(Node head) {
		
		head= reverse(head);
		int sum=0;
		int carry=1;
		Node ans=head;
		Node temp=null;
		
		
		while(head!=null) {
			sum= carry+head.data;
			carry = (sum >= 10) ? 1 : 0;
			sum= sum%10;
			head.data = sum;
			 
            temp = head;
            head = head.next;
		}
		if (carry > 0)
            temp.next = newNode(carry);
 
        return reverse(ans);		
	}

}
