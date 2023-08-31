package Ex3;

public class PrintStars {
	public static void main(String[] args) {
		
		/*for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= (6-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
