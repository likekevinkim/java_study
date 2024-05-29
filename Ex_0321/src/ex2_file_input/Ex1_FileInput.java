package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex1_FileInput {
	public static void main(String[] args) {

		String path = "C:/java_kms/test.txt";
		File f = new File(path);

		FileInputStream fis = null; //밖에 만드는 것이 좋음

		if (f.exists()) { // 파일이 없으면 오류가 나기때문에 확인용으로 exists 사용

			// 파일 클래스와 연결할 InputStream을 생성
			try {
				fis = new FileInputStream(f); // 파일이 없으면 안되니 try-catch로 묶음. 1byte단위로 가져오기때문에 한글은은 오류값 나옴

				int code = 0;

				// Stream은 더이상 읽을 것이 없다면 -1을 반환한다
				// fis.read()를 통해 1byte씩 데이터를 가져오다가
				// 문서의 끝 (EOF - end of file)인 -1을 마나면 종료한다
				while ((code = fis.read()) != -1) { // 파일에서 읽어 올 것이 없을때 -1을 가져옴
					System.out.print((char) code);
				}
				// 사용을 완료한 stream은 반드시 닫아 줘야함 (아래 확인)
				// fis.close();

			} catch (Exception e) { // Exception으로 오류를 통합하여 잡는게 편함
			} finally { // 정석으로 닫기
				try {
					if (fis != null) {

						fis.close();
					}
				} catch (Exception e) {
				}
			}
		}

	}// main

}
