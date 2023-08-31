import java.util.Scanner;

public class J1_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("상자 용량: ");
		int box = scanner.nextInt();
		System.out.print("사과 개수: ");
		int apple = scanner.nextInt();
		
		System.out.println("필요한 상자 개수: " + apple / box);
		System.out.println("남는 사과 개수: " + apple % box);
		
		scanner.close();
	}
}
