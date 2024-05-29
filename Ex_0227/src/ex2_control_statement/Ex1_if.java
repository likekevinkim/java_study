package ex2_control_statement;

public class Ex1_if {
	public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		
		//1) 분기문 : if, switch 
		//2) 반복문 : for, while
		
		/*if문의 형태 : if( 조건식 ) { 
		 조건식이 참일 때 수행되는 영역;
		}*/
		
		int n = 51;
		//String - ""안에 여러 글자(문장, 문자열)를 입력할 수 있는 (자료)형
		String str = ""; //가방은 있으나 안에 내용이 없음
		//String str = null; 이런 형태는 담을 가방조차 없음
		
		if( n == 50 ) {
			str = "n은 50입니다";
		}
		
		if( n != 50 ) {
			str = "n은 50이 아닙니다";
		}
		
		System.out.println(str);
	
		
	}//main

}
