package ex7_reader;

import java.io.File;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {

		// file.txt의 내용을 읽고 대소문자 갯수 출력

		File f = new File("C:/java_kms/file.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(f);
			int code = 0;
			int up = 0;
			int lo = 0;

			while ((code = fr.read()) != -1) {
				// if(Character.isUpperCase((char)code)) {
				if (code >= 'A' && code <= 'Z') {
					up++;
				}
				// if(Character.isLowerCase((char)code)) {
				if (code >= 'a' && code <= 'z') {
					lo++;
				}
			} // while
			System.out.println("대문자 갯수 : " + up);
			System.out.println("소문자 갯수 : " + lo);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main
}
