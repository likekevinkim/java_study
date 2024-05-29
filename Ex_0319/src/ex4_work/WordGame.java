package ex4_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordGame extends Thread {

	private List<String> arr; // main (1)에서 부모 객체까지 다 받으므로 ArrayList가 아닌 List로 보내야함
	private String[] data = { "apple", "grape", "orange", "banana" };
	private boolean playing = true;
	private Random rnd;

	// playing의 값을 바꾸는 세터
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	// 생성자에서 data, Random 등을 쓰면 더 좋음
	public WordGame(List<String> arr) { // main (1)에서 부모 객체까지 다 받으므로 ArrayList가 아닌 List로 보내야함
		this.arr = arr;
		rnd = new Random();
	}

	@Override
	public void run() {
		while (playing) {

			try {
				int random = rnd.nextInt(data.length);
				arr.add(data[random]);

				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} // while

	}

}
