package corejavavaltechday2;

public class outerclass {
	
	private int x;
	private Inner createInner() {
		// TODO Auto-generated method stub
		return null;
	}

	

	private class Inner{
		private void printX() {
			System.out.println("X = "+x);
		}
		
		private void increment() {
			
			x++;
		}
		}

	
	
	
	

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		outerclass  o = new outerclass(); 
		outerclass.Inner i = o.new Inner();
		outerclass.Inner i1 = o.createInner(); 
		i.printX();
		i.increment();
		i1.printX();
		outerclass.Inner i2 = new outerclass().createInner();
		i2.printX();
		

	}






	
}
