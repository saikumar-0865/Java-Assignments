package corejavavaltechday2;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class PointSetTest {
	
	
	public void testTreeSet(){
		Set<Point> points = new TreeSet<>();
		
		points.add(new Point(2,3));
		
		assertEquals(1,  points.size());
		
        points.add(new Point(2,3));
		
		assertEquals(1,  points.size());
		
        points.add(new Point(3,3));
		
		assertEquals(1,  points.size());
		
        points.add(new Point(3,2));
		
		assertEquals(1,  points.size());
	
	
	
	
	}	
	public  void testSetOfPoints() {
		Set<Point>  points = new HashSet<>();
		
		points.add(new Point(2,3));
		
		assertEquals(1, points.size());
		
		points.add(new Point(2,3));
		
		assertEquals(1, points.size());
		
		
		
		
		
		
	} 

	public void testSetOfStringsWithGenerics() {
		
		Set<String> mywords = new HashSet<>();
		
		mywords.add("Hello");
		mywords.add("How");
		mywords.add("You");
		mywords.add("Are");
		mywords.add("You");
		//mywords.add(123);
		
		for (Iterator iterator = mywords.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
	}
	
	public void testSetOfString() {
		
		Set setOfStrings = new HashSet();
		
		setOfStrings.add("hello");
		assertEquals(1, setOfStrings.size());
		
		setOfStrings.add("hello");
		
		assertEquals(2, setOfStrings.size());
		
		
		
		for (Iterator iterator = setOfStrings.iterator();iterator.hasNext();) {
			
			Object object  = (Object) iterator.next();
			
			String s = (String)object;
			
			System.out.println(s);
			
		}
		
		
	}

}
