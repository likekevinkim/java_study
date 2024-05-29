package ex4_thread;

public class ThreadTest extends Thread {
//스레드는 독립적인 실행 단위
// 한번에 두가지 이상의 프로세스를 실행 가능하게 해 준다

//Thread를 사용하려면 Thread를 부모 클라스에서 상속받은 후 run 메소드를 반드시 오버라이딩해서 스레드 사용
//run 밖에서는 순차적으로 실행되고 독립적으로는 실행되지 않는다	

	@Override
	public void run() {
		// 프로세스의 독립적인 수행을 위한 영역

		for (int i = 0; i < 10; i++) {
			System.out.println("스레드 실행중");

			try {
				Thread.sleep(1000); // try-catch에 반드시 씌워야함
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		} // for

	}

}
