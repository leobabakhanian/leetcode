
public class ReverseLinkedList {
	
	// Definition for singly-linked list.
	public class ListNode {
				
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	// Given the head of a singly linked list, reverse the list, and return the reversed list.
	public ListNode reverseList(ListNode head) {
	        
		ListNode prev = null, curr = head;
		
		while(curr != null) {
			
			ListNode next = head.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}
