package rotatelist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {
	
	
	Solution so;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		so = new Solution();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRotateRight() {
		int k = 2;
		
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ListNode rotated;
		
		
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = null;
		
		
		rotated = so.rotateRight(ln1, k);
		printList(rotated);
		
		
		rotated = so.rotateRight(rotated, 5);
		printList(rotated);
		
		
		rotated = so.rotateRight(rotated, 18);
		printList(rotated);		
		
		//fail("Not yet implemented");
	}
	
	
	public void printList(ListNode head){
		while (head != null){
			System.out.println(head.val);
			
			head = head.next;
			
			
		}
		
		
		
		
		
	
	}

}
