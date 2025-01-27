package ex10_synchronized;

public class SyncEx implements Runnable {
//여러개 자원을 하나의 메소드에서 구현하려면 러너블이 구현되야함

	private int money = 10000;

	// 스레드 동기화
	// 특정 (여러개의) 스레드들이 하나의 자원을 공유하고 있을 때, 현재 자원을 사용중이지 않은 다른 스레드가
	// 작업을 멈추고 대기상태가 되도록 처리하는 것

	@Override
	public void run() {

		//synchronized 영역을 만들면 해당 영역에서 사용되는 코드를
		//먼저 접근한 스레드가 작업을 마무리 할때까지, 다른 스레드에서 접근할 수 없다.
		synchronized (SyncEx.class) {

			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);

					String tname = Thread.currentThread().getName();

					if (money > 0) {
						money -= 1000;
						System.out.println(tname + "- 잔액 : " + money);
					} else {
						System.out.println(tname + "- 잔액부족");
					}

				} catch (Exception e) {

				}
			} // for

		} // synchronized

	}

}
