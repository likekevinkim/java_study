package ex5_single_for;

import java.util.Scanner;

public class Ex7_for_work {
	public static void main(String[] args) {
		
		//키보드에서 정수 n1, n2를 입력받는다
		//n1부터 n2까지의 합을 계산하여 결과를 출력
		//예를 들어 2와 5를 입력받았다면 2~5사이의 숫자들의 합인 14가 출력
		//n1, n2 중 누가 큰지는 모른다
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int n1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int n2 = sc.nextInt();
		

		
		//swap : 변수 두개가 가진 값을 교환하는 방법
		//두 수중에 누가 큰지 모를때 아래 코드를 통해 n1이 n2보다 반드시 작아짐
		if ( n1 > n2 ) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		
		//아래처럼 for문을 두개 써도 괜찮지만 swap을 쓰는게 좋음
		//swap을 쓰면 for문을 하나만 사용해도 됨
		int sum = 0;
		
		if (n1 < n2) {
			for(int i = n1; i <= n2; i++) {
				sum += i;
			}
		} else {
			for(int i = n2; i <= n1; i++) {
				sum += i;
			}
		}

			
		System.out.println("입력한 두 정수 사이의 합 : " + sum);
		
		
		
		
		
	}//main
}
