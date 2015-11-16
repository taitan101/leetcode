package rotatelist;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode current;
        ListNode pre;
        
        int count;
        int i;
        
        
        
        count = 0;
        current = head;
        
        while (current != null){
            count++;
            current = current.next;
            
        }
        
        k %= count;
        
        
        
        if (k == 0){
        	return head;
        }
        
        
        dummy.next = head;
        
        current = head;
        
        i = 0;
        pre = null;
        
        while (i < count - k){
            pre = current;
            current = current.next;
            i++;
            
        }


        
        pre.next = null;

        
        
        
        dummy.next = current;
        
        i = 1;
        while (i < k){
            current = current.next;
            i++;
        }
        
        current.next = head;
        
        
        return dummy.next;
        
        
        
        
        
        
        
        
    }
	
	
	
}
