package sede;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodecTest {
	
	Codec codec = new Codec();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		TreeNode root;
		String data = "10<()>()";
		String result;
		
		root = codec.deserialize(data);
		
		result = codec.serialize(root);
		
		System.out.println(result);
		
		root = codec.deserialize(data);
		
		result = codec.serialize(root);
		
		System.out.println(result);		
		
		
		
		fail("Not yet implemented");
	}
	
	private void print(TreeNode root){
		
		
		
		
	}

}
