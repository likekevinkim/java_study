package ex3_input;

import java.io.IOException;

public class Ex1_Input {
	public static void main(String[] args) {

		// 참고
		// 스캐너 내부 구조 키보드 입력값
		byte[] console = new byte[100];
		try {
			System.out.print("값 : ");
			System.in.read(console);

			String str = new String(console);
			System.out.println(str.trim()); // System.in은 표준입력장치(키보드 등)에서 값을 받을때 쓰는 스트림
		} catch (IOException e) {

		}

	}// main
}
