package palinked;

import java.util.Stack;

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Solution {
   public boolean isPalindrome(ListNode head) {
	   Stack<Integer> stack = new Stack<>();
	   
	   ListNode curr = head;
	   
	   
	   while (curr != null){
		   stack.push(curr.val);
		   curr = curr.next;
	   
	   }
	   
	   curr = head;
	   
	   while (curr != null){
		   if (curr.val != stack.pop()){
			   return false;
		   }
		   curr = curr.next;
	   
	   }	   
	   
	   
	   
	   return true;
	   
       
   }
}
