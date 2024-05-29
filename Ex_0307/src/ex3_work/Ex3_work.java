package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 키보드에서 값을 입력받고, 숫자로만 이루어진 값이라면 true,
		// 그렇지 않으면 false를 출력

		// 값 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.next();

		// 문자 있는지 확인
		boolean check = true;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= '0' && ch <= '9') {
				check = true;
			} else {
				check = false;
				break;
			}

		} // for
		System.out.println(check);

		// tCode
		int cnt = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= '0' && ch <= '9') {
				cnt++;
			}
		} // for
		if (input.length() == cnt) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}// main
}
