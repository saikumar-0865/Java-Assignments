package core.java.valtech.day3;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.Test;

class Rot13WriterTest {

	@Test
	public void test() throws Exception {
		
		
		Writer strWriter = new Rot13Writer(new StringWriter());
		
		String msg = "Hello world";
		strWriter.write(msg);
		
		String res = strWriter.toString();
		
		
		System.out.println("After Rotation"+res);
		strWriter.close();
		
		Reader reader = new Rot13Reader(new StringReader(res));
		
		char [] buffer = new char [1024];
		int i = reader.read(buffer);
		assertEquals(msg, new String(buffer,0,i));
		
		reader.close();
		
	}

}
