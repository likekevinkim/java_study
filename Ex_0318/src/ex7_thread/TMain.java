package ex7_thread;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {

		// 스캐너를 통해 키보드에서 정수를 입력받는다
		// 입력받은 숫자가 1초에 1씩 감소되면서 출력되다가 0이 되었을때
		// 프로그램(스레드)을 종료하시오
		// ---------

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int n = sc.nextInt();

		TCount t1 = new TCount();
		t1.setNum(n);
		t1.start();

	}// main

}
