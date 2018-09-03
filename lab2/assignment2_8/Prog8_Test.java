package assignment2_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import assignment2_6.Prog6;

class Prog8_Test {

	@Test
	void test() {
		//fail("Not yet implemented");
		testMinim();
	}
	
	void testMinim() {
		int [] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int minim = Prog8.min(arr);
		assertTrue(minim == -22);
		
	}

}
