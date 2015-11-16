package constructBT2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import constructBT2.Solution.TreeNode;

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
		

		
		
		//int [] preorder = {1,2,3};
		
		//int [] inorder = {2,1,3};		
		
		
		//int [] preorder = {1,2,3};
		
		//int [] inorder = {2,1,3};
		
		int [] preorder = {1,2,3};
		
		int [] inorder = {1,2,3};
		
		TreeNode root;
		
		
		root = so.buildTree(preorder, inorder);
		
		
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
