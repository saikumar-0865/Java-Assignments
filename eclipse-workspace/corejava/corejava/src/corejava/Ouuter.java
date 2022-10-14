package corejava;

public class Ouuter {
	
	
	
	
	private int x = 5;
	private int y = 5;
	private void printX(Ouuter o) {
		System.out.println("x = "+o.x);
	}
	private void printY(Ouuter o) {
		System.out.println("x = "+o.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ouuter o = new  Ouuter();
		Inner i = new  Inner();
		o.printY(i);
		i.pruintX(o);
		i.increment(o);
		new Inner().increment(o);
		i.printX(o);
		i.print(new Ouuter());
		

	}

}
