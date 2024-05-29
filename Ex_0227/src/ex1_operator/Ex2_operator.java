package ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2; // < 작다 lt(little than), > 크다 gt(greater than)
		System.out.println("< 비교연산자 : " + res);
		
		res = n1 >= n2;
		System.out.println(">= 비교연산자 : " + res);
		
		res = n1 == n2;
		System.out.println("== 비교연산자 : " + res);
		
		res = n1 != n2;
		System.out.println("!= 비교연산자 : " + res);
		
		System.out.println("--------------------");

		//논리연산자
		//비교연산자를 통한 연산이 두 개 이상 필요할때 사용
		
		//&&(and) 연산자 : 앞쪽의 연산이 false라면 뒷쪽을 수행하지 않는다 (중요)
		//true && true -> true
		//true && false -> false
		//false && true -> false
		//false && false -> false

		int age = 22;
		int limit = 30;
		boolean result = limit - age <= 5 && (age += 1) <= 25; //&&전 연산이 false면 뒷 연산은 아예 안함
		System.out.println("age :" + age); //↑ &&전 연산이 false면 뒷 연산은 아예 안함 그래서 23이 아니고 22
		System.out.println("&& 논리연산자 : " + result);
		
		
		//|| (or) 연산자 : 앞쪽 연산이 true라면 뒷쪽을 수행하지 않는다(중요)
		//true || true -> true
		//true || false -> true
		//false || true -> true
		//false || false -> false
		int i1 = 10;
		int i2 = 20;
		result = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| 논리연산자 : " + result);
		
		//!(not) 연산 : boolean 타입의 연산자 연산 값에 ! 를 붙이면 true-false 값이 바뀜
		System.out.println(!result);//!은 일시적으로만 변경된 값을 제공
		System.out.println(result);//없으면 원래 값으로 회귀
		
		
		
	}//main
}



























