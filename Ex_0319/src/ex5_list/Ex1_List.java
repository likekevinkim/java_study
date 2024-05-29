package ex5_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1_List {
	public static void main(String[] args) {

		// 다섯개의 문장을 입력받아 ArrayList에 담는다
		// 담겨진 값들 중 가장 긴 문자열을 출력

		Scanner sc = new Scanner(System.in);

		List<String> arr = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {

			System.out.print("입력 : ");
			arr.add(sc.next());

		}
		String sLonger = "";
		for (String str : arr) {
			if (str.length() > sLonger.length()) {
				sLonger = str;
			}
		} // for

		System.out.println("가장 긴 문장 : " + sLonger);

	}// main
}
