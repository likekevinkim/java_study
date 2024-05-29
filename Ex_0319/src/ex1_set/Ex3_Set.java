package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex3_Set {
	public static void main(String[] args) {

		// HashSet을 이용하여 Lotto번호 생성하기
		Random rnd = new Random();

		Set<Integer> lotto = new HashSet<Integer>();

		while (true) {
			int n = rnd.nextInt(45) + 1;
			lotto.add(n);

			if (lotto.size() == 6) {
				System.out.println(lotto);
				break;
			}

		} // while

		System.out.println("------------------");

		Set<Integer> ab = new TreeSet<Integer>();

		while (true) {
			int a = rnd.nextInt(45) + 1;
			ab.add(a);

			if (ab.size() == 6) {
				System.out.println(ab);
				break;
			}
		}

	}// main
}
