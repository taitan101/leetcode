package wordladder;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

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
	public void testLadderLength() {
		String beginWord = "hit";
		String endWord = "cog";
		Set<String> wordDict = new HashSet<>();
		
		//["hot","dot","dog","lot","log"]
		
		
		
		wordDict.add("hot");
		wordDict.add("dot");
		wordDict.add("dog");
		wordDict.add("lot");
		wordDict.add("log");
		
		
		System.out.println(so.ladderLength(beginWord, endWord, wordDict));
		
		//fail("Not yet implemented");
	}

}
