package ex9_daemon;

public class DaemonMain {

	public static void main(String[] args) throws InterruptedException {

		// 데몬스레드
		// 다른 스레드의 작업을 돕는 보조적인 역할을 수행
		// 데몬스레드를 호툴한 클래스가 종료되면 함께 종료된다

		Work dm = new Work();

		// Work 클래스를 데몬스레드로 지정. main에서 지정한 Daemon class에서 종료하면 다른 곳에서 while문으로 무한 반복하던
		// 영역도 종료
		dm.setDaemon(true);
		dm.start();

		for (int i = 1; i <= 15; i++) {
			Thread.sleep(1000);

			System.out.println(i);
		}

		System.out.println("게임종료");

	}// main
}
