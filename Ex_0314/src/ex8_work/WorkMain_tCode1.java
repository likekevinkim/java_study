package ex8_work;

import java.util.Scanner;

public class WorkMain_tCode1 {
	public static void main(String[] args) {

		// aabbab 입력
		// a2b2a1b1 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.next();

		String result = ""; // 결과값을 저장할 변수
		int count = 1;

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result += input.charAt(i - 1);
				result += count;
				count = 1;
			}
		} // for

		// 마지막 문자 처리
		result += input.charAt(input.length() - 1);
		result += count;

		System.out.println("결과 : " + result);
	}

}
