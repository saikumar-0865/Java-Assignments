package core.java.valtech.day3;

import java.io.IOException;
import java.io.Reader;

public class Rot13Reader extends Reader{
	
	
	private Reader source;
	
	
	
	
	public Rot13Reader() {
		this.source = source;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		
		char [] buffer = new char[cbuf.length];
		
		
		int i = source.read(buffer);
		
		if( i == -1) return -1;
		
		for (int j = 0; j < i; j++) {
			
			cbuf[i]  = Rot13utility.rotate(buffer[i] );
			
		}
		
		return i;
	}

	@Override
	public void close() throws IOException {
		source.close();
		
	}
	
	
	

}
