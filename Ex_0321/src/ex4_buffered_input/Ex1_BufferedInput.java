package ex4_buffered_input;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_BufferedInput {
	public static void main(String[] args) {

		// Buffered스트림을 통해 입출력의 효율성을 향상시킬 수 있다.
		// 파일을 읽거나 쓸때 버퍼링 작업을 수행하기 때문이다.
		// 버퍼링이란 : 입출력할 데이터를 버퍼라는 메모리 영역에 바이트 배열로 저장하여 한번에 사용하는 것

		File f = new File("C:/java_kms/test.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null; // buffer라는 이름이 들어있으면 시간적으로 이득을 보려고 하는 구조가 많다

		byte[] b_read = new byte[(int) f.length()];

		try {

			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis); // BufferedInputStream은 FileInputSteam에서 넘겨받아야함
			bis.read(b_read);

			String res = new String(b_read);
			System.out.println(res);

		} catch (Exception e) {

		} finally { // 스트림이 열려있을때 열린 역순으로 닫는 것이 좋다
			try {
				if (bis != null) {
					bis.close();
				}

				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
			}
		}

	}// main
}
