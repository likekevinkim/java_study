package ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		
		//증감연산자
		//1씩 증가시키거나, 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 구별할 줄 알아야 함
		int a = 10;
		System.out.println("a :" + ++a); //선행증가
		
		int b =10;
		System.out.println("b : " + b++); //후행증가
		System.out.println(b);
		
		b++;//11 (12)
		--b;//11 (11)
		--b;
		++b;
		b--;
		++b;
		b++;
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("---------------------");
		
		//삼항(조건)연산자
		//하나의 조건식을 주고, 그 결과가 참일때와 거짓일때에 따라 원하는 형태의 값을 언어내고자 할 때 사용하는 연산자
		
		a = 10;
		b = 15;
		int res = ++a >= b ? 10 : 50; // a < b ? c : d; a가 b보다 작을때(참) c값, 클때(거짓) d값 //자료형은 연산결과에 따라 지정
		System.out.println("res : " + res);
		
		int n1 = 10;
		int n2 = 20;
		char res2 = (n1 += n1) == n2 ? 'A' : 'B';
		System.out.println("res2 : " + res2);
		
	}//main
}


























