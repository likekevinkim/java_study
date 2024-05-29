package ex4_updown;

import java.util.Scanner;

public class UpDownMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AnswerCheck ans = new AnswerCheck();

		while (true) {
			// 입력받은 값을 AnswerCheck에게 전달하고
			// Up이나 Down이 아닌 정답일 경우
			// 해당 while문을 빠져 나가자
			System.out.print("맞춰보세요 : ");
			int answer = sc.nextInt();
			boolean b = ans.check(answer);

			if (b) { //b == true라는 의미 (boolean 값만 해당) !b -> b == false
				break;

			}

		} // while

	}// main
}
