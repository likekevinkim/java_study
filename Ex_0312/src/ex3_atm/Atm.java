package ex3_atm;

import java.util.Set;

public class Atm {

	private int money;


	// 입금
	public void deposit(int money) {
		this.money += money;
		System.out.println("입금성공");
	}

	// 출금
	public int withraw(int money) {
		if (this.money - money < 0 ) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		}else {
			this.money -= money;
			System.out.println("출금성공");
			return money;
		}
	}

	// 잔액확인
	public void balance() {
		System.out.println("잔액 " + money);
	}

}
