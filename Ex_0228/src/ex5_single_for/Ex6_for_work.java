package ex5_single_for;

import java.util.Scanner;

public class Ex6_for_work {
	public static void main(String[] args) {
		
		//키보드에서 정수를 입력받는다
		//1부터 입력받은 정수까지의 합을 계산하여 출력
		//예를 들어 5를 입력 받았다면 1 ~ 5까지의 합인 15를 출력
		
		//정수 : 5
		//결과 : 15
		
		System.out.println("정수하나를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}//main
}
