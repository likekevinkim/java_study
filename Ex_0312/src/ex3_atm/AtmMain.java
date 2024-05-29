package ex3_atm;

import java.util.Scanner;

public class AtmMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Atm atm = new Atm();

		int money = 0;

		outer: while (true) {

			System.out.println("1. 입   금");
			System.out.println("2. 출   금");
			System.out.println("3. 잔액확인");
			System.out.println("etc.종  료");
			System.out.print(">> ");
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("--입금--");
				System.out.print("입금액 : ");
				money = sc.nextInt();
				atm.deposit(money);
				break;

			case 2:
				System.out.println("--출금--");
				System.out.print("출금할 금액 : ");
				money = sc.nextInt();
				money = atm.withraw(money);
				break;

			case 3:
				System.out.println("잔액확인");
				atm.balance();
				break;

			default:
				System.out.println("이용해주셔서 감사합니다.");
				break outer;

			}
			System.out.println("----------------");
		}

	}// main
}
