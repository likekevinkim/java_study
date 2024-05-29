package ex2_muli_array_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//3의 배수만 출력
		
		int[][] array = { {1, 2, 3},
						  {4, 5, 6, 7, 8,},
						  {9, 10, 11, 12, 13} };
		
		for (int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 !=0) {
					
					System.out.print(array[i][j] + " ");
				}
			}
		}
		
		
	}//main
}
