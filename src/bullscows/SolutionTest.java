package bullscows;

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
	public void test() {
		
		System.out.println(so.getHint("1807", "7810"));
		System.out.println(so.getHint("1122", "1222"));
		System.out.println(so.getHint("11", "10"));
		System.out.println(so.getHint("1122", "3456"));
		
		fail("Not yet implemented");
	}

}
