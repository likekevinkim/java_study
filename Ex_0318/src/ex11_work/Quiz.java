package ex11_work;

import java.util.Random;
import java.util.Scanner;

public class Quiz extends Thread {

	private int su1, su2;
	private int timer = 0;
	private int playCount = 0;
	private boolean isCheck = true; // 두개의 스레드를 한번에 멈추기 위해서 (하단 isCheck 쓴거 확인)
	private final int FINISH = 5; // 상수값 관리, 몇문제 맞출지, 맞췄는지 위에서 관리 가능
	private Random rnd = new Random(); // 랜던음 계속 활용하니 변수로 선언
	private Scanner sc = new Scanner(System.in); // 이것도

	public void startGame() {

		while (isCheck) { // isCheck == true / !isCheck == false

			su1 = rnd.nextInt(100) + 1;
			su2 = rnd.nextInt(100) + 1;
			System.out.printf("%d + %d = ", su1, su2);
			int result = sc.nextInt();

			if (result == su1 + su2) {
				System.out.println("정답");
				playCount++;
			} else {
				System.out.println("오답");
			}

			// 정답처리
			if (playCount == FINISH) {
				System.out.printf("결과 : %d초\n", timer);
				isCheck = false; // while문 종료 -> while문 나감
			}
		} // while

	}// startGame

	@Override
	public void run() {
		// 1초에 1씩 timer를 증가시키는 영역
		while (isCheck) {

			try {
				Thread.sleep(1000);
				timer++; // 1초 뒤에 타이머 카운터 하나 증가

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // while

	}

}
