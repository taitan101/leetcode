package isostr;

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
		//fail("Not yet implemented");
		
		assertTrue(so.isIsomorphic("egg", "add"));
		assertTrue(!so.isIsomorphic("foo", "bar"));
		assertTrue(so.isIsomorphic("paper", "title"));
		assertTrue(so.isIsomorphic("13", "42"));
		assertTrue(!so.isIsomorphic("ab", "aa"));
	}

	/**
	 * 
	 * Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
