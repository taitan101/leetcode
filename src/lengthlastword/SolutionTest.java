package lengthlastword;

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
	public void testLengthOfLastWord() {
		
		assertTrue(so.lengthOfLastWord("Hello World") == 5);
		
		assertTrue(so.lengthOfLastWord("World") == 5);
		
		assertTrue(so.lengthOfLastWord("") == 0);
		assertTrue(so.lengthOfLastWord(" ") == 0);
		assertTrue(so.lengthOfLastWord("    fdf") == 3);
		
		assertTrue(so.lengthOfLastWord("a ") == 1);
		//fail("Not yet implemented");
	}

}
