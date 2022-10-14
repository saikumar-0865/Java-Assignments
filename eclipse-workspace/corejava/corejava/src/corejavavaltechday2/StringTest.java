package corejavavaltechday2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String s = "computer programmer";
		String s1 = "computer progrmmer";
		assertTrue(s == s1);
		
		String s2 = "Computer"+" "+"programmer";
		assertTrue(s == s2);
		//final String  s3 = "programmer";
		String  s3 = "programmer";
		String  s4 = "computer"+s3;
		assertTrue(s.equals(s4));
        assertFalse(s == s4);
        
        
        
        
	}

}
