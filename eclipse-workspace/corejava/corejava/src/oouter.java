
public class oouter {
	
	public void developer() {
		
		System.out.println("Edward Snowden");
	}
	
	
	private static class Inner extends oouter{
		
		void greet() {
			System.out.println("hello world");
		}
	}

	
	
	public static void main(String[] args) {

		Inner i = new Inner();
		
		i.greet();
		
		
		i.developer();
		
		
	
	}
	

}
