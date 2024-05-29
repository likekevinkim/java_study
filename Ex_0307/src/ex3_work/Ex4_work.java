package ex3_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {

		// 문장입력받고 : helloWorld
		// 홀수번째 글자만 추출

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String input = sc.next();

		for (int i = 0; i < input.length(); i += 2) {

			System.out.print(input.charAt(i));

		} // for

		System.out.println("----------------------");

		String res = "";
		for (int i = 0; i < input.length(); i++) {

			if (i % 2 == 0) {
				res += input.charAt(i);
			}

		}
		System.out.println(res);

	}// main
}
