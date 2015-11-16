package pow;

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
	public void testMyPow() {
		
		
		//0.00001, 2147483647
		assertTrue(so.myPow(1.00000, -2147483648) == 0.0009765625 );
		assertTrue(so.myPow(10, -1) == 0.1);
		assertTrue(so.myPow(1.0, 0) == 1.0);
	}

}
