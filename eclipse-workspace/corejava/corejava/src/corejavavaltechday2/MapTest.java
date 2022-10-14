package corejavavaltechday2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import corejava.point;

public class MapTest {

	@Test
	public void testHashMap() {
		
		Map<String,point>  points  = new HashMap<>();
		
		points.put("1,1", new point(1,1));
		points.put("1,1", new point(1,1));
		points.put("1,1", new point(2,2));
		points.put("1,1", new point(1,1));
		
		assertEquals(3,points.size());
		
		Set<String>  Keys  = points.keySet();
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			
			System.out.println("key"+key + "Value "+points.get(key));
			
		}
		
		
	}

}
