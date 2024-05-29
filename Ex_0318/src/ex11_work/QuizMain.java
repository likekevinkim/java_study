package ex11_work;

public class QuizMain {

	public static void main(String[] args) {

		Quiz q = new Quiz();
		q.start(); // 게임보다 시간 스타트를 먼저하는 것이 좋음
		q.startGame();

	}// main
}
