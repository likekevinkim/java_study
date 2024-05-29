package ex7_reader;

import java.io.File;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		// byte기반의 스트림은 1바이트씩 처리하기 때문에 한글의 입출력이 불현하지만
		// char기반의 스트림은 최대 2바이트를 지원하기 때문에 한글로 구성된 파일을 입출려하는데 적합하다
		File f = new File("C:/java_kms/test.txt");
		FileReader fr = null;

		try {
			fr = new FileReader(f);
			int code = 0;

			while ((code = fr.read()) != -1) {
				System.out.print((char) code + " ");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
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
