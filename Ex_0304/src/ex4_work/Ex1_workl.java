package ex4_work;

import java.util.Scanner;

public class Ex1_workl {
	public static void main(String[] args) {
		
		//키보드에서 정수 두개를 입력받아
		//입력 받은 두 수의 최소 공배수를 출력
		//예를 들어 2,5를 입력받았다면 10을 출력
		// 3,3을 받았다면 3을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 1개를 입력하세요.\n");
		int num1 = sc.nextInt();
		
		System.out.println("정수를 추가로 1개 더 입력하세요.\n");
		int num2 = sc.nextInt();				
		
		
		for (int i = 1; i <= num1 * num2; i++) {
				
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.printf("최소공배수 : %d", i);
				break;
			}

							
			
		}//for
		
		
	}//main
}
