package ex5_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		//for문 : 특정 명령을 원하는만큼 반복적으로 처리할 대 사용
		/*
		 for ( 초기식; 조건식; 증감식 ){
		 조건이 참일때 실행되는 영역
		 }
		 */
		
		
		
		int a = 0; //main에서 만든 전역변수 a. 전역변수는 for문, switch문 여러 코드에 모두 사용 가능
		
		for( int i = 0; i < 3; i++) { //for문 안에서 만든 지역변수 i.
			
			System.out.println(i);
			
		}//for 1
		
		//증감식을 for 문 안으로 의도적으로 배치하는 경우도 있다
		for( int i = 0; i < 3; ) {
			
			i++;
			System.out.println(i);
			
		}//for

		for( int i = 0; i < 3; i++) {
			
			i = 10; //for 문 영역 밖의 값을 for문 안에 사용가능하다
			System.out.println(i);
			
			int k = 100; //지역변수 K는 현재 for문을 벗어나면 사용할 수 없다
			
		}//for
		
		//i = 10; //for문 안에서 만든 지역변수는 for문 밖에서 사용 불가
		
		for( a = 0; a < 3; a++) { //main에 선언한 변수(전역변수)는 for문에서 끌어와 사용 가능하다
			
			a = 10; //for 문 영역 밖의 값을 for문 안에 사용가능하다
			System.out.println(a);
						
		}
		
		
		for( ; a < 3; a++) { //전역변수를 가져와 사용할때, 초기식을 뺄수도 있다. 영원히 반복하는 것을 만들고 싶을때 조건식도 뺄 수 있는데(비추)
			
			a = 10; //for 문 영역 밖의 값을 for문 안에 사용가능하다
			System.out.println(a);
			
		}
		
		
		System.out.println("-----------------------------------------");
		
		//지역변수끼리는 변수명이 같아도 상관 없다
		for (int j = 0; j < 3; j++) {
			System.out.println(j);
		}

		for (int j = 0; j < 3; j++) {
			System.out.println(j);
		}

		System.out.println("-----------------------------------------");
	
		//10 ~ 1감소되는 값을 순차적으로 출력하시오
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		
		
		
	}//main
}





















