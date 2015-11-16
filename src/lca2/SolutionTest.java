package lca2;

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
	public void testLowestCommonAncestor() {
		
		TreeNode root = new TreeNode(50);
		TreeNode p = new TreeNode(100);
		TreeNode q = new TreeNode(150);
		TreeNode tn1 = new TreeNode(200);
		TreeNode tn2 = new TreeNode(250);
		
		
		root.right = tn1;
		root.left = p;
		
		tn1.left = q;
		
		so.lowestCommonAncestor(root, p, q);
		
		//fail("Not yet implemented");
	}

	@Test
	public void testRec() {
		//fail("Not yet implemented");
	}

}
