package ex2_muli_array_work;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {
		
		//찾을 값 입력
		//입력값을 초과하는 첫번째 값을 찾고
		//해당행의 모든 행의 값을 출력
		
		
		int[][] arr = { {3, 4, 6, 9},
						{5, 21, 11, 15, 13},
						{8, 1, 20, 14},
						{4, 10, 15, 16} };
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾고싶은 값 입력 : ");
		int a = sc.nextInt();
				
		abc: for(int i = 0; i < arr.length; i++) {
			
				for(int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] > a) {
						
						System.out.println(a + "보다 큰 첫번째 수 : " + arr[i][j]);
						
						for(int k = 0; k < arr[i].length; k++) {
						
							System.out.print(arr[i][k] + " ");
						}
						break abc;
					
					}
				
				}//inner
			
			}//outer
	
	}//main
}
