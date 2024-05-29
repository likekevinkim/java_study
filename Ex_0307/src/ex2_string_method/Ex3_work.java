package ex2_string_method;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 키보드를 통해 공백 없이 아무값이나 입력을 받는다
		// 입력받은 문자열에 소문자 a의 갯수를 출력

		Scanner sc = new Scanner(System.in);

		// 입력받기
		System.out.println("키보드를 이용하여 아무값이나 공백없이 입력하세요");
		String test = sc.next();

		int cnt = 0;
		for (int i = 0; i < test.length(); i++) {
			
			if(test.charAt(i) == 'a') {
				cnt++;
			}
			
		}
		System.out.println("a의 갯수는  " + cnt);

	}// main
}
