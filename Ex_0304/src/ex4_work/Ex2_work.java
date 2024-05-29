package ex4_work;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//키보드에서 입력받은 두 수의 최대공약수를 구하시오
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("첫번째 정수를 입력하세요");
		int n1 = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int n2 = sc.nextInt();
		
		//↓ 반드시 n1 이 n2보다 작도록 스왑 SWAP
		if (n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for(int i = 2; i <= n1; i++) {
			
			if(n1 % i == 0 && n2 % i == 0) {
				System.out.println(i);
				break;
		
			}else {
				System.out.println("최대공약수가 없습니다.");
			
		}
			
			
		}//for
		
		System.out.println("======================");
		//teacher code
		int i1 = 0;
		
		for( i1 = n1; i1 >= 1; i1--) {
			
			if(n1 % i1 == 0 && n2 % i1 == 0) {
				break;
			}
		}//for
		
		if(i1 == 1) {
			System.out.println("최대공약수가 없습니다.");
		}else {
			System.out.println("최대공약수 : " + i1);
		}
		
		
		
		
	}//main
}
