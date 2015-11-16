package postorder;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import postorder.Solution.TreeNode;

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
	public void test() {
		
		TreeNode root;
		TreeNode left;
		TreeNode right;
		
		
		root = so.new TreeNode(5);
		
		left = so.new TreeNode(3);
		
		right = so.new TreeNode(6);
		
		root.left = left;
		
		root.right = right;
		
		
		
		List<Integer> list = so.postorderTraversal(root);
		
		System.out.println(list.size());
		
	}

}
