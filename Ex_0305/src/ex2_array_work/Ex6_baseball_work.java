package ex2_array_work;

import java.util.Random;
import java.util.Scanner;

public class Ex6_baseball_work {
	public static void main(String[] args) {

		// 이전에 만들었던 숫자야구 코드를 배열을 이용하여 변경해보자

		Scanner sc = new Scanner(System.in);

		// 변수지정
		int[] com = new int[3];
		int[] user = new int[3];

		// 랜덤 변수가 겹치지 않게 작업
		do {

			com[0] = new Random().nextInt(9) + 1;
			com[1] = new Random().nextInt(9) + 1;
			com[2] = new Random().nextInt(9) + 1;

		} while (com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);

		// 변수 출력 (확인용이고 나중에 지우자)
		/*for (int c : com) {
			System.out.print(c + " ");
		}*/
		System.out.println();

		int counter = 0; // 횟수체크

		while (true) {
			counter++;

			// 유저 숫자 입력
			System.out.print("한자리 숫자를 세개를 겹치지 않게 입력하세요 : ");
			int userNum = sc.nextInt();

			// 유저 입력 숫자를 배열로 바꿔주기 (100의 자리, 10의 자리, 1의 자리)
			user[0] = userNum / 100;
			user[1] = userNum / 10 - (user[0] * 10);
			user[2] = userNum / 1 - (user[0] * 100) - (user[1] * 10);

			// 유저입력값이 제대로 출력되는지 보자 (나중에 지우자)
			/*
			 * for (int u : user) { System.out.printf("%d\n", u); }
			 */

			// 유저 숫자 중복시 재입력 알림
			if (user[0] == user[1] || user[1] == user[2] || user[2] == user[0]) {
				System.out.println("세 정수를 다르게 입력하세요.");
				continue;
			}

			// 스트라이크, 볼 초기화
			int strike = 0;
			int ball = 0;

			// 유저 숫자와 com 숫자 비교
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++)
					if (com[i] == user[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
			}

			// 판단
			if (strike == 3) {
				System.out.printf("%d 번만에 정답을 맞췃습니다.", counter, "정답-%d", userNum);
				break;

			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + "S," + ball + "B");
				} else {

					System.out.println("out!");
				}
			}
		} // while

	}// main
}
