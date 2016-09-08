package linkedlist;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean hasCycle(ListNode root){
		ListNode fast = root;
		ListNode slow = root;
		
		while(fast.next!=null && fast!=null){
			fast = fast.next.next;
			slow =slow.next;
		
		
		if(fast == slow){
			return true;
			}
		}
		return false;
	}

}
