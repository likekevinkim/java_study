package ex6_runnable;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		} // for
	}

}
