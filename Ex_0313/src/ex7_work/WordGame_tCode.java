package ex7_work;

import java.util.Scanner;

public class WordGame_tCode {
	public static void main(String[] args) {

		// PEALP
		// 정답? : ealpp
		// ealpp 오답
		// 정답? : apple
		// apple 정답!

		String[] strArr = { "HOPE", "VIEW", "APPLE", "BANANA" };
		Scanner sc = new Scanner(System.in);

		Scramble scramble = new Scramble(strArr);
		String answer = scramble.getAnswer();// 정답단어

		System.out.println("문제 : " + scramble.getScrambled());

		while (true) {

			System.out.println("정답은 뭘까? : ");
			String s = sc.next();

			if (s.equalsIgnoreCase(answer)) {
				System.out.println("정답!");
				break;
			} else {
				System.out.println("오답...");
			}
		} // while

	}
}
