package ex2_muli_array_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//arr에 담긴 모든 값의 합과 평균을 출력
		//------------
		//총합 : 89
		//평균 : 6.4
		
		int[][] arr = { {4, 2, 6},
				     	{11, 15, 7, 1},
				     	{3, 17, 2, 5, 9},
				     	{3, 4} };
		
		int sum = 0;
		int arrNum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
			
				sum += arr[i][j];
				arrNum++;
		
			}//inner
		}//outer
		
		System.out.printf("총합은 : %d\n", sum);
		float avg = (float) sum / arrNum;
		System.out.printf("평균 : %.1f", avg);
		
	}//main
}
