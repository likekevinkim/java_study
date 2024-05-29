package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 정수를 입력하세요(종료: 0)
		// >> 45
		// >> 17
		// >> 20
		// >> ...
		// >> 0
		// 원하는 숫자의 범위를 입력하시오
		// 시작값 : 15
		// 끝값 : 20
		// 범위내의 숫자
		// 17
		// 20

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<Integer>();

		System.out.print("정수를 입력 하세요(종료 0) : \n>>");

		while (sc.nextInt() != 0) {
			System.out.print(">>");
			list.add(sc.nextInt());

		}

		System.out.println("원하는 숫자의 범위를 입력하시오");
		
		System.out.print("시작값 : ");
		int sNum = sc.nextInt();
		
		System.out.println("끝값 : ");
		int fNum = sc.nextInt();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= sNum && list.get(i) <= fNum) {
				System.out.println(list.get(i));
			}
		}

	}// main
}
