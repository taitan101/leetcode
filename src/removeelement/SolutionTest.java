package removeelement;

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
	public void testRemoveElement() {
		
		int result;
		int [] nums = {2};
		
		result = so.removeElement(nums, 3);
		
		assertTrue(result == 1);
		
		int [] nums2 = {3, 3};
		
		result = so.removeElement(nums, 3);
		
		assertTrue(result == 0);
		
		
		
		//fail("Not yet implemented");
	}

}
