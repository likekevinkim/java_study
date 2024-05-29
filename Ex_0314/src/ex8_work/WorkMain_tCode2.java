package ex8_work;

import java.util.Scanner;

public class WorkMain_tCode2 {
	public static void main(String[] args) {

		// aabbab 입력
		// a4b2 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String str = sc.next();
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (result.indexOf(str.charAt(i)) == -1) {
				result += str.charAt(i);
			}
		} // for

		for (int i = 0; i < result.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (result.charAt(i) == str.charAt(j)) {
					count++;
				}
			} // inner
			System.out.print("" + result.charAt(i) + count);
		} // outer

	}// main
}
