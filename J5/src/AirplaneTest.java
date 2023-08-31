
public class AirplaneTest {
	public static void main(String[] args) {
		Airliner liner = new Airliner("A100");
		Fighter fighter = new Fighter("F300", false);
		
		liner.setPassenger(0);
		liner.showInfo();
		System.out.println();
		
		liner.setID("A200");
		liner.setPassenger(500);
		liner.showInfo();
		System.out.println();
		
		fighter.showInfo();
		System.out.println();
		
		fighter.setID("F400");
		fighter.stealthOn();
		fighter.showInfo();
	}
}
