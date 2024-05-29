package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

		// IO(Input/Output)
		// IO는 입출력 스트림을 의미
		// 스트림이란 데이터를 입출력하기 위한 통로
		// jvm에서 console로 값을 내보내면 Output
		// console의 값을 jvm에서 읽어오면 Input

		String path = "C:/java_kms/test.txt";
		File f = new File(path);

		// 접근하는 마지막 단계가 파일인지 폴더인지 확인 가능
		if (f.isFile()) {
			System.out.println("파일 크기 : " + f.length() + "byte"); // f.length() -> 파일의 용량 가지고 올 수 있음
		}

	}// main
}
