package addop;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
	public void testAddOperators() {
		//fail("Not yet implemented");
		
		List<String> list = new ArrayList<String>();
		
		list = so.addOperators("123", 6);
		
		System.out.println(list.size());

		
		assertTrue(list.size() == 2);
		
		list = so.addOperators("232", 8);
		
		System.out.println(list.size());

		
		assertTrue(list.size() == 2);		
		
		

	}

}
