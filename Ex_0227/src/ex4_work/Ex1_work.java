package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//스캐너 사용
		
		// 12월은 31일까지 있습니다. 를 Switch문으로 표현하세요.
		System.out.print("몇월? : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
			System.out.println("1월은 31일까지 있습니다.");
			break;

		case 2:
			System.out.println("2월은 28일까지 있습니다.");
			break;

		case 3:
			System.out.println("3월은 31일까지 있습니다.");
			break;

		case 4:
			System.out.println("4월은 30일까지 있습니다.");
			break;

		case 5:
			System.out.println("5월은 31일까지 있습니다.");
			break;

		case 6:
			System.out.println("6월은 30일까지 있습니다.");
			break;

		case 7:
			System.out.println("7월은 31일까지 있습니다.");
			break;

		case 8:
			System.out.println("8월은 31일까지 있습니다.");
			break;

		case 9:
			System.out.println("9월은 30일까지 있습니다.");
			break;

		case 10:
			System.out.println("10월은 31일까지 있습니다.");
			break;

		case 11:
			System.out.println("11월은 30일까지 있습니다.");
			break;

		case 12:
			System.out.println("12월은 31일까지 있습니다.");
			break;

		default:
			System.out.println("올바른 달을 입력하세요");
			break;

		}// switch

		switch (month) {
		// case 1, 3, 5, 7, 8, 10, 12 : //JAVA 17 버전 이후에는 이렇게도 가능
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일까지");
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지");
			break;

		case 2:
			System.out.println("2월은 28일까지");
			break;

		default:
			System.out.println(month + "월은 없습니다");
			break;
		}
	}
}
