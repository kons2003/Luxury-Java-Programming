
import java.io.*;
import java.util.*;

public class AirplaneFinder {
	HashMap<String, Airplane> h = new HashMap<String, Airplane>();

	// airplane.txt 파일로부터 비행기 정보 읽기 기능
	void readAirplaneFile() {
		FileReader fin = null;
		String line = "";
		int c;
		try {
			fin = new FileReader("C:\\Java\\airplane.txt");
			BufferedReader buf = new BufferedReader(fin);
			while ((line = buf.readLine()) != null) {
				String[] s = line.split(" ");

				String id = s[0];
				String company = s[1];
				int passenger = Integer.parseInt(s[2]);

				Airplane plane = new Airplane(id, company, passenger);
				h.put(id, plane);
			}
			fin.close();
			buf.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

	// 식별정보, 제조회사, 탑승인원을 입력받아 airplane.txt 파일에 추가 기능
	void writeAirplaneFile() {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		char select;
		try {
			fout = new FileWriter("C:\\Java\\airplane.txt", true);
			
			do {
				System.out.print("새로운 비행기 정보를 입력하시겠습니까? (Y/N): ");
				select = scanner.nextLine().charAt(0);

				if (select == 'Y') {
					System.out.print("비행기 식별번호: ");
					String id = scanner.nextLine();
					System.out.print("비행기 제조회사: ");
					String company = scanner.nextLine();
					System.out.print("비행기 탑승인원: ");
					int passenger = scanner.nextInt();
					scanner.nextLine();
					System.out.println();

					Airplane plane = new Airplane(id, company, passenger);
					h.put(id, plane);
					fout.write("\r\n");
					fout.write(id+' '+company+' '+passenger);
				}
			} while (select == 'Y');
			fout.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}

	// 식별번호를 이용해 비행기 정보 검색 기능
	void findAirplane() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("검색할 비행기 식별번호를 입력하세요: ");
		String id = scanner.nextLine();
		
	    Airplane plane = h.get(id);
		
		if(plane != null) {
			System.out.println(plane.toString());
			System.out.println();
		} else {
			System.out.println("존재하지 않는 비행기 식별번호입니다.");
		}
	}

	public static void main(String[] args) {
		AirplaneFinder finder = new AirplaneFinder();
		
		finder.readAirplaneFile();
		finder.findAirplane();
		finder.writeAirplaneFile();
	}
}
