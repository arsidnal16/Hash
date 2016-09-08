package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthNode {
	
	static ListNode root;

	public static void main(String[] args) {
		
		
	
	}

	private static ListNode removeNode(ListNode root, int n) {
		
		 ListNode fast = root;
		 ListNode slow = root;
			
			for(int i=0; i< n; i++){
				fast = fast.next;	
			}
			
			 //if remove the first node
			if(fast == null){
				root =root.next;
				return root;
				}
			
			while(fast.next !=null){
				fast = fast.next;
				slow = slow.next;
				}
			
		    slow.next = slow.next.next;
		    
		    return slow;	
		
	}

}
