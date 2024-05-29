package ex8_work;

import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {

		// 키보드에서 입력받은 값이 '회문'인지 판단하시오
		// 회문 : 앞으로, 뒤로 읽어도 똑같은 문장

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");

		String in = sc.next();
		Palindrome input = new Palindrome();
		input.palindrome(in);

	}// main
}
