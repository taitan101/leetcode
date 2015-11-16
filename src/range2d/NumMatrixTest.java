package range2d;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumMatrixTest {

	NumMatrix numMatrix;
	
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
		
		int [][] nums = 
			{
				  {3, 0, 1, 4, 2},
				  {5, 6, 3, 2, 1},
				  {1, 2, 0, 1, 5},
				  {4, 1, 0, 1, 7},
				  {1, 0, 3, 0, 5}
			};
		
		
		
		numMatrix = new NumMatrix(nums);
		
		assertTrue(numMatrix.sumRegion(2, 1, 4, 3) == 8);
		assertTrue(numMatrix.sumRegion(1, 1, 2, 2) == 11);
		assertTrue(numMatrix.sumRegion(1, 2, 2, 4) == 12);
//		assertTrue(numMatrix.sumRegion(0, 0, 4, 4) == 9);
		
		
		int [][] nums2 = 
			{

			};
		
		
		
		numMatrix = new NumMatrix(nums2);
		
		assertTrue(numMatrix.sumRegion(0, 0, 0, 0) == 0);
		assertTrue(numMatrix.sumRegion(0, 0, 4, 3) == 0);
		
		
		/*
		 * 
		 * 
		 * sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
		 */
		
		
		
		
//		fail("Not yet implemented");
	}

}
