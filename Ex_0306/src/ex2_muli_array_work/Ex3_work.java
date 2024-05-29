package ex2_muli_array_work;

public class Ex3_work {
	public static void main(String[] args) {
		
		//arr배열에서 5을 초과하는 첫번째 값을 찾아 출력
		
		
		int[][] arr = { {4, 2, 6},
						{11, 15, 7, 1},
						{3, 17, 2, 5, 9} };
		
		abc : for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr[i].length; j++) {
			
					if ( arr[i][j] > 5) {
					System.out.println(arr[i][j]);

					break abc;
				}
						
			}//inner
		}//outer
		
		
	}//main
}
