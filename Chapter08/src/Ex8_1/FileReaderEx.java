package Ex8_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		FileReader fin = null;

		try {
			fin = new FileReader("C:\\Windows\\system.ini");

			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일 열기 오류");
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
