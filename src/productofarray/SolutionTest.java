package productofarray;

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
	public void testProductExceptSelf() {
		//ail("Not yet implemented");
		int [] nums = {1,2,3,4};
		
		
		nums = so.productExceptSelf(nums);
		
		System.out.println(nums.toString());
		
		
		
	}

}
