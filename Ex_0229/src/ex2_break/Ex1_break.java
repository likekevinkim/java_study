package ex2_break;

public class Ex1_break {
	public static void main(String[] args) {

		// break : 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나가는 키워드

		for (int i = 1; i <= 2; i++) {

			for (int j = 1; j <= 10; j++) {

				if (j % 2 == 0) {
					break;
					//break 바로 아래쪽에는 어떠한 코드도 동작할 수 없다.
				}

				System.out.print(j + " ");

			} // inner

			System.out.println();
		} // outer

	}// main
}
