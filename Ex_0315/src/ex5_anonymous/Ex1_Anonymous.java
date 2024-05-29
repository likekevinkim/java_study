package ex5_anonymous;

import java.util.Random;
import java.util.Scanner;

public class Ex1_Anonymous {

	public static void main(String[] args) {
		// 아래코드는 sc라는 객체이름을 정해두고
		// 필요할때마다 sc로부터 매서드를 호출할 수 있는 구조
		Scanner cs = new Scanner(System.in);

		// rnd라는 이름이 있는 Random클래스
		Random rnd = new Random();
		int n = rnd.nextInt(2);
		int n2 = rnd.nextInt(3);

		// 이름이 없는 Random클래스
		// 익명클래스는 호출 되었을때 딱한번만 사용되고 메모리에서 삭제
		int n3 = new Random().nextInt(5);

	}// main
}
