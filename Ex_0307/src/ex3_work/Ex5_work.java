package ex3_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {

		// 키보드에서 값을 입력받고, 중복값을 제거한 결과를 출력하세요
		// -------------
		// 입력 : aabbcca
		// 출력 : abc

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");

		String input = sc.next();

		String res = "";

		// 현재 문자(ch)가 이전에 등장한 적이 없다면 (-1) result에 추가
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (res.indexOf(ch) == -1) {
				res += ch;
			}

		} // for
		System.out.println(res);
	}// main
}
