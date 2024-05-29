package ex1_multi_for;

public class Ex1_multiFor {
	public static void main(String[] args) {

		// 다중for문 : for문안에 for문이 포함되어 있는 경우
		// 1 2 3
		// 1 2 3

		for (int i = 1; i <= 2; i++) { // outer, y(행)

			for (int j = 1; j <= 3; j++) { // inner, x(축)

				System.out.print(j + " ");

			} // inner

			System.out.println(); // 줄바꿈

		} // outer

		System.out.println("====================================");

		// 0 1 2 3 4
		// 0 1 2 3 4
		// 0 1 2 3 4
		// 0 1 2 3 4

		for (int i = 1; i <= 4; i++) {

			for (int j = 0; j <= 4; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("====================================");

		// 5 4 3
		// 5 4 3
		// 5 4 3

		for (int i = 1; i <= 3; i++) {

			for (int j = 5; j >= 3; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}// main
}