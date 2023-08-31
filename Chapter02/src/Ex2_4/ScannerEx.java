package Ex2_4;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.print("이름, 도시, 나이를 빈칸으로 분리하여 입력");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		System.out.println("이름은 "+ name +"입니다.");
		
		String city = scanner.next();
		System.out.println("도시는 "+ city +"입니다.");
		
		int age = scanner.nextInt();
		System.out.println("나이는 "+ age +"입니다.");
	}

}
