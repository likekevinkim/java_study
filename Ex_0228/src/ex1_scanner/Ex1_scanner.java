package ex1_scanner;

import java.util.Scanner;
//Ctrl + Shift + o : import 단축키

public class Ex1_scanner {
	public static void main(String[] args) {

		//키보드에서 직접 값을 입력받도록 하는 클래스, Java에만 있는 기능으로 실무에 잘 사용되지 않음
		Scanner sc = new Scanner(System.in);
		//Sc + Ctrl + space
		System.out.print("정수 : ");
		//System.out.println("정수 : "); //ln은 line의 약자로 값을 보여주고 한줄 밑으로 내림
		
		int num = sc.nextInt(); //<- 이 타입은 정수만 받을 수 있음, 정수말고 실수나 문자 입력시 오류
		System.out.println("입력받은 값 : " + num);
		
		System.out.println("문장 : ");
		String str = sc.next(); //모든 문자 입력. 숫자도 입력은 가능하나 실제 정수가 아니라 연산이 안됨. 띄어쓰기는 인식안되서 띄어쓴 앞까지 저장. nextLine으로 띄어쓰기도 인식 가능하나, 기존 값을 가져와서 Scanner를 새로 만들어야함.
		System.out.println("입력받은 값 : " + str);
		
		
	}// main
}



































