
import java.util.Scanner;

public class J2_1 {
	public static void main(String[] args) {
		int mulCnt = 0;
		int sum = 0;
		int mulSum = 0;
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("시작: ");
		int start = scanner.nextInt();
		System.out.print("종료: ");
		int finish = scanner.nextInt();
		System.out.print("배수: ");
		int mul = scanner.nextInt();
		
		for (int i = start; i <= finish; i++) {
			if (i % mul == 0) {
				mulCnt++;
				mulSum += i;
			} else
				sum += i;
		}
		
		System.out.println(start + "부터 " + finish + "까지 " + mul + "의 배수의 개수: " + mulCnt);
		System.out.println(start + "부터 " + finish + "까지 " + mul + "의 배수에 속하는 수들의 합: " + mulSum);
		System.out.println(start + "부터 " + finish + "까지 " + mul + "의 배수를 제외한 수들의 합: " + sum);
		
		scanner.close();
	}
}
