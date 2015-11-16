package intersection;

import static org.junit.Assert.*;
import intersection.Solution.ListNode;

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
	public void testGetIntersectionNode() {
		
		ListNode node1 = so.new ListNode(1);
		ListNode node3 = so.new ListNode(3);
		ListNode node5 = so.new ListNode(5);
		ListNode node2 = so.new ListNode(2);
		
		
		node1.next = node3;
		node3.next = node5;
		node5.next = null;
		
		node2.next = null;
		
		//headA = node1;
		
		//headB = node2;
		
		ListNode result;
		result = so.getIntersectionNode(node1, node2);
		
		if (result == null){
			System.out.println("null");
		}else{
			System.out.println(result.val);
			
		}
		
		//fail("Not yet implemented");
	}

}
