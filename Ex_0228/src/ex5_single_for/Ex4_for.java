package ex5_single_for;

import java.util.Scanner;

public class Ex4_for {
	public static void main(String[] args) {
		
		//은행 이자가 하루에 1원씩 추가된다
		//원금(money)과 예치일수(day)를 키보드에서 입력받고
		//예치일수가 끝나면 나의 원금이 얼마가 되었는지를 출력
		// 5일후의 잔액은 1005원 입니다.
		
		System.out.println("원금을 쓰세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.println("예치일수를 쓰세요.");
		int day = sc.nextInt();
		
				
		for (int i = 0; i < day; i++) {
			money = money ++; //+1을 쓰는거보다 ++이 처리속도가 더 빠름
		}
		//System.out.println(money);
		System.out.printf("%d일 이후의 잔액은 %d입니다.", day, money);	
		
		
	}//main
}
