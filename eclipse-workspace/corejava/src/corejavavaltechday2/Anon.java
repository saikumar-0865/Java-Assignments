package corejavavaltechday2;
import corejava.Animal;

public class Anon {

	public static void main(String[] args) {
		
		Animal a = new Animal() {
			int counter= 0;
			
			

			@Override
			public void makeSound() {
				// TODO Auto-generated method stub
				
				counter++;
				System.out.println("anon...+counter");
				
			}
		
		
		// TODO Auto-generated method stub

		};
		a.makeSound();
		a.makeSound();

}
}
