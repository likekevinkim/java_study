package ex1_multi_for;

public class Ex2_multiFor {
	public static void main(String[] args) {

		// 01 02 03 04
		// 05 06 07 08
		// 09 10 11 12

		int num = 0;
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {
				num++;
				System.out.printf("%02d ", num);
			}
			System.out.println();
		}

		System.out.println("==============================");

		int a = 0;
		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 4; j++) {
				System.out.printf("%02d ", ++a);
			}
			System.out.println();
		}

		System.out.println("==============================");

		// A B C D
		// E F G H
		// I J K L

		char ap = 'A';

		for (int i = 1; i <= 3; i++) {

			for (char j = 0; j <= 3; j++) {
				System.out.printf("%c ", ap++);
			}
			System.out.println();
		}

	}// main
}
