package ex5_output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex3_BufferedOutputStream {
	public static void main(String[] args) {

		// BufferedOutputStream
		// 일반 OutputStrea을 보조하여 속도를 높여주는 스트림

		File f = new File("C:/java_kms/bufOut.txt");

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		if (!f.exists()) {
			try {
				fos = new FileOutputStream(f);
				bos = new BufferedOutputStream(bos);

				String msg = "버퍼 OutputSteam의 예제";
				bos.write(msg.getBytes());

				// flush : 쓰고자하는 내용을 기억하고 있다가 물리적으로 파일에 쓰는 메서드
				// 기록을 끝낸 상태에서 닫는 순서에 상관없이 기록함 -> 메모리차지, 속도저하의 문제 있으나 오류 막는 용도 
				bos.flush();

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if (bos != null) {
						bos.close();
					}
					if (fos != null) {
						fos.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}

	}// main
}
