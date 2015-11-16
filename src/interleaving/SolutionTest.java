package interleaving;

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
	public void testIsInterleave() {
		
		String s1 = "aabcc";
		String s2 = "dbbca";

		String s3 = "aadbbcbcac";
		String s4 = "aadbbbaccc"; 
						
						
						
		System.out.println(so.isInterleave("aa", "ab", "abaa"));
		System.out.println(so.isInterleave(s1, s2, s3));
		System.out.println(so.isInterleave(s1, s2, s4));
		
		//fail("Not yet implemented");
	}

}
