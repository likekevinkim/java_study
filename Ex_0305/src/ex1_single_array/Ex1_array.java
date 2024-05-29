package ex1_single_array;

public class Ex1_array {
	public static void main(String[] args) {
		
		//배열 : '같은 자료형끼리 모아둔 하나의 묶음'
		//효율적인 자료관리를 위해 반드시 필요!
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println("---------------------");
		
		//위의 코드를 배열을 이용하여 생성해보자
		//1) 배열 선언
		
		int[] su;
		
		//2) 배열 생성
		su = new int[5]; //배열 생성 후 프로그램 종료까지 인덱스 추가할 수 없음. 인덱스 번호올려 추가
		
		//3) 배열의 초기화
		su[0] = 100;
		su[1] = 200;
		su[2] = 300;
		su[3] = 400;
		//su[4] = 500; //배열 생성 후 프로그램 종료까지 인덱스 추가할 수 없어 오류 발생
		
		//배열의 존재하지 않는 인덱스로 접근하는 것은 JAVA에서는 불가능
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		
		System.out.println("--------------------");
		
		//n차원 배열의 모든 값을 보려면 n중 for문이 필요		
		for(int i = 0; i < su.length; i++) { //인덱스 번호 변화될때 자동변화하려면 i < su.length
			System.out.println(su[i]);
		}//for
		
		int [] num = new int[3];
		//num[0] ~ [2]에 10, 20, 30 같이 규칙성을 가지는 값 추가도 한번에 가능
				
		for(int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
			System.out.println(num[i]);
		}
		
	}//main
}
