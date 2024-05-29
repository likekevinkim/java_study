package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2_list {
	public static void main(String[] args) {

		// ArrayList에 정수 3개를 입력받고, 두배로 곱해진 결과를 출력

		Scanner sc = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			System.out.print("정수입력 : ");
			num.add(sc.nextInt() * 2);
		} // for

		System.out.println(num);

	}// main
}
