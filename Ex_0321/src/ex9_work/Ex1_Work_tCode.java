package ex9_work;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Work_tCode {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		String[] words = { "apple", "dog", "banana" };
		int count = 0;

		String answer = words[rnd.nextInt(words.length)];

		// answer와 같은 길이의 문자 배열을 만들고 ☆로 채워줌
		char[] cWord = new char[answer.length()];
		for (int i = 0; i < cWord.length; i++) {
			cWord[i] = '☆';
		}

		// String cString = String.valueOf(cWord); 아래꺼 대체 가능
		String cString = "";
		for (char c : cWord) {
			cString += c;
		}

		while (!cString.equals(answer)) {
			count++;
			System.out.printf("word : %s >> ", cString);

			String temp = sc.next(); // 키보드값 받기

			char in = temp.charAt(0);

			if (in < 'a' || in > 'z' || temp.length() > 1) {
				System.out.println("한글자의 영소문자만 입력하세요.");
				continue;
			}

			if (cString.indexOf(in) != -1) {
				System.out.println(in + "은 이미 입력한 문자");
				continue;
			}

			boolean found = false;
			cString = "";

			for (int i = 0; i < answer.length(); i++) {
				if (answer.charAt(i) == in) {
					cWord[i] = in;
					found = true;
				}
				cString += cWord[i];
			} // for

			if (!found) {
				System.out.println(in + "은 포함되어 있지 않음");
			}

		} // while
		System.out.println(answer + "정답");
		System.out.println("정답횟수 : " + count);

	}// main
}
