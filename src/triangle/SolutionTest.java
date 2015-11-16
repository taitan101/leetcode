package triangle;

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
	public void testSolution() {
		
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		
		
		List<Integer> list;
		
		list = new ArrayList<>();
		list.add(-1);
		
		triangle.add(list);
		
		
		list = new ArrayList<>();
		list.add(2);
		list.add(3);
		
		triangle.add(list);
		
		list = new ArrayList<>();
		list.add(1);
		list.add(-1);
		list.add(-3);
		
		triangle.add(list);			
		
		
		
		//[[-1],[2,3],[1,-1,-3]]
		
		
		
		System.out.println(so.minimumTotal(triangle));
		
		
		//fail("Not yet implemented");
	}

	@Test
	public void testMinimumTotal() {
	//	fail("Not yet implemented");
	}

}
