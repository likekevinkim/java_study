package ex3_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		// 값 : abc123
		// 결과 : `~!wer

		Scanner sc = new Scanner(System.in);

		System.out.println("값을 입력하세요");
		String input = sc.next();

		String a = "abcdefzhijklmnopqrstuvwxyz0123456789";
		String b = "`~!@#$%^&*()-_+=|[]{};:,./qwertyuiop";

		char[] aArr = a.toCharArray(); //Sting type to char를 배열에 입력, 공백도 인식하니 주의
		char[] bArr = b.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < bArr.length; j++) {
				char c = input.charAt(i);
				if (c == aArr[j]) {
					System.out.print(bArr[j]);
					break;
				}
			}

		}
		System.out.println();

		}// main
}
