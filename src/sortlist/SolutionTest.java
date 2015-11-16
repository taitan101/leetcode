package sortlist;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sortlist.Solution.ListNode;

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
	public void testSortList() {
		ListNode ln = so.new ListNode(4);
		ListNode ln2 = so.new ListNode(1);
		ListNode ln3 = so.new ListNode(0);
		ListNode ln4 = so.new ListNode(-5);
		
		
		ln.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = null;
		
		
		
		ln = so.sortList(ln);
		while (ln != null){
			
			System.out.println(ln.val);
			ln = ln.next;
		}
		

	}

}
