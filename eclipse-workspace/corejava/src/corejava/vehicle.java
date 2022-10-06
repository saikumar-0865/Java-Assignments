package corejava;

public abstract class vehicle {
	
	public void start() {
	
		System.out.println("start button pressed");
	}
	
	public  void stop() {
	System.out.println("stop button pressed");	
	}
	
	public abstract void acceleration();
	public abstract void applybrakes();
	
	public void drivesomeDistance() {
		
		start();
		acceleration();
		applybrakes();
		stop();
	}	
	public static void main(String[] args) {
		
		vehicle gs = new Electricscooter();
		gs.drivesomeDistance();
		
		
		
	}

}
