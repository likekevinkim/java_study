package ex8_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// 크림빵 500원
		// 새우깡 700원
		// 콜라 400원
		// 사용자가 현재 가지고 있는 금액을 키보드에서 입력받고,
		// 크림빵, 새우깡, 콜라를 잔돈을 하나도 남기지않고 구입할 수 있는
		// 모든 경우의 수를 출력. 단, 사용하지 않는 상품이 있으면 안된다.
		// ----
		// 소지금 입력 : 4000원
		// 크림빵 1개, 새우깡 1봉지, 콜라 7캔
		// 크림빵 2개, 새우깡 2봉지, 콜라 4캔
		// 크림빵 3개, 새우깡 3봉지, 콜라 1캔
		// 크림빵 5개, 새우깡 1봉지, 콜라 2캔

		int cream = 500;
		int ggang = 700;
		int coke = 400;

		Scanner sc = new Scanner(System.in);
		System.out.print("소지금을 입력하세요 : ");
		int money = sc.nextInt();

		for (int i = 500; i <= money - 1100; i += 500) {

			for (int j = 700; j <= money - 900; j += 700) {

				for (int k = 400; k <= money - 1200; k += 400) {

					if (((cream * i / 500) + (ggang * j / 700) + (coke * k / 400)) == money) {
						System.out.printf("크림빵 %d개, 새우깡 %d개, 콜라 %d캔\n", (i / 500), (j / 700), (k / 400));
					}

				} // for3
			} // for2
		} // for1

	}// main
}
