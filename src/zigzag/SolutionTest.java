package zigzag;

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
	public void testZigzagLevelOrder() {
		TreeNode root;
		TreeNode left;
		TreeNode right;
		
		
		root = new TreeNode(5);
		
		left = new TreeNode(3);
		
		right = new TreeNode(6);
		
		root.left = left;
		
		root.right = right;
		
		right.right = new  TreeNode(100);
		right.left = new  TreeNode(4);
		
		
		
		List<List<Integer>> lists = so.zigzagLevelOrder(root);
		
		System.out.println(lists.size());
		print(lists);
	}
	
	
	private void print(List<List<Integer>> lists){
		
		//List<Integer> list;
		int i;
		
		
		for (List<Integer> list : lists){
			
			for (i = 0; i < list.size(); i++){
				System.out.print(list.get(i));
				
			}
			System.out.println();
			
			
			
		}
		
		
		
	}

}
