package Ex8_4;

import java.io.*;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("C:\\Java1630\\test.txt", true);
			
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line); //fout.write(line, 0, line.length());
				fout.write("\r\n"); //fout.write("\r\n", 0, 2);
			}
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
