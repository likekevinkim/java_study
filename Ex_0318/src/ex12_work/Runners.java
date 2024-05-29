package ex12_work;

import java.util.Random;

public class Runners {

	public static void main(String[] args) throws InterruptedException {

		int[] playerRandom = new int[2]; // 달리기 인원
		String[] playerJump = new String[playerRandom.length]; // 달리는 사람 공간 배열
		for (int i = 0; i < playerJump.length; i++) {
			playerJump[i] = "";

		}

		boolean finish = false;
		int winnerPlayer = 0;

		Random rnd = new Random();

		while (true) {

			for (int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = rnd.nextInt(2);
			}
			// 0.1초 간격으로 휴식
			Thread.sleep(100);

			// 각 선수에게 달릴 거리를 적용
			for (int i = 0; i < playerJump.length; i++) {
				switch (playerRandom[i]) {
				case 0:
					playerJump[i] += "";
					break;

				case 1:
					playerJump[i] += " ";
					break;
				}// switch

			} // for

			// 달리기
			System.out.println("============================================================");
			for (int i = 0; i < playerJump.length; i++) {
				System.out.print(playerJump[i]);
				System.out.println(i + 1 + "옷");

				if (playerJump[i].length() >= 50) { // 결승점(50)까지 먼저 도달한 선수
					winnerPlayer = i + 1;
					finish = true;
				}
			} // for
			System.out.println("============================================================");

			if (finish) { // finish == true
				System.out.println("win - " + winnerPlayer);
				break;
			}
		} // while

	}// main

}
