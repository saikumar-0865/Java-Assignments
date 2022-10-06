package valtech.assignment;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PasswordstrengthTest {
	
	
	@Test
	public void testcheckLower() {
		Passwordstrength lwr = new Passwordstrength();
		 assertEquals(false, lwr.checkSmaller("abcdef"));
	}
	
	
	@Test
	public void testcheckUpper() {
		Passwordstrength upr = new Passwordstrength();
		 assertEquals(true, upr.checkCapital("ABCDEFGHIJKLMN"));
	}
	
	
	@Test
	public void testcheckDigit() {
		Passwordstrength dig = new Passwordstrength();
		 assertEquals(true, dig.checkCapital("1,2,3,4,5,6,7,8,9"));
	}
	
	
	@Test
	public void testcheckSpclChar() {
		Passwordstrength splch = new Passwordstrength();
		 assertEquals(19, splch.checkSpecialChars("!@#$%^&*"));
	}

	@Test
	public void testPasswordStrength() {
		String a="Vh#125aa";
		Passwordstrength pc=new Passwordstrength();
		assertEquals("Moderate", pc.checkPasswordStrength(a));
		assertEquals(22,pc.total);
	}
	
}


























































/*package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;  

import org.junit.Test;

public class PasswordstrengthTest {

	
	@Test
	public void testcheckLower() {
		 Passwordstrength lwr = new Passwordstrength();
		 assertEquals(false, lwr.checklower("abcdef"));
	}
	
	
	@Test
	public void testcheckUpper() {
		 Passwordstrength upr = new Passwordstrength();
		 assertEquals(true, upr.checkupper("ABCDEFGHIJKLMN"));
	}
	
	
	@Test
	public void testcheckDigit() {
		 Passwordstrength dig = new Passwordstrength();
		 assertEquals(true, dig.checkupper("1,2,3,4,5,6,7,8,9"));
	}
	
	
	@Test
	public void testcheckSpclChar() {
		 Passwordstrength splch = new Passwordstrength();
		 assertEquals(19, splch.checkspecialchar("!@#$%^&*"));
	}
	
	@Test
	public void testPasswordStrength() {
		String a="Valtech@2045";
		Passwordstrength ps=new Passwordstrength();
		
		assertEquals("Strong", ps.checkPasswordStrength(a));
		System.out.println(ps.value);
	}
}*/





































/*package com.valtech.training.corejava.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordstrengthTest {

	@Test
	public void testPasswordStrength() {
		String a="Valtech@2045";
		Passwordstrength p=new Passwordstrength();
		
		assertEquals("Strong", p.checkPasswordStrength(a));
		System.out.println(p.value);
	}
	
}
*/