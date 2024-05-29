package ex4_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 키보드에서 정수를 입력받고 그 숫자가 소수인지를 판단하시오

		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();

		int i = 0;
		for (i = num; i <= num; i--) {

			if (num % i == 0 && num != i) {
				break;
			} // if
		} // for
		if (i == 1) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}

		// teacher code
		System.out.println("입력 : ");

		int n = sc.nextInt();

		int i1 = 0;
		for (i1 = 2; i1 <= n; i1++) {
			if (n % i1 == 0) {
				break;
			} // if
		} // for
		if (i1 == n) {
			System.out.println(n + "는 소수입니다.");
		} else {
			System.out.println(n + "는 소수가 아닙니다.");
		}

	}// main
}
