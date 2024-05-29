package ex7_thread;

public class TCount extends Thread {

	private int num = 0;

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public void run() {

		for (int i = num; i >= 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
