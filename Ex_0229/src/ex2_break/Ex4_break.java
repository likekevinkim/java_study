package ex2_break;

import java.util.Scanner;

public class Ex4_break {
	public static void main(String[] args) {
		
		//변수 n을 정수를 입력받아
		//1부터 n까지의 합을 구하되, 합이 20을 넘어가면 반복을 종료
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int n = scn.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
			if ( sum > 20 ) {
				System.out.println("합이 20을 넘어 종료합니다.");
				break;
			}//if
			
		}//for
		System.out.println(sum);
					
		
	}//main
}
