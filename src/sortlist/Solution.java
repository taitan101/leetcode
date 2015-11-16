package sortlist;

public class Solution {
	
	
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }

    public ListNode sortList(ListNode head) {
        int nums;
        ListNode current;

        
        nums = 0;
        current = head;
        
        
        while (current != null){
            current = current.next;
            nums++;
        }
        
        
        return rec(head, nums);
        
  
    }
    
    
    private ListNode rec(ListNode head, int nums){
        ListNode current;
        ListNode current2;
        

        ListNode dummy;
        ListNode sorted;        
        
        int i;
        int j;
        int first;
        int second;
        
        if (nums <= 1){
            
            
            
            return head;
            
            
            
        }else{
             
             
             current2 = head;
             i = 0;
             first = nums >>1;
             second = nums - first;
             
             
             while (i < first){
                 current2 = current2.next;
                 i++;
             }
             
            
            current = rec(head, first);
            current2 = rec(current2, second);

            i = 0;
            j = 0;
            
            

            dummy = new ListNode(0);
            sorted = dummy;
            
            
            
            
            while (i < first && j < second){
                if (current.val < current2.val){
                    
                    sorted.next = current;
                    sorted = sorted.next;                    
                    
                    current = current.next;
                    i++;
                    

                    
                    
                }else{
                    sorted.next = current2;
                    sorted = sorted.next;
                    
                    current2 = current2.next;
                    j++;
                    
                }

            }
            
            while (i < first){

                    
                    sorted.next = current;
                    sorted = sorted.next;                    
                    
                    current = current.next;
                    i++;
                    


            } 
            
            while (j < second){

                    sorted.next = current2;
                    sorted = sorted.next;
                    
                    current2 = current2.next;
                    j++;
                    


            }
            
            sorted.next = null;
            
            
            

            
            
        }

        return dummy.next;
        
    }	
	
}
