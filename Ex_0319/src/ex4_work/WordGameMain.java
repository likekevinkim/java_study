package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {

		List<String> arr = new ArrayList<String>(); // WordGame에 arr에 추가된 값이 이곳 arr에도 반영

		WordGame wg = new WordGame(arr); // (1)

		wg.start();
		// Thread.sleep을 사용해도 되나 아래처럼 스레드에게 먼저 일할 시간을 부여해도 됨
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 게임 종료
			if (arr.size() == 0) {
				System.out.println("클리어");
				wg.setPlaying(false);
				break;
			}
			System.out.println(arr);
			System.out.print(">>");
			String in = sc.next();

			// 사용자가 입력한 단어와 일치하는 값을 arr에서 찾는다
			for (int i = 0; i < arr.size(); i++) {
				if (in.equals(arr.get(i))) {
					arr.remove(i);
					break;
				}
			} // for

		} // while

	}// main
}
