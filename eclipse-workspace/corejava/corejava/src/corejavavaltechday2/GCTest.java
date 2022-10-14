package corejavavaltechday2;

class GCTest {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		long x = System.nanoTime();
		
		
		for (int i = 0; i < n; i++) {
			
			//
			
			String s = " "+i+" "+i;
			
			
		}
		
		long y = System.nanoTime();
		long time = (y-x)/100000000;
		
		System.out.println("Time Taken = "+time+"secs");
		
		
	}

}



