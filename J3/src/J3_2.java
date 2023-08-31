
import java.util.InputMismatchException;
import java.util.Scanner;

public class J3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[3];
		
		for	(int i = 0; i < score.length; i++) {
			try {
				System.out.print("점수 입력: ");
				score[i] = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine();
				i--;
				continue;
			}
		}
		
		for	(int i = 0; i < score.length; i++)
			System.out.println((i+1) +"등: "+ score[i] +"점");
		
		scanner.close();
	}
}
