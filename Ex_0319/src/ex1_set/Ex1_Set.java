package ex1_set;

import java.util.HashSet;
import java.util.Set;

public class Ex1_Set {

	public static void main(String[] args) {

		// 컬렉션 (collection framework) 프레임 워크
		// 컬렉션은 다수의 요소를 하나의 그룹으로 묶어서 효율적으로 관리할 수 있는 기능을 제공하는 클래스(인터페이스)
		// 컬렉션의 특징
		// 1. 가변적인 크기를 갖는다
		// 2. 데이터의 추가, 검색, 정렬 등 편리한 기능들을 다수 보유하고 있다

		// 컬렉션 프레임워크의 종류
		// 1. Set
		// 2. Map
		// 3. List

		// Set : 값의 중복을 허용하지 않는다
		// HashSet<Integer> hs = new HashSet<Integer>(); 으로 사용하면 속도적으로 차이가 있음
		Set<Integer> hs = new HashSet<Integer>(); // 부모를 통해 자식을 생성하는 구조. 실무적으로는 속도때문에 이 방식을 더 많이 씀
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(100); // 값의 중복을 허용하지 않음

		// 50이 포함되어 있는 메모리 할당 공간을 제거
		hs.remove(50);
		hs.remove(50); // 위에 이미 삭제된 값을 다시 지워도 문제는 발생하지 않음

		hs.add(120);

		System.out.println(hs.size()); // 배열의 length처럼 size로 그 크기를 볼 수 있음
		System.out.println(hs); // 값의 크기나 범위에 따라 순서대로 나오거나 하진 않음 (주소값에 따라 순서 다름)

		// set자체에는 인덱스가 없기때문에 특정 값만을 출력하려면 set자체를 배열로 바꿔서 출력해야할 수 있다
		// set -> 배열
		// 배열의 크기를 0으로 지정하면, 자동으로 배열의 크기가 설정 됨
		Integer[] arr = hs.toArray(new Integer[0]);

		for (int n : arr) {
			System.out.println(n + " ");
		}

	}// main

}
