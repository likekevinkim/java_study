package ex3_work;

import java.util.Scanner;

public class Ex4_singleFor_Fibonacci {
	public static void main(String[] args) {

		// 단일 for문과 swap을 이용하여 피보나치수열 출력하기

		// 키보드에서 정수값을 입력받고, 입력받은 횟수만큼의 결과를
		// 피보나치 수열로 출력

		// -----------------------------------------

		// 출력갯수 : 6
		// 1 1 2 3 5 8

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int num = sc.nextInt();
		int n1 = 1;
		int n2 = 1;
		int n3 = n1 + n2; 
		
		System.out.print(n1 + " " + n2);
		for (int i = 1; i <= num - 2; ++i ) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			}

		System.out.println();
		
		System.out.println("===================");
		// teacher code
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("출력갯수 : ");
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			// swap 코드 ↓
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.print(num3 + " ");
		}
		

	}// main
}
