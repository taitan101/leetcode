package distinctsubseq;

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
	public void testNumDistinct() {
		int result;
		
		

		assertTrue(so.numDistinct("aaaaaa", "aaa") == 20);
		assertTrue(so.numDistinct("aaaaa", "aaa") == 10);
		assertTrue(so.numDistinct("aaaaaaaaaaaaa", "aaa") == 286);
		assertTrue(so.numDistinct("aabb", "abb") == 2);
		assertTrue(so.numDistinct("rabbbit", "rabbit") == 3);
		
		

		
		assertTrue(so.numDistinct("rabbit", "rabbit") == 1);		
		
		System.out.println(so.numDistinct("adbdadeecadeadeccaeaabdabdbcdabddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeabcddcebddebeebedaecccbdcbcedbdaeaedcdebeecdaaedaacadbdccabddaddacdddc", "bcddceeeebecbc"));
		
		//assertTrue(so.numDistinct("bccbcdcabadabddbccaddcbabbaaacdba", "bccbbdc") == 0);	
		
		
		
		
		

		
		
	}

}
