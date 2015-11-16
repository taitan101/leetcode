package reversedlinked;



class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}	
public class Solution {
	

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i;
        ListNode dummy = new ListNode(0);
        ListNode pre;
        ListNode temp;
        ListNode curr;
        ListNode pre2;
        dummy.next = head;
        
        i = 0;
        
        curr = dummy;
        //pre = null;
        while (i < m){
            //pre = curr;
            curr = curr.next;
            i++;
        }
        pre = curr;
        curr = curr.next;
        pre2 = curr;
        
        while (i < n){
            temp = curr.next;
            curr.next.next = curr;
            curr = temp;
            i++;
        }
        
        pre.next = curr;
        
        pre2.next = curr.next;
        
        return head;
        
        
        
        
        
        
    }	

}
