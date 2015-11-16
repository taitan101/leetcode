package decodeways;

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
	public void testNumDecodings() {
		System.out.println(so.numDecodings("0"));
		System.out.println(so.numDecodings("10"));
		System.out.println(so.numDecodings("11"));
		System.out.println(so.numDecodings("111"));
		System.out.println(so.numDecodings("1111"));
		System.out.println(so.numDecodings("11111"));
		System.out.println(so.numDecodings("111111"));
		
		//fail("Not yet implemented");
	}

}
