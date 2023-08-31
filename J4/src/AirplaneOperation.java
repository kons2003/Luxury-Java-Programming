
public class AirplaneOperation {
	public static void main(String[] args) {
		Airplane plane1 = new Airplane();
		Airplane plane2 = new Airplane("K300", "코리아나");
		Airplane plane3 = new Airplane("S200", "성공회에어", 500);
		
		plane1.setModel("A100");
		plane1.setCompany("아시아나");
		plane1.setNumber(300);
		
		plane1.showAirplane();
		System.out.println();
		
		
		plane2.setNumber(400);
		
		plane2.showAirplane();
		System.out.println();
		
		
		plane3.showAirplane();
	}
}
