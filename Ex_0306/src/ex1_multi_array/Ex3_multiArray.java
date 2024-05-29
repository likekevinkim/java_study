package ex1_multi_array;

public class Ex3_multiArray {
	public static void main(String[] args) {

		String[][] str = new String[2][];
		str[0] = new String[3];
		str[1] = new String[2];

		str[0][0] = "Java";
		str[0][1] = "Jsp";
		str[0][2] = "Script";

		str[1][0] = "jQuery";
		str[1][1] = "html";
		// str[1][2] = "A"; <--배열에 존재하진 않는 index는 접근 불가

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str[i].length; j++) {

				System.out.print(str[i][j] + "\t");
			}
			System.out.println();
		}

	}// main

}
