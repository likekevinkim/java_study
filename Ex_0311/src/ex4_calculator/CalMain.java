package ex4_calculator;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		//수 1 : 5
		//수 2: 10
		//연산자 : +
		//15
	
		//잘못된 연산자의 경우 -1 return
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int su1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int su2 = sc.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		String op = sc.next();
		
				
		Cal s1 = new Cal();
		int res = s1.getResult(su1, su2, op);
		
		
		System.out.printf("%d %s %d = %d", su1, op, su2, res);


	}//main
}
