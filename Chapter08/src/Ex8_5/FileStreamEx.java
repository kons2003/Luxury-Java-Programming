package Ex8_5;

import java.io.*;

public class FileStreamEx {
	public static void main(String[] args) {
		byte a[] = {7, 51, 3, 4, -1, 24}; // -128~+127
		byte b[] = new byte [6];
		
		FileOutputStream fout = null;
		FileInputStream fin = null;
		
		try {
			fout = new FileOutputStream("C:\\Java1630\\test.out");
			
			for(int i = 0; i < a.length; i++) {
				fout.write(a[i]);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("저장 불가");
		}
		
		// test.out파일을 읽어서 b[] 배열에 저장한 후, print()로 콘솔로 출력
		try {
			fin = new FileInputStream("C:\\Java1630\\test.out");
		}catch(IOException e) {
			System.out.println("읽기 실패");
		}
	}
}
