package ex8_writer;

import java.io.File;
import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {

		File f = new File("C:/java_kms/fileWriter예제.txt");
		FileWriter fw = null;

		try {
			fw = new FileWriter(f);
			String str = "나는 fileWriter의 예제입니다.\n두 줄도 잘됨";
			// char기반의 스트림은 문자열을 byte[]로 쪼개지 않아도 파일에 쓸 수 있다.
			fw.write(str);

			// fw.flush(); 닫기 잘해서 필요없도록 하자

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main

}
