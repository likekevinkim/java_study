package ex8_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex2_BufferedWriter {
	public static void main(String[] args) {

		File f = new File("C:/java_kms/bufWriter.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);

			bw.write("bufWriter의 테스트 입니다.");
			bw.newLine(); // 엔터함수
			bw.write("\n출력테스트 중"); // 엔터함수 없이 다음줄로 작성

			bw.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}// main
}
