
import java.util.Scanner;

public class J1_2 {
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하시오: ");
		int month = scanner.nextInt();
		
		if (1<=month && month<=12) {
			switch (month) {
			case 1: System.out.println("1월의 일수는 31입니다."); break;
			case 2: System.out.println("2월의 일수는 28입니다."); break;
			case 3: System.out.println("3월의 일수는 31입니다."); break;
			case 4: System.out.println("4월의 일수는 30입니다."); break;
			case 5: System.out.println("5월의 일수는 31입니다."); break;
			case 6: System.out.println("6월의 일수는 30입니다."); break;
			case 7: System.out.println("7월의 일수는 31입니다."); break;
			case 8: System.out.println("8월의 일수는 31입니다."); break;
			case 9: System.out.println("9월의 일수는 30입니다."); break;
			case 10: System.out.println("10월의 일수는 31입니다."); break;
			case 11: System.out.println("11월의 일수는 30입니다."); break;
			case 12: System.out.println("12월의 일수는 31입니다."); break;
			}
		} else
			System.out.println("잘못된 입력입니다.");
		
		scanner.close();
	}
}
