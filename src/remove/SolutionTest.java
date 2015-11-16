package remove;

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
	public void testRemoveDuplicates() {
		int [] nums = {1,1,2,4444,55555,6666666,6666666,6666666,6666666};
		
		
		System.out.println(so.removeDuplicates(nums));
		
		//fail("Not yet implemented");
	}

}
