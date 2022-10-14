package corejava;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;




class SerializableTest {

	@Test
	public void test() throws Exception{
		
		ObjectOutputStream oos = new ObjectOutputStream
				(new FileOutputStream(new File("objects.txt")));
		
		point p = new point(2,3);
		
		point p1 = new point3d(1,2,3);
		
		oos.writeObject(p);
		oos.writeObject(p1);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream(new File("objects.txt")));
		
		point r = (point)ois.readObject();
		point3d r1 = (point3d)ois.readObject();
		
		assertEquals(p, r);
		assertEquals(p1, r1);
		assertEquals(p.hashCode(), r.());
		
		
		
				
		
		
		
	}

}
