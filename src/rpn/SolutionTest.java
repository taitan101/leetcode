package rpn;

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
	public void testEvalRPN() {
		
		String [] tokens = {"2", "1", "+", "3", "*"};
		String [] tokens2 = {"4", "13", "5", "/", "+"};
		
		
		System.out.println(so.evalRPN(tokens));
		System.out.println(so.evalRPN(tokens2));
		//fail("Not yet implemented");
	}

}
