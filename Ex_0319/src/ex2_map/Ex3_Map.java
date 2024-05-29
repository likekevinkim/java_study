package ex2_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3_Map {
	public static void main(String[] args) {

		// id : kim
		// pw : 2222
		// 비밀번호 불일치

		// id : lim
		// pw : 1234
		// 존재하지 않는 id

		// id : lee
		// pw : 2222
		// lee 님 환영합니다.

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);

		System.out.print("id 입력 : ");
		String id = sc.next();

		System.out.print("pw 입력 : ");
		int pw = sc.nextInt();

		if (!map.containsKey(id)) {
			System.out.println("존재하지 않는 id");

		} else {
			// 아이디가 존재하는 경우 비밀번호 체크
			if (map.get(id) == pw) {
				System.out.printf("%s님 환영합니다.", id);

			} else {
				System.out.println("비밀번호 불일치");
			}

		}

	}// main
}
