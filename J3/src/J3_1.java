
import java.util.InputMismatchException;
import java.util.Scanner;

public class J3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[][];
		int i, j, n = 0;
		
		System.out.print("행의 개수 입력: ");
		arr = new int[n = scanner.nextInt()][];
		
		for	(i = 0; i < arr.length; i++) {
			System.out.print(i +"번 행의 열의 개수 입력: ");
			arr[i] = new int[n = scanner.nextInt()];
		}
		System.out.println();
		
		for (i = 0; i < arr.length; i++) {
			for	(j = 0; j < arr[i].length; j++) {
				try {
						System.out.print("["+i+"]["+j+"] 입력: ");
						arr[i][j] = scanner.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					scanner.nextLine();
					j--;
					continue;
				}
			}
		}
		
		System.out.println();
		
		for	(i = 0; i < arr.length; i++) {
			for	(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		
		scanner.close();
	}
}
