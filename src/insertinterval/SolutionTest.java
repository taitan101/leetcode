package insertinterval;

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
	public void testInsert() {
		
		//[1,3],[6,9]
		List<Interval> input = new ArrayList<>();
		List<Interval> input2 = new ArrayList<>();
		
		Interval in;
		Interval newIn;
		
		in = new Interval(1, 3);
		input.add(in);
		in = new Interval(6, 9);
		input.add(in);
	
		newIn = new Interval(2, 5);
		
		
		so.insert(input,  newIn);
		

		//[1,2],[3,5],[6,7],[8,10],[12,16]
		
		input.clear();
		
		
		in = new Interval(1, 2);
		input.add(in);
		in = new Interval(3, 5);
		input.add(in);
		
		in = new Interval(6, 7);
		input.add(in);
		in = new Interval(8, 10);
		input.add(in);
		
		in = new Interval(12, 16);
		input.add(in);

	
		newIn = new Interval(4, 9);
		
		
		so.insert(input,  newIn);
				
		
		
		input.clear();
		
		
		in = new Interval(1, 2);
		input.add(in);
		in = new Interval(3, 5);
		input.add(in);
		
		in = new Interval(6, 7);
		input.add(in);


	
		newIn = new Interval(0, 9);
		
		
		so.insert(input,  newIn);		
		
		
		
		
		
		
		
		
		
		//fail("Not yet implemented");
	}

}
