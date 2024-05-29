package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class Ex4_baseball {
	public static void main(String[] args) {

//1~9사이의 중복되지 않는 난수 3개를 알아맞히는 숫자야구 게임 제작하기

		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {

			com1 = new Random().nextInt(9 - 1 + 1) + 1;
			com2 = new Random().nextInt(9 - 1 + 1) + 1;
			com3 = new Random().nextInt(9 - 1 + 1) + 1;
		} while (com1 == com2 || com2 == com3 || com3 == com1);

		// System.out.printf("%d, %d, %d\n", com1, com2, com3); // -> 컴퓨터가 생각한 수 (for
		// test)

		System.out.println("====맞춰봅시다====");

		Scanner sc = new Scanner(System.in);

		int S = 0;
		int B = 0;
		int count = 0;

		while (true) {

			System.out.println("1~9까지 숫자3개를 입력 : ");
			int user1 = sc.nextInt();
			int user2 = sc.nextInt();
			int user3 = sc.nextInt();

			count++;

			if (com1 == user1) {
				S++;
			}

			if (com2 == user2) {
				S++;
			}
			if (com3 == user3) {
				S++;
			}

			if (com1 == user2 || com1 == user3) {
				B++;
			}
			if (com2 == user3 || com2 == user1) {
				B++;
			}
			if (com3 == user1 || com3 == user2) {
				B++;
			}

			if (S == 3) {
				System.out.println("정답입니다.");
				System.out.println(count + "번만에 정답");
				break;
			} else {
				if (S == 0 && B == 0) {
					System.out.println("아웃. 하나도 맞는 수가 없네요");
				} else {
					System.out.printf("%d S, %d B\n", S, B);
				}

				S = 0;
				B = 0;

			}
		} // while

		// teacher code
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;

		int u1 = 0;
		int u2 = 0;
		int u3 = 0;

		do {

			c1 = new Random().nextInt(9) + 1;
			c2 = new Random().nextInt(9) + 1;
			c3 = new Random().nextInt(9) + 1;
			
		} while (c1 == c2 || c2 == c3 || c3 == c1);

		System.out.println("" + c1 + c2 + c3); // 컴퓨터 난수 확인

		while (true) {
			System.out.println("백 : ");
			u1 = sc.nextInt();

			System.out.println("십 : ");
			u2 = sc.nextInt();

			System.out.println("일 : ");
			u3 = sc.nextInt();

			int strike = 0;
			int ball = 0;

			// 경우의 수 판단
			if (c1 == u1) {
				strike++;
			} else if (c1 == u2 || c1 == u3) {
				ball++;
			}

			if (c2 == u2) {
				strike++;
			} else if (c2 == u3 || c2 == u1) {
				ball++;
			}

			if (c3 == u3) {
				strike++;
			} else if (c3 == u2 || c3 == u1) {
				ball++;
			}
			
			//정답 & 오답처리
			if (strike == 3) {
				System.out.println("정답-" + u1 + u2 + u3);
				break;
			}else {
				if(strike > 0 || ball > 0) {
					System.out.println(strike + "S," + ball + "B");
				}else {
					System.out.println("out!");
				}
			}
			System.out.println("--------------------------------");

		} // while

	}// main
}
