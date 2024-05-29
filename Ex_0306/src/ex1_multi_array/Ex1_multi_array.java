package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {

		// 다차원 배열
		// 1차원 배열이 n개 모이면, n차원 배열

		// new int[1차원 배열의 수][각 1차원배열의 index의 수]
		// new int[큰방][작은방]

		int[][] test = new int[2][3];

		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;

		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;

		System.out.println(test[0][2]); // 300

		System.out.println("-----------------------");

		// test 배열이 가진 모든 값을 출력 해 보자.
		for (int i = 0; i < test.length; i++) {

			for (int j = 0; j < test[i].length; j++) {

				System.out.print(test[i][j] + " ");

			} // inner

			System.out.println();

		} // outer

	}// main

}
