package ex3_label;

import java.util.Random;

public class Ex3_label_work {
	public static void main(String[] args) {
		
		//주사위 두개를 던졌을 때, 합이 7이되는 첫번째 경우의 수를 출력하시오.
		//-------------
		//for, label, break 사용
		//결과 : 1, 6
				
		sum: for(int i = 1; i <= 6; i++) { 
				for(int j = 1; j <= 6; j++) {
				
					if (i + j == 7) {
						System.out.printf("결과 : %d, %d", i, j);
					break sum;
				}//if
												
			}//inner
		}//outer
		System.out.println();
		
		System.out.println("-------------------------------");
		//random 사용		
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			num1 = new Random().nextInt(7 - 0 + 1) + 1;
			num2 = new Random().nextInt(7 - 0 + 1) + 1;
		} while(num1 + num2 != 7);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}//main
}
