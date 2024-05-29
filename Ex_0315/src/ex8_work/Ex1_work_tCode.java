package ex8_work;

import java.util.Scanner;

public class Ex1_work_tCode {
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

		for (int i = 1; money - i * cream > 0; i++) {
			for (int j = 1; money - j * ggang > 0; j++) {
				for (int k = 1; money - k * coke > 0; k++) {

					if (money == i * cream + j * ggang + k * coke) {
						System.out.printf("크림빵 %d개, 새우깡 %d개, 콜라 %d개\n", i, j, k);
					}

				}
			}

		} // outer

	}// main
}
