package Ex3_1;

public class ForSample {
	public static void main(String[] args) {
		int sum = 0;
		
		/*for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}	
		}
		*/
	/*	int i = 0;
		while (i <= 10) {
			sum += i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}	
			i++;
		}*/
		int i = 0;
		do {
			sum += i;
			System.out.print(i);
			if(i<=9)
				System.out.print("+");
			else {
				System.out.print("=");
				System.out.print(sum);
			}	
			i++;
		} while (i <= 10);
	}

}
