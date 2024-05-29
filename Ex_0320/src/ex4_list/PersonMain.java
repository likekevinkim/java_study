package ex4_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {

		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >>1
		// ---회원추가---
		// 이름 : hong
		// 나이 : 20
		// 전화 : 010
		// 정보저장완료
		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >>3
		// ---전체정보---
		// 등록인원 1명
		// hong / 20 /010
		// 1.회원추가
		// 2.회원삭제
		// 3.전체정보
		// etc.종료
		// >>2
		// ---회원삭제---
		// 삭제할 이름 : hong
		// 삭제성공 or OOO은 없습니다

		List<Person> info = new ArrayList<Person>();

		Scanner sc = new Scanner(System.in);
		Person pInfo = new Person();

		outer: while (true) {

			System.out.println("1. 회원추가");
			System.out.println("2. 회원삭제");
			System.out.println("3. 전체정보");
			System.out.println("etc. 종료");
			System.out.print(">>");
			int select = sc.nextInt();

			switch (select) {
			
			case 1://회원추가
				System.out.println("---회원추가---");
				System.out.print("이름 : ");
				pInfo.setName(sc.next());
				System.out.print("나이 : ");
				pInfo.setAge(sc.nextInt());
				System.out.print("전화번호 : ");
				pInfo.setTel(sc.next());
				
				info.add(pInfo);
				System.out.println("정보저장완료");
				
				break;

			case 2://회원삭제
				System.out.println("---회원삭제---");
				System.out.print("삭제 할 이름 : ");
				String name = sc.next(); // 아래 대신 tCode
				//pInfo.setName(sc.next());

				for (int i = 0; i < info.size(); i++) {
					
					if (info.get(i).getName().equals(name)) { //아래 대신 tCode
					//if (!info.get(i).getName().equals(pInfo.getName())) { 
						info.remove(i);
						System.out.println("삭제성공");
						break;
					} else {
						if( i + 1 == info.size()) {
							System.out.println(name + "정보가 없습니다");
							
						}
					}
				}
				break;
				
			case 3://전체정보
				System.out.println("---전체정보---");

				for (int i = 0; i < info.size(); i++) {

					System.out.println(info.get(i).getName() + " / " + 
							           info.get(i).getAge() + " / " +
							           info.get(i).getTel());
				}//for
				break;

			default:
				System.out.println("종료");
				break outer;

			}// switch
			System.out.println("----------------");
		} // while

	}// main
}
