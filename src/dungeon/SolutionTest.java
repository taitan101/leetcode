package dungeon;

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
	public void testCalculateMinimumHP() {
		
		int [][] dungeon = {{-2,-3,3}, {-5,-10,1},{10,30,-5}};
		
		
		System.out.println(so.calculateMinimumHP(dungeon));
		
		int [][] dungeon2 = {{-3, 5}};
		System.out.println(so.calculateMinimumHP(dungeon2));
		
		int [][] dungeon3 = {{1,-3,3},{0,-2,0},{-3,-3,-3}};
		System.out.println(so.calculateMinimumHP(dungeon3));
		
		
		int [][] dungeon4 = {{100}};
		System.out.println(so.calculateMinimumHP(dungeon4));		

		
		//fail("Not yet implemented");
	}

}
