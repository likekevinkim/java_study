package ex3_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		// id : aaa
		// pwd : 1111
		// aaa/1111
		// ---
		// id : bbb
		// pwd : 2222

		Scanner sc = new Scanner(System.in);
		List<UserInfo> user = new ArrayList<UserInfo>();

		outer: while (true) {
			UserInfo ui = new UserInfo();
			System.out.println("id : ");
			String id = sc.next();
			ui.setId(id);

			// 아이디 중복체크
			for (int i = 0; i < user.size(); i++) {

				// if(ui.getId().equals(user.ger(i).getId())) -> 선생님 방식
				if (user.get(i).getId().equals(id)) {
					System.out.println("아이디가 중복됨");
					continue outer;
				}
			}

			System.out.println("pwd : ");
			ui.setPwd(sc.nextInt());

			user.add(ui);

			for (int i = 0; i < user.size(); i++) {
				System.out.println(user.get(i).getId() + "/" + user.get(i).getPwd());
			} // for

		} // while

	}// main
}
