package Ex3;

public class ForIfExample {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println("-----------");
		System.out.println(sum);
	}

}
