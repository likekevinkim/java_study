package ex6_constructor;

import java.util.Scanner;

public class VendingMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Vending v = new Vending();//Vending에서 생성자를 통해 초기화되서 옴
//		v.init();//음료정보 초기화

		System.out.print("insert coin : ");
		int money = sc.nextInt();

		v.showCans(money);
		System.out.print("음료를 골라 : ");
		String sel = sc.next();

		v.outCan(sel);

	}// main
}
