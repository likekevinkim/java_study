package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WorkThread extends Thread {

	private String[] str = { "apple", "grape", "orange", "pineapple" };
	private String answer;
	private boolean isCheck = true;
	private Scanner sc = new Scanner(System.in);
	private Random rnd = new Random();
	int num = 0;

	List<String> list = new ArrayList<String>();

	public void startGame() {
		System.out.println(list); // 첫번째 단어 출력 (출력에는 시간이 필요하니 start와 startGame사이에 쉴 간격 필요)

		while (isCheck) {
			System.out.print(">> ");
			answer = sc.next();

			for (int i = 0; i < list.size(); i++) {
				if (answer.equals(list.get(i))) {
					list.remove(i);
					System.out.println(list);
					break;
				}

			} // for
			if (list.size() == 0) {
				isCheck = false;
			} // if

		} // while
		System.out.println("클리어");
	}// startGame

	@Override
	public void run() {
		while (isCheck) {

			int num = rnd.nextInt(4);
			list.add(str[num]);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} // while
	}
}
