package constructBT;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import constructBT.Solution.TreeNode;

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
	public void testBuildTree() {
		
		//int [] inorder = {1,2,3,4};
		
		//int [] postorder = {3,2,4,1};
		
		
		int [] inorder = {1,2,3,4,5};
		
		int [] postorder = {4,3, 5,2,1};		
		
		
		TreeNode root;
		
		
		root = so.buildTree(inorder, postorder);
		
		
		intraversal(root);
		
		posttraversal(root);
		
		
		
		//fail("Not yet implemented");
	}
	
	
	public void intraversal(TreeNode root){
		if (root != null){
			
			intraversal(root.left);
			System.out.println(root.val);
			intraversal(root.right);
			
			
		}
		
		
	}
	
	
	public void posttraversal(TreeNode root){
		if (root != null){
			
			posttraversal(root.left);

			posttraversal(root.right);
			System.out.println(root.val);
			
		}
		
		
	}	
	

	@Test
	public void testRec() {
	//	fail("Not yet implemented");
	}

}
