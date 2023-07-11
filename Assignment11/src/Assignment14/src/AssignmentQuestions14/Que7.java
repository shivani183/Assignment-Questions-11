
/*You are given the `head` of a linked list with `n` nodes.
For each node in the list, find the value of the **next greater node**. That is, for each node, 
find the value of the first node that is next to it and has a **strictly larger** value than it.
Return an integer array `answer` where `answer[i]` is the value of the next greater node of the `ith` 
node (**1-indexed**). If the `ith` node does not have a next greater node, set `answer[i] = 0`.*/

package AssignmentQuestions14;
import java.util.*;

public class Que7 {
	    public int[] nextLarger(Node head) {
	        
	       Node curr= head;
	       List<Integer> ans= new ArrayList<>();
	       while(curr != null){
	           ans.add(curr.val);
	           curr=curr.next;
	       }
	       int[] result = new int[ans.size()];
	       for(int i=0;i<ans.size();i++){
	           int req = ans.get(i);
	           int next=i+1;
	                while(next<ans.size()){
	                    if(ans.get(next)>req){
	                        result[i] = ans.get(next);
	                        break;
	                    }
	                    next++;
	                }
	       }
	       return result;
	    }
}
