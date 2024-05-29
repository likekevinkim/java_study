package ex3_work;

public class Ex1_multiFor_gugudan {
	public static void main(String[] args) {

		// 2중 for 문을 사용하여 2~9단까지를 모두 출력
		// ----------------------------------
		// 2 X 1 = 2 3 X 1 = 3 ...... 9 X 1 = 9
		// .......................................
		// 2 X 9 = 18 3 X 9 = 27 ..... 9 X 9 = 81

		for (int i = 1; i <= 9; i++) {

			for (int j = 2; j <= 9; j++) {

				System.out.printf("%d X %d = %d\t", j, i, i * j);

			}

			System.out.println();
		}

	}// main
}
