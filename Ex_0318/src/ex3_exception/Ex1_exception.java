package ex3_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_exception {

	public static void main(String[] args) {
		
		//Scanner를 통해 키보드에서 정수를 입력받도록한다
		//정수를 받았을때는 그 값을 그대로 출력하되
		//정수가 아닐경우 '정수만 입력하세요'를 출력
		//-------------
		//정수 : 10
		//입력받은 수 :10 
		
		//정수 : a
		//정수만 입력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
	
		try { 
			int num = sc.nextInt();
			System.out.println("입력받은 수 : " + num);
			
		}catch (Exception e) {
			System.out.println("정수만 입력하세요");
			
		}
		
	}//main
}
