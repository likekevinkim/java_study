package ex3_exception;

import java.util.Scanner;

public class Ex2_exception {
	public static void main(String[] args) {

		// 정수 : 100
		// 결과 : 100

		// 정수 : abc
		// abc는 정수가 아님

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String number = sc.next();

		try {

			int n = Integer.parseInt(number);
			System.out.println("결과 : " + n);

		} catch (Exception e) {
			System.out.println(number + "는 정수가 아님");
		}

	}// main
}
