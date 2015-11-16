package maxpoints;

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
	public void testMaxPoints() {
		Point [] points = new Point[3];
		
		points[0] = new Point(0,0);
		
		points[1] = new Point(1,1);
		
		points[2] = new Point(0,0);

		//points[5] = new Point(4,3);		
		System.out.println(so.maxPoints(points));
		
		
		
		//fail("Not yet implemented");
	}

}
