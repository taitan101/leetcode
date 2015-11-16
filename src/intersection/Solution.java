package intersection;

public class Solution {
	
	
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }	
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA;
        ListNode curB;
        int lenA;
        int lenB;
        
        
        lenA = lenB = 0;
        
        curA= headA;
        
        while (curA != null){
            curA = curA.next;
            lenA++;
        }
        
        curB= headB;
        
        while (curB != null){
            curB = curB.next;
            lenB++;
        }
        
        curA = headA;
        curB = headB;
        
        if (lenA > lenB){
            

        
            lenA -= lenB; 
            
            while (lenA > 0){
                curA = curA.next;
                lenA--;
            }

        }else{

        
            lenB -= lenA; 
            
            while (lenB > 0){
                curB = curB.next;
                lenB--;
            }
            
            
            
            
        }
        
        while (curA != null){
            if (curA == curB){
                
                return curA;
            }
            
            curA = curA.next;
            curB = curB.next; 
            
            
            
            
        }
        
        return null;
        

        
    }


}
