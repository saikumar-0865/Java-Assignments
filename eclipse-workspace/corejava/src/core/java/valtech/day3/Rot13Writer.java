package core.java.valtech.day3;

import java.io.IOException;
import java.io.Writer;

public class Rot13Writer extends Writer {
	
	
	
	private Writer sink;
	
	 public Rot13Writer(Writer sink) {
		this.sink = sink;
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		 
		
		char[] buffer = new char[cbuf.length];
		
		
		for (int i = 0; i < len; i++) {
			
			buffer[i]  = Rot13utility.rotate(cbuf[i]);
			
		}
		
		sink.write(buffer,off,len);;
		
	}
	
/*public int read(char[] cbuf, int off, int len) throws IOException {
		 
		
		char[] buffer = new char[cbuf.length];
		
		int i = source.readbuffer;
		
		
		for (int i = 0; i < len; i++) {
			
			buffer[i]  = Rot13utility.rotate(cbuf);
			
		}
		
	}*/

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub
		
		
		sink.close();
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		sink.flush();
	}

}
