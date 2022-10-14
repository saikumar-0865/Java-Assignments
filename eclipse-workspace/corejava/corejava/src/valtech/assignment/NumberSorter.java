package valtech.assignment;

import java.util.Comparator;

public class NumberSorter implements Comparator<Integer>{
	
	
    public boolean isOdd(int a) {
		//return a % 2 == 1;
    	
    	return Math.abs(a) % 2 == 1;
	}
	

	@Override
	public int compare(Integer i1, Integer i2) {
		// check both the numbers odd
		// put in ascending order
		
		boolean b1 = isOdd(i1);
		boolean b2 = isOdd(i2);
		if(b1 && b2) {
			
			if(i1 < i2) return -1;
			if(i1 == i2) return 0;
			
			return +1;
			
			//return i1-i2;
		}
		
		
		// check both are even
		// put in descending order
	    if(!b1 && !b2) {
			
			return i2-i1;
		}
		
		
		// Otherwise one is odd and other is even 
		// if first value is odd and  
	    
	    if (b1) {
			return -1;
		}
	    
	    return +1;
		
		
		//return i1.compareTo(i2);
	}
	
	

}
