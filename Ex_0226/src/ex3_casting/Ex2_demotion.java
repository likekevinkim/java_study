package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		//2. demotion casting 디모션 캐스팅
		//-> 작은 자료형에 큰 자료형이 대입 되는 것
		char c = 'C'; //C의 아스키코드 값 67
		int n = c + 1; //67 + 1 = 68
		System.out.println(n);
		System.out.println("--------------------");
		
		c = (char)n; //디모션 캐스팅 할때는 형을 먼저 선언해주어야 함
		System.out.println(c);//68의 아스키코드 대입값 D 출력
		System.out.println("--------------------");
		
		float f = 5.5F;
		int n2 = 0;
		n2 = (int)f; 
		System.out.println(n2); //소수점 저장이 안되서 소수점 이하는 버림
		System.out.println("--------------------");
		
		//ex) 예외적인 캐스팅의 예
		int i1 = 10;
		
		//사이즈가 더 작은 int타입도 float형태로 디모션 캐스팅이 가능
		float a1 = (float)i1; //정수의 나누기 값을 소수점 아래값 등을 가져 와야할때
		
	}//main

}
