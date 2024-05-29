package ex5_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2_FileOutput {
	public static void main(String[] args) {

		String path = "C:/java_kms/fileOutput예제.txt";

		File f = new File(path);

		FileOutputStream fos = null;

		if (!f.exists()) {
			try {
				// new FileOutputStream(File 클래스의 객체, 내용 이어 붙일지 여부);
				fos = new FileOutputStream(f, true);
				String msg = "file output stream의 예제입니다.";

				// msg.getBytes(); <- String을 byte[]로 변환
				fos.write(msg.getBytes());

			} catch (Exception e) {
			} finally {
				try {
					if (fos != null) {
						fos.close();
					}
				} catch (Exception e2) {

				}

			}
		}

	}// main
}
