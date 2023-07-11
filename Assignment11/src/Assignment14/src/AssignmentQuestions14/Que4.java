
/*You are given a special linked list with **N** nodes where each node has a next pointer pointing to its 
next node. You are also given **M** random pointers, where you will be given **M** number of pairs denoting 
two nodes **a** and **b**  **i.e. a->arb = b** (arb is pointer to random node)**.**

Construct a copy of the given list. The copy should consist of exactly **N** new nodes, where each new node 
has its value set to the value of its corresponding original node. Both the next and random pointer of the new 
nodes should point to new nodes in the copied list such that the pointers in the original list and copied list 
represent the same list state. None of the pointers in the new list should point to nodes in the original list.*/


package AssignmentQuestions14;

import java.util.*;

class Node {
	int val;
	Node next;
	Node random;

	public Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}

public class Que4 {

	public Node copyRandomList(Node head) {
		
		HashMap<Node, Node> hm = new HashMap<>();
		
		Node temp = head;
		while (temp != null) {
			hm.put(temp, new Node(temp.val));
			temp = temp.next;
		}
		temp = head;
		while (temp != null) {
			hm.get(temp).next = hm.get(temp.next);
			hm.get(temp).random = hm.get(temp.random);
			temp = temp.next;
		}

		return hm.get(head);
	}

}
