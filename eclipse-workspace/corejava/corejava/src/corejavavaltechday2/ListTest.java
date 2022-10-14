package corejavavaltechday2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.jupiter.api.Test;

class ListTest {
	
	
	public void testStackAndQueue() {
		
		//Stack<String>  animals = new Stack<>();
		
		Queue<String>  animals = new LinkedList<>();
		
		/*animals.push("Dog");
		animals.push("Cat");
		animals.push("Cow");*/
		
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		
		assertEquals(3, animals.size());
		
		System.out.println();
		System.out.println();
		
		assertEquals(1, animals.size());
		
	}

	@Test
	public void test() {
		List<String> names = new ArrayList<>();
		
		names.add("Hello1");
		
		names.add("Hello2");
		
		names.add("Hello3");
		names.add(0,"Hello4");
		names.add("Hii");
		
		assertEquals(5, names.size());
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.println(string);
			
		}
		
	}

}
