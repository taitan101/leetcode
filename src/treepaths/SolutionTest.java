package treepaths;

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
	public void testBinaryTreePaths() {
		//fail("Not yet implemented");
		TreeNode root;
		TreeNode left;
		TreeNode right;
		List<String> list;
		
		
		root = new TreeNode(5);
		
		left = new TreeNode(3);
		
		right = new TreeNode(6);
		
		root.left = left;
		
		root.right = right;
		
		
		list = so.binaryTreePaths(root);
		
		
		root = null;
		
		
		
		
		
	}

}
