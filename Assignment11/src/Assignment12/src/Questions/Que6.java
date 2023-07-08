package Questions;

public class Que6 {
	
	static class ListNode 
	{ 
	    int data; 
	    ListNode next; 
	}; 

	static void MdeleteN( ListNode head, int M, int N) 
	{ 
		ListNode curr = head, t; 
	    int count; 
	  
	    while (curr!=null) 
	    { 
	        for (count = 1; count < M && curr != null; count++) 
	            curr = curr.next; 
	        if (curr == null) 
	            return; 
	        t = curr.next; 
	        for (count = 1; count <= N && t != null; count++) 
	        { 
	        	ListNode temp = t; 
	            t = t.next; 
	        } 
	        curr.next = t; 
	        curr = t; 
	    } 
	} 

	public static void main(String[] args) {
		

	}

}
