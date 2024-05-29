package ex7_work;

import java.util.Scanner;

public class ActorMain {
	public static void main(String[] args) {

		// 검색할 배우 : kang
		// [kang]
		// 전우치
		// 의형제
		// 반도

		// 검색할 배우 : aaa
		// 해당 배우의 정보가 없습니다.

		String[][] actor = { { "[song]", "박쥐", "괴물", "관상" }, 
							 { "[lee]", "백두산", "광해", "지아이조" },
							 { "[kang]", "전우치", "의형제", "반도" } };

		// 배우 정보 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String act = sc.next();

		int cnt = 0;
		for (int i = 0; i < actor.length; i++) {
		
			if(actor[i][0].equals("["+act+"]")) {
				for(int j = 0; j<actor[i].length;j++) {
					System.out.println(actor[i][j]);
				}
			}else {
				
				cnt++;
				if(cnt == actor.length) {
				System.out.println("배우의 정보가 없어요");
				}
			}
			
		}
			
			
			
			
		/*for (int i = 0; i < actor.length; i++) {

			for (int j = 0; j < actor[i].length; j++) {
				String change1 = actor[i][j].replace("]", "");
				String change2 = change1.replace("[", "");

				if (act.equals(change2)) {
					for (int k = 0; k < actor[i].length; k++) {
						System.out.println(actor[i][k]);

					} // for
					return;
				} // if

			} // inner

		} // outer
		System.out.println("해당배우의 정보가 없습니다.");*/

	}// main

}