package lis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {
	
	Solution so = new Solution();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int [] nums = {1,3,6,7,9,4,10,5,6};
		
		System.out.println(so.lengthOfLIS(nums));
		
		int [] nums2 = {10,9,2,5,3,7,101,18};
	
		System.out.println(so.lengthOfLIS(nums2));
		
		
		int [] nums3 = {3,5,6,2,5,4,19,5,6,7,12};
		

		
		System.out.println(so.lengthOfLIS(nums3));
	
		
		
		fail("Not yet implemented");
	}

}
