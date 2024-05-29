package ex5_class_array;

public class PesonMain {

	public static void main(String[] args) {

		/*
		 * Person p = new Person(); p.setName("일길동"); p.setAge(20);
		 * 
		 * Person p2 = new Person(); p2.setName("이길동"); p2.setAge(21);
		 */

		Person[] p = new Person[2]; // 메모리 할당 전단계 (준비)

		// 명시적 객체생성 name/age 모두 한번에 생성(생성)
		for (int i = 0; i < p.length; i++) {
			p[i] = new Person();

		}

		p[0].setName("일길동");
		p[0].setAge(20);

		p[1].setName("이길동");
		p[1].setAge(21);

		// class로 만든 객체의 각 입력값을 출력
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName() + " / " + p[i].getAge());
		}

	}// main

}
