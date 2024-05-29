package ex5_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {

		// ArrayList에 담긴 값들 중 내가 입력받은 문장과 동일한 값이 몇번째 인덱스에 있는지 찾아내기
		// ==========
		// 찾을 문장 : Blue
		// Blue의 모든 인덱스 : [1, 3, 5]
		Scanner sc = new Scanner(System.in);

		List<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Blue");
		colors.add("Cyan");

		System.out.print("입력 : ");
		String str = sc.next();

		
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < colors.size(); i++) {
			if (str.equals(colors.get(i))) {

				result.add(i);
			}
		} // for
		System.out.print(result);

	}// main
}
