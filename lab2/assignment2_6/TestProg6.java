package assignment2_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.io.IOException;

class TestProg6 {

	@Test
	void test() {
		//fail("Not yet implemented");
		testRemoveDups();
	}
	
	
	void testRemoveDups() {
		String [] testData = {"horse", "dog", "cat", "horse","dog"};
		String[] result = Prog6.removeDups(testData);
		
		String[]etalon = {"ho0rse", "dog", "cat"};
		/*
		assertTrue(result.length == etalon.length);
		
		for (int i = 0; i < result.length;i++) {
			assertTrue(result[i] == etalon[i] );
		}
		*/
		
		Assert.assertArrayEquals(result, etalon);
	}

}
