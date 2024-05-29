package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_InputWork {
	public static void main(String[] args) {

		String path = "C:/java_kms/work.txt";
		File f = new File(path);
		FileInputStream fis = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				int code = 0;
				int sum = 0;

				while ((code = fis.read()) != -1) {
					// String s = "" + (char) code; 아래코드가 jvm입장에서 더 좋은
					String s = String.valueOf((char) code);
					try {
						sum += Integer.parseInt(s); // Integer.parseInt() -> 숫자형의 문자열을 받으면 Integer로 변환
					} catch (Exception e) {
					}

				} // while

				System.out.println("결과 : " + sum);

			} catch (Exception e) {
			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
				}
			}
		}

	}// main
}
