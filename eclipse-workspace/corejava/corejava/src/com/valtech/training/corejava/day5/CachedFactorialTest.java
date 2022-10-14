package com.valtech.training.corejava.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CachedFactorialTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		
		CachedFactorial cf = new CachedFactorial();
		assertEquals(120, cf.factorial(5));
		assertEquals(5040, cf.factorial(7));
	}

}
