package ex1_first;

public class Ex1_print {
	//-> ※주석 : 컴파일러는 인지하지 못하는 간단한 메모 등을 작성하기 위한 코드
	public static void main(String[] args) {
		//main method : 프로그램 실행시 가장 먼저 호출되는 영역

		//System.out.println(); → 괄호안의 문장, 숫자, 연산 등을 표시해주는 코드
		System.out.println("안녕하세요"); //문장은 " " 안에
		System.out.println(100); //숫자는 " " 없이
		System.out.println(100 + 10); // 사칙연산은 연산 값을 표시
		System.out.println(50 - 15);
		System.out.println("hi " + 10); //문자 + 숫자는 그대로 표시
		System.out.println("2 + 2 = " + 2 + 2); //" " 뒤 + 는 이어 붙이는 용도, 연산 용도가 아님 / "ABC " - 10 처럼 뒤 + 이외 다른 연산기호는 붙이면 오류
		System.out.println("2 + 2 = " + (2 + 2)); //소괄호로 묶으면 먼저 계산
		System.out.println(1 + 1 + " 1 " + 1 + 1);
		
		
		
	}
	
}
