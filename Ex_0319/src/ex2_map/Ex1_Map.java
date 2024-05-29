package ex2_map;

import java.util.HashMap;
import java.util.Map;

public class Ex1_Map {
	public static void main(String[] args) {

		// Map : 키(key)와 값(value)을 묶어서 하나의 데이터로 저장
		// 키를 통해 값을 얻어내는 구조이므로, 많은 양의 데이터를 검색하는데 매우 뛰어난 성능
		// Map은 키의 중복을 허용하지 않는다
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		map.put(0, 'C'); // JAVA에서 Map만 put으로 값을 입력, 더한다
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(0, 'D'); // 같은 키값에 중복된 값이 들어가 있으면 어던 값을 가져올지 몰라 키값의 중복을 허용하지 않는다. 출력값은 중복되도 상관 없다.

		// 지우고 싶은 키값에 해당하는 영역을 삭제
		map.remove(2);

		System.out.println(map.size());
		System.out.println(map);

		// 인덱스가 없어도 원하는 값을 가져오는데(get) 문제가 없다.
		char res = map.get(0);
		System.out.println(res);

		// 가지고 있는 키값 확인
		if (map.containsKey(0)) { // map.containsKey(0) == true
			System.out.println("0이라는 이름의 key가 있음");
		}

		// 가지고 있는 출력값 확인
		if (map.containsValue('A')) { // map.containsValue('A') ==true
			System.out.println("A가 map안에 있음");
		}

	}// main
}
