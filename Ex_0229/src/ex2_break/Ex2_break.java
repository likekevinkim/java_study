package ex2_break;

public class Ex2_break {
	public static void main(String[] args) {

		for (int i = 1; i < 5; i--) {

			if (i < 0) {
				break;
			}

			System.out.println(i);

		} // for

		System.out.println("======================");

		// ↓break 예외적 경우. 반복문 안에서 switch문에서 break가 사용되면 switch문만을 탈출하는 용도로 사용
		for (int i = 0; i < 10; i++) {

			switch (i) {
			case 0:
				System.out.println("i am 0");
				break;
				
			case 1:
				System.out.println("i am 1");
				break;

			case 2:
				System.out.println("i am 2");
				break;

			}// switch

		} // for


	}// main
}
