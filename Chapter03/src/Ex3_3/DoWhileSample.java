package Ex3_3;

public class DoWhileSample {
	public static void main(String[] args) {
		//char c = 'a';
		
		/*do {
			System.out.print(c);
			c = (char) (c + 1);
		} while (c <= 'z');*/
		
		/*while (c <= 'z') {
			System.out.print(c);
			c = (char) (c + 1);
		}*/
		
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
		}
	}

}
