package Ex3;

import java.util.Scanner;

public class GuguTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작단: ");
		int n1 = scanner.nextInt();
		System.out.print("종료단: ");
		int n2 = scanner.nextInt();
		System.out.println("------------");
		
		for	(int i = n1; i <= n2; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i +" x "+ j +" = "+ (i*j));
			System.out.println();
		}
		
		//scanner.close();
	}
}
