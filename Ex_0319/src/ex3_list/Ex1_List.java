package ex3_list;

import java.util.ArrayList;
import java.util.List;

public class Ex1_List {
	public static void main(String[] args) {

		// List구조
		// 인덱스로 특정 데이터에 접근할 수 있다
		// 인덱스의 제한이 없어 원하는 만큼 값을 넣고 줄일 수 있다
		// 속도는 느리고 중복값 제거 기능은 없으나 인덱스 접근 기능으로 많이 쓰임
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(10);
		list.add(11);

		// 1번 index에 100을 추가
		list.add(1, 100);

		// 0번 index의 값을 20으로 수정
		list.set(0, 20);

		// 2번 index의 값을 제거
		list.remove(2);

		System.out.println(list.size());
		System.out.println(list);

		System.out.println(list.get(2)); // 0번부터 시작되는 인덱스중 지정값만 볼 수 있음

		// ArrayList는 for문으로 출력도 가능
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}

	}// main
}
