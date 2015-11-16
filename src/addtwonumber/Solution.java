package addtwonumber;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Solution so = new Solution();
		
		so.test();
		
	}
	
	
	public void test(){
		
		ListNode l1;
		ListNode l2;
		ListNode tmp;
		
		Solution so = new Solution();

		
		l1 = new ListNode(9);
		l1.next = new ListNode(8);
		l1.next.next = null;
		
		
		l2 = new ListNode(1);
		
		
		
		tmp = new ListNode(9);
		l2.next = null;
		tmp.next = new ListNode(9);
		
		
		tmp.next.next = null;
		
		
		tmp = addTwoNumbers(l1,  l2);
		
		while (tmp != null){
			System.out.print(tmp.val);
			
			System.out.print(',');
			
			
			tmp = tmp.next;
			
		}
		
	}
	
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	int cin;
    	int value;
    	ListNode head;
    	ListNode pre;
    	
    	cin = 0;
    	head = l1;
    	
    	pre = null;
    	while (l1 != null && l2 != null){
    		value = l1.val + l2.val + cin;
    		
    		if (value >= 10){
    			cin = 1;
    			l1.val =  value - 10;
    		}else{
    			cin = 0;
    			l1.val =  value;
    		}
    		
    		pre = l1;
    		
    		l1 = l1.next;
    		l2 = l2.next;
    	}
    	
    	
    	if (l1 == null && l2 == null && cin == 1){
    		pre.next = new ListNode(1);
    		pre.next.next = null;
    		
    	}else if (l1 != null){
    	
    	
    		while (l1 != null){
    			value = l1.val + cin;
    		
    			if (value >= 10){
    				cin = 1;
    				l1.val = value - 10 ;
    			}else{
    				
    				l1.val = value;
    				cin = 0;
    				break;
    			
    			}
    			pre = l1;
    			l1 = l1.next;
    		}
    		if (cin == 1){
    			pre.next = new ListNode(1);
    			pre.next.next = null;    		
    		
    		}
    	}else if (l2 != null){
    	
    	
    	
    		pre.next = l2;
    		while (l2 != null){
    			value = l2.val + cin;
    		
    			if (value >= 10){
    				cin = 1;
    				l2.val = value - 10;
    			}else{
    				
    				l2.val = value;
    				cin = 0;
			
    				
    				break;
    			
    			}
    			pre = l2;
    			l2 = l2.next;
    		}
    		if (cin == 1){
    			pre.next = new ListNode(1);
    			pre.next.next = null;    		
    		
    		}
    	}
    	
	
    	return head;
    }
    
    
    public class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
    }

}
