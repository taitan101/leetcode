package restoreip;

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
	public void testRestoreIpAddresses() {
		
		//"010010"
		
		List<String> list = so.restoreIpAddresses("1111");
		
		System.out.println(list.size());
		
		list = so.restoreIpAddresses("25525511135");
	
		System.out.println(list.size());
		
		list = so.restoreIpAddresses("010010");
		
		System.out.println(list.size());
		
		//fail("Not yet implemented");
	}

}
