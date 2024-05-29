package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {

		// int[] arr = {10, 20, 30};
		char[][] cArr = { { 'A' }, { 'B', 'C', 'D' }, { 'E', 'F' } };

		for (int i = 0; i < cArr.length; i++) {
			for (int j = 0; j < cArr[i].length; j++) {
				System.out.print(cArr[i][j] + " ");

			} // inner
			System.out.println();
		} // outer

	}// main
}
