package search2dmat;

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
	public void testSearchMatrix() {
		int i;
		
		int [][] matrix = {
		                   {1,   3,  5,  7},
		                   {10, 11, 16, 20},
		                   {23, 30, 34, 50}
		                   };
		
		
		for (i = 0; i < 52; i++){
			
			System.out.print(i + ": ");
			System.out.println(so.searchMatrix(matrix, i));
			
		}
		
		System.out.println(so.searchMatrix(matrix, 11));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testBinarysearch() {
		//fail("Not yet implemented");
	}

}
