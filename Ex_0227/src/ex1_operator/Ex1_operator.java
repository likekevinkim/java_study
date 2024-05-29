package ex1_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
//Ctrl+/ 하면 여러줄 주석

//<연산자>
//	 1. 최고연산자 : . , ()
//	 2. 증감연산자 : ++, --
//	 3. 산술연산자 : +, -, *, /, %
//	 4. 시프트연산자 : >>, <<, >>>
//	 5. 비교연산자 : >, <, >=, <=, ==, !=
//	 6. 비트연산자 : &, |, ^, ~
//	 7. 논리연산자 : &&, ||, !
//	 8. 삼항(조건) 연산자 : ?, :
//	 9. 대입연산자 : =, *=, /=, %=, +=, -=
		
		//산술연산자
		//4칙연산과 나머지 연산자를 가지고 있다.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 + n2;
		System.out.println("+연산 : " + n3); //syso Ctrl+space > System.out.println(); 단축키
		
		n3 = n1 - n2;
		System.out.println("-연산 : " + n3);

		n3 = n1 * n2;
		System.out.println("*연산 : " + n3);
		
		n3 = n1 / n2; //정수끼리 나누기 연산자 사용시 몫만 가지고 옴
		System.out.println("/연산 : " + n3);
		
		n3 = n1 % n2; //정수끼리 나머지 연산자 사용시 두 수를 나눈 나머지만 가지고 옴
		System.out.println("%연산 : " + n3);
		
		float a1  = n1 / n2;
		System.out.println(a1);
		
		float a2  = (float)n1 / n2; //둘중 하나는 캐스팅을 해야 소숫점 아래자리까지 표기
		System.out.println(a2);
		
		System.out.println("--------------------");
		
		//대입연산자 : 특정값을 변수에 전달하여 기억시킬때 사용하는 연산자
		int i1 = 10;
		int i2 = 7;
		i1 += i2; //i1 = i1 + i2; 를 줄인것
		System.out.println("+=연산자 : " + i1);
		
		i1 -= 5;//i1 = i1 - 5;
		System.out.println("-=연산자 : " + i1);
		
		i1 %= i2;//i1 = i1 % i2;
		System.out.println("%=연산자 : " + i1);
		
		i2 /= 3;
		System.out.println("/=연산자 : " + i2);
		
		System.out.println("--------------------");
	
		
		
	}//main
}


























