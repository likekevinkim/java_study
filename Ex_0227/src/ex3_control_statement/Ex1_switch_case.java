package ex3_control_statement;

public class Ex1_switch_case {
	public static void main(String[] args) {
	
		//switch-case문 : 비교값과 조건값을 통해 원하는 결과를 찾아내는 제어문
		
		//switch문에서 사용가능한 비교값의 타입
		//정수(byte, short, int)
		//문자(char), 문장/문자열(String)
		// 정수타입 중 *long은 안됨, 실수(float, double) 안됨 /boolean 안됨
		
		/*
		 switch( 비교값 ){
		 	case 조건값:
		 		비교값과 조건값이 일치하면 실행되는 영역
		 	break;
		 }
		 */
		
		int n = 2;
		//비교값과 조건값의 valueType은 반드시 일치해야 한다
		
		switch( n ) {//비교값 
		case 1 : //조건값
			System.out.println("1.게임시작");
			break;
			
		case 2 :
			System.out.println("2.게임소개");
			break;
			
		case 3 :
			System.out.println("3.게임종료");
			break;
		
			
		default : //예를 들어 1~3까지의 값을 입력하지 않고 실수로 다른 수를 입력할 경우가 있을 수 있기 때문에 하나의 가이드를 주는 디폴트값을 높은 확률로 switch문 마지막에 넣는다.
			//비교값과 조건값이 하나도 일치하지 않을 때
			System.out.println("1~3까지만 입력하세요");
			break;
		}//switch
		
	}//main

}


























