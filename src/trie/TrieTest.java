package trie;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrieTest {
	
	
	

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
		
		Trie trie = new Trie();
		
		trie.insert("ab");
		
		System.out.println(trie.search("a"));
		System.out.println(trie.startsWith("a"));
		
		
		//fail("Not yet implemented");
	}

}
