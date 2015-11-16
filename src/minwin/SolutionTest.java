package minwin;

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
	public void testMinWindow() {
		
		assertTrue(so.minWindow("aa", "aa").equals("aa"));
		assertTrue(so.minWindow("a", "aa").equals(""));
		assertTrue(so.minWindow("ADOBECODEBANC", "ABC").equals("BANC"));

	}

}
