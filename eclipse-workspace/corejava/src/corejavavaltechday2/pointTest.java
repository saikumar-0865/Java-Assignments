package corejavavaltechday2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import corejava.point;

class pointTest {
	
	
	public void testEquals(){
		
		point p = new point(2,3);
		
		point p1 = new point(2,3);
		
		point p2 = p;
		
		assertTrue(p == p2);
		assertFalse(p == p1);
		
		assertTrue(p.equals(p1));
		assertEquals(p.hashCode(), p1.hashCode());
		
		
	}	
	
	public void testDistance() {
		
		point p = new point();
		assertEquals(0.0, p.distance(), 0.0000001);
		
		p = new point(10, 20);
		
		assertEquals(Math.sqrt(10*10+20*20), p.distance(),0.0000001);
		
	} 
	
	
	
	
	public void testSetGet() {
		point p = new point();
		
		
		p.setX(10);
		assertEquals(10, p.getX());
		
		p.setY(20);
		assertEquals(20, p.getY());
		
		
	}

		
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	
	
	public void testpointCtor() {
		
		point p = new point();
		
		assertEquals(0, p.getX());
		
		assertEquals(0, p.getY());
	}

}
