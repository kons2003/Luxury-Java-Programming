package Ex3_6;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. exit을 입력하면 종료합니다.");
		while(true) {
			System.out.println(">> ");
			String text = scanner.nextLine();
			
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다...");
	}
}
