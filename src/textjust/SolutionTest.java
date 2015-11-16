package textjust;

import static org.junit.Assert.*;

import java.util.List;

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
	public void testFullJustify() {
		//String [] words = {"This", "is", "an", "example", "of", "text", "justification."};
		String [] words = {"a"};
		
		List<String> list = so.fullJustify(words, 1);
		
		
		System.out.println(list.size());
		
		
		
	}

}
