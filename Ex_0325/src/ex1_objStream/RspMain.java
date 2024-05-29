package ex1_objStream;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	public static void main(String[] args) {
		// id : aaa
		// 0승 0무 0패
		// 가위(s) | 바위(r) | 보(p)
		// 당신이 이겼습니다
		// 1승 0무 0패
		// 다시한판? y | n
		// 게임종료

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		RspInfo rinfo = new RspInfo();

		System.out.print("id : ");
		String id = sc.next();

		rinfo.setId(id);

		// 로드
		ScoreLoader sl = new ScoreLoader(rinfo);
		rinfo = sl.info;
		int win = 0;
		int draw = 0;
		int lose = 0;

		win = rinfo.getWin();
		draw = rinfo.getDraw();
		lose = rinfo.getLose();

		System.out.printf("%d승 %d무 %d패\n", rinfo.getWin(), rinfo.getDraw(), rinfo.getLose());

		while (true) {

			int random = rnd.nextInt(3);
			// 0:가위, 1:바위, 2:보
			System.out.println("가위(s) | 바위(r) | 보(p)");
			String user = sc.next();
			int usercnt = 0;

			if (user.equals("s")) {
				usercnt = 0;
			} else if (user.equals("r")) {
				usercnt = 1;
			} else if (user.equals("p")) {
				usercnt = 2;
			}

			// 경우의 수
			if (usercnt - random == -2 || usercnt - random == 1) {
				System.out.println("이겼습니다");
				rinfo.setWin(++win);
			} else if (usercnt - random == 0) {
				System.out.println("비겼습니다");
				rinfo.setDraw(++draw);
			} else {
				System.out.println("졌습니다");
				rinfo.setLose(++lose);
			}

			System.out.printf("%d승 %d무 %d패\n", rinfo.getWin(), rinfo.getDraw(), rinfo.getLose());

			System.out.println("한판 더 ? y | n : ");

			if (!sc.next().equals("y")) {
				break;
			}

		} // while

		// 게임이 정상적으로 끝나면 user별 기록을 저장
		new ScoreWriter(rinfo);

	}// main
}
