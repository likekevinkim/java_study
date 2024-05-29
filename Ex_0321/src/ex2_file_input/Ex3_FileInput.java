package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		//Stream의 종류
		//...Stream : byte기반의 스트림 (1byte씩만 처리 가능)
		//...Reader, ...Writer : char기반의 스트림(최대 2byte씩 처리 가능)
		
		String path = "C:/java_kms/test.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];//(int)f.length -> 파일의 크기와 가장 가깝게 byte배열 사이즈 정하기

		FileInputStream fis = null;
		
		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				// fis가 읽어온 내용을 b_read에 담는다
				fis.read(b_read);

				// byte의 배열을 String 형식으로 변환
				String res = new String(b_read);

				System.out.println(res);

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
