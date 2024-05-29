package ex2_array_work;

import java.util.Random;
import java.util.Scanner;

public class Ex6_baseball_work_tCode {
	public static void main(String[] args) {

		// 이전에 만들었던 숫자야구 코드를 배열을 이용하여 변경해보자

		Scanner sc = new Scanner(System.in);

		// 컴퓨터 지정 난수의 변수지정
		int[] com = new int[3];

		// 랜덤 변수가 겹치지 않게 작업
		do {

			com[0] = new Random().nextInt(9) + 1;
			com[1] = new Random().nextInt(9) + 1;
			com[2] = new Random().nextInt(9) + 1;

		} while (com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);

		int cnt = 0; // 횟수체크

		while (true) {
			cnt++;

			System.out.print("예측값 세자리를 입력 - ");
			int number = sc.nextInt();
			// 입력된 세자리를 배열에 넣기
			int[] user = { number / 100, // user[0]
					number % 100 / 10, // user[1]
					number % 100 % 10 };// user[2]

			// 스트라이크, 볼 카운터 초기화
			int strike = 0;
			int ball = 0;

			// 경우의 수
			for (int i = 0; i < com.length; i++) {

				for (int j = 0; j < com.length; j++) {

					if (i == j) {
						if (com[i] == user[i]) {
							strike++;
						}
					} else {
						if (com[i] == user[i]) {
							ball++;
						}
					}
				}//inner
				
			}//outer

			//정답처리
			if ( strike == 3) {
				System.out.println(cnt + "회 만에 정답을 맞췄습니다.");
				break;
				
			} else {
				
				if( strike > 0 || ball > 0) {
					System.out.printf("%d S, %d B", strike, ball);					
				}else {
					System.out.println("아웃입니다.");
					
				}
			}
		} // while

	}// main
}
