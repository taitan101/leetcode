package rotate;

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
	public void testRotate() {
		//int [][] ma = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] ma = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		so.rotate(ma);
		
		int i;
		int j;
		
		for (i = 0; i < ma.length; i++){
			
			for (j = 0; j < ma.length; j++){			
				System.out.print(ma[i][j]);
				System.out.print("\t");
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

}
