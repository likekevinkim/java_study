package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		//Casting 캐스팅 (형 변환)
		// 1. promotion casting 프로모션 캐스팅
		// -> 큰 자료형에 작은 자료형이 대입되는 것
		double d = 100.5;
		int n = 200;
		
		d = n;
		System.out.println("프로모션 캐스팅 출력 1 : " + d);
		
		
		char c = 'D'; //2byte
		int n1 = 100; //4byte
		
		n1 = c;
		System.out.println("프로모션 캐스팅 출력 2 : " + n1); //D의 아스키코드값 68이 프로모션 캐스팅되어 출력됨
		
		
	}//main

}
