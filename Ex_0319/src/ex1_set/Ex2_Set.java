package ex1_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex2_Set {

	public static void main(String[] args) {

		Set<String> hs = new HashSet<String>();
		hs.add("홍길동");
		hs.add("박길동");
		hs.add("김순자");
		hs.add("홍길동"); // 중복값은 안나옴

		System.out.println(hs.size());
		System.out.println(hs);

		String[] arr = hs.toArray(new String[0]);
		System.out.println(arr[2]);

		System.out.println("--------------------------");

		// TreeSet : 중복값 제거는 물론 오름차순 정리(숫자, 문자, 문자열)도 자동으로 됨
		Set<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(45);
		ts1.add(100);
		ts1.add(1);
		ts1.add(15);
		ts1.add(15); // 중복값은 안나옴

		System.out.println(ts1);

		System.out.println("--------------------------");

		Set<String> ts2 = new TreeSet<String>();
		ts2.add("바나나");
		ts2.add("사과");
		ts2.add("옥수수");
		ts2.add("수박");

		System.out.println(ts2);

	}// main

}
