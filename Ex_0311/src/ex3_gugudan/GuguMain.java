package ex3_gugudan;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		//키보드에서 정수값 하나를 받아서
		//getResult()를 호툴했을 때, 구구단을 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		int num = sc.nextInt();
		
		Gugu g = new Gugu();
		g.getResult(num); //입력값을 getResult에 전달
			
	}
	
}
