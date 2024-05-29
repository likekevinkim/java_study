package ex8_throws;

public class TMain {

	public static void main(String[] args) {

		T1 t1 = new T1();
		T2 t2 = new T2();

		// throws로 넘겨받은 오류에 대해서
		// 한번에 처리하기 위해 main 메서드가 try-catch구문을 생성
		try {
			t1.showNum1();
			t2.showNum2();
		} catch (Exception e) {

		}

	}// main

}
