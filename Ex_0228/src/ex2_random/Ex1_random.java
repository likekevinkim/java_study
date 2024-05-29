package ex2_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		// 난수발생 클래스 Random

		// new Random().nextInt(난수의 범위) + 시작수;
		// 난수의 범위 = 큰수-작은수+1
		// ex> 12389 ~ 57319 범위
		// new Random().nextInt(57319 - 12389 + 1) + 12389;

		// 5~9사이의 난수
		int num = new Random().nextInt(9 - 5 + 1) + 5;
		System.out.println("난수 : " + num);

		System.out.println("--------------------");
		
		
		//A-Z중 하나 랜덤표시
		int alphabet = new Random().nextInt('Z' - 'A' + 1) + 'A';
		System.out.println("알파벳 : " + (char)alphabet);

		
		System.out.println("======================================");
		
		
		//백준코드 문제 응용
		
		int A = new Random().nextInt(10 - 0 + 1) + 0;
		System.out.println(A);
		int B = new Random().nextInt(10 - 0 + 1) + 0;
		System.out.println(B);
		
		double de = (double)A/B;
		System.out.println(de);
		
		
		
		
	}// main
}

