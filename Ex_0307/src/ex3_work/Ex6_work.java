package ex3_work;

import java.util.Random;

public class Ex6_work {
	public static void main(String[] args) {

		// 0~9까지 난수 100개를 만들고
		// 만들어진 100개의 난수에서 0~9까지 갯수를 판다하여 그래프로 표기하시오

		// 0의 갯수 : ########## 10
		// 1의 갯수 : ######## 8
		// .....

		// 난수 100개 생성

		int[] res = new int[10];

		for (int i = 0; i < 100; i++) {
			int rNum = new Random().nextInt(10);
			// System.out.print(rNum);
			res[rNum]++; //key code 난수의 갯수를 배열에 +
		}

		for (int i = 0; i < res.length; i++) {

			System.out.printf("%d의 갯수 : ", i);

			for (int j = 0; j < res[i]; j++) {

				System.out.print("#");
			}
			System.out.print(" " + res[i]);
			System.out.println();
		}

	}// main
}
