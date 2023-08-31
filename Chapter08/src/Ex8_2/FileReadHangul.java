package Ex8_2;

import java.io.*;

public class FileReadHangul {
	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("C:\\Java1630\\hangul_utf8.txt");
			in = new InputStreamReader(fin, "UTF-8");
			
			System.out.println(in.getEncoding());
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}
}
