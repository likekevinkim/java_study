package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3_List {

	public static void main(String[] args) {

		// 아이디 생성 : aaa
		// [aaa]
		// 아이디 생성 : bbb
		// [aaa, bbb]
		// 아이디 생성 : aaa
		// 중복된 아이디
		// 아이디 생성 : exit
		// 종료

		Scanner sc = new Scanner(System.in);
		List<String> arr = new ArrayList<String>();

		outer: while (true) {
			System.out.println("아이디 생성 : ");
			String id = sc.next();
			for (int i = 0; i < arr.size(); i++) {
				if (id.equalsIgnoreCase(arr.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				} // if

				if (id.equalsIgnoreCase("exit")) {
					System.out.println("종료");
					break;
				} // if

			} // for
			arr.add(id);
			System.out.println(arr);

		} // while

	}// main

}
