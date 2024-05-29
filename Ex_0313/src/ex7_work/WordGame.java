package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class WordGame {
	public static void main(String[] args) {

		// PEALP
		// 정답? : ealpp
		// ealpp 오답
		// 정답? : apple
		// apple 정답!

		String[] strArr = { "HOPE", "VIEW", "APPLE", "BANANA" };
		Scanner sc = new Scanner(System.in);

		int randomArr = new Random().nextInt(strArr.length); //배열을 배열 번호로 랜덤으로 배치
		String realWord = strArr[randomArr]; //랜덤으로 나온 문자열을 String으로 표현
		char[] shuffle = strArr[randomArr].toCharArray(); // 랜덤으로 나온 문자열의 글자를 배열로 나누기
		int rNum = new Random().nextInt(shuffle.length); //배열로 나뉜 글자를 배열 번호를 통해 랜덤 배치
		int[] arr = new int[shuffle.length];

		for (int i = 0; i < shuffle.length; i++) {
			arr[i] = new Random().nextInt(shuffle.length);

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				} // if
			} // inner
				// System.out.println(shuffleWord); // 랜덤 확인용
		} // outer
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
		}

		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str += shuffle[arr[i]];
		}
		System.out.println(str);

		// 정답맞추기
		while (true) {
			System.out.print("정답은? : ");
			String answer = sc.next();

			if (answer.equalsIgnoreCase(realWord)) {
				System.out.println("정답");
				break;
			}
			System.out.println("오답");
		}
	}
}
