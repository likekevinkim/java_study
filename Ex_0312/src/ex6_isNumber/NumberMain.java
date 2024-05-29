package ex6_isNumber;

import java.util.Scanner;

public class NumberMain {
	public static void main(String[] args) {

		NumberCheck ch = new NumberCheck();

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String nNum = sc.next();
		boolean b = ch.check(nNum);

		System.out.print(nNum + "은 숫자입니까? " + b);

	}// main
}
