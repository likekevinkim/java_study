package ex2_value_type;

public class Ex1_valueType {
	//main Ctrl+space 하면 ↓
	public static void main(String[] args) {
		
		
		 /* -> ※다중주석 : 별 두개 사이 영역 내부는 모두 주석처리된 내용*/
		 /* 
		 ------------------
		 
		 ※기본자료형 (valueType)
		 논리형 : boolean ........ 1bit
		 문자형 : char  .......... 2byte
		 정수형 : byte  .......... 1byte (-128 ~ 127)
		 		short .......... 2byte (-32768 ~ 32767)
		 		int   .......... 4byte (-21억 ~ 21억)
		 		long  .......... 8byte (-900경 ~ 900경)
		 실수형 : float .......... 4.X byte
		 		double.......... 8.X byte
		 */
		
		//※변수 : 특정 값을 저장하여 기억할 때 사용하는 식별자
		//변수 선언 규칙 
		//자료형 변수명; (선언)
		//변수명 = 값; (대입)
		//자료형 변수명 = 값(초기화)
		//ex> int a = 50;
		
		//변수 선언의 규칙
		//1) 숫자로 시작할 수 없다
		//2) _를 제외하고 특수문자를 쓸 수 없다
		//3) 한글로 이름을 짓지 않는다
		//4) 의미있는 이름으로 짓자
		//5) 자료형의 타입이 달라도 main영역 안에서 모두 다르게 지어져야 한다
		
		//논리형(boolean) : 참(true)과 거짓(false)만을 저장하는 자료형
		boolean b;
		b = true;
		b = false;
		System.out.println("논리 자료형 boolean 출력 b : " + b);
		
		System.out.println("------------------------");
		
		//문자형 : 홑따옴표'' 안에 딱 한글자만 저장 가능한 자료형
		char c = 'A';
		System.out.println("문자 자료형 char 출력 c : " + c);
		
		c = 100 + 1; //이런형태가 오류 나지 않는 이유는 ASCII CODE, 유니코드에 대입해서 나오기 때문
		System.out.println("아스키코드로 변경된 거 출력 : " + c);
		
		c = '\u0041'; //유니코드값을 입력해도 됨
		System.out.println("유니코드로 변경된 거 출력 : " + c);
		
		System.out.println("------------------------");
		
		//정수형 : 소수점을 가지고 있지 않은 자연수를 저장하는 그릇
		//byte b1 = 128; <-- byte 자료형의 표현범위를 벗어나므로 오류
		byte b1 = 127;
		int i1 = 2100000000;
		long i2 = 2200000000L; //long 타입 사용시 int 타입과 다르게 L을 맨뒤에 붙임. 왜? int가 default기 때문에
		
		System.out.println("byte형 출력 : " + b1);
		System.out.println("int형 출력 : " + i1);
		System.out.println("long형 출력 : " + i2);
		
		System.out.println("------------------------");
		
		//실수형 : 소수점을 가진 값을 저장하고자 할 때 사용
		float f1 = 3.14F; //JAVA에서 default가 double이라 F를 맨뒤에 붙임. 실무에서는 float를 더 많이 사용
		double d1 = 3.14;
		
		System.out.println("float형 출력 : " + f1);
		System.out.println("double형 출력 : " + d1);
		
		//정수 넣으면 x.0 소수점 표시
		f1 = 10;
		d1 = 100;
		
		System.out.println("float형 변경 출력 : " + f1);
		System.out.println("double형 변경 출력 : " + d1);
		
		
	}//main
	
}
