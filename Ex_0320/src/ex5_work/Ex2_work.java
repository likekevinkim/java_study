package ex5_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex2_work {
	public static void main(String[] args) {

		// ArrayList를 2개 만들고 1~5사이의 난수를 5개 추가
		// 두 리스트의 값을 비교하여 교집합을 출력
		// -----------------------------------------
		// list1 = [5, 3, 5, 1, 5]
		// list2 = [2, 3, 1, 1, 3]
		// 교집합 : [3, 1]
		Random rnd = new Random();

		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			num1.add(rnd.nextInt(5) + 1);
			num2.add(rnd.nextInt(5) + 1);
		}

		System.out.println(num1);
		System.out.println(num2);

		Set<Integer> intersection = new HashSet<Integer>();

		//contains를 사용하여 아래 2중 for문을 대체하는 코드 만들어 보기
		
		for(int num : num1) {
			if (num2.contains(num) && !intersection.contains(num)) {
				intersection.add(num);
			}
		}
		System.out.println(intersection);
		
		
//		for (int i = 0; i < num1.size(); i++) {
//			int cnt = 0;
//
//			for (int j = 0; j < num2.size();) {
//				if (num1.get(i) == num2.get(j)) {
//					cnt++;
//					num2.remove(j);
//
//					if (cnt == 1) {
//						intersection.add(num1.get(i));
//					}
//					continue;
//				}
//				j++;
//				
//			} // i for
//		} // o for
//		System.out.println("교집합 " + intersection);

		
		
//		for (int i = 0; i < 5; i++) {
//			for (int k = 0; k < 5; k++) {
//				if (num1.get(i).equals(num2.get(k))) {
//					intersection.add(num2.get(k));
//					break;
//				}
//			}
//		} // for
//
//		System.out.println(intersection);

		//String 클래스도 contains를 포한하고 있다
		String str = "hi hello welcome world";
		if (str.contains("i")){
			System.out.println("i가 있음");
		}
		
		if(str.contains("m")) {
			System.out.println("m이 있음");
		}
		
		if(str.contains("z")) {//없어서 출력 안됨
			System.out.println("z이 있음");
		}
	}// main
}
