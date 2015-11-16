package wordpattern;

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
	public void testWordPattern() {
		//fail("Not yet implemented");
		
		
		System.out.println(so.wordPattern("abba", "dog cat cat dog"));
		System.out.println(so.wordPattern("abba", "dog cat cat fish"));
		System.out.println(so.wordPattern("aaaa", "dog cat cat dog"));
		System.out.println(so.wordPattern("abba", "dog dog dog dog"));		
		
		
	}

}
