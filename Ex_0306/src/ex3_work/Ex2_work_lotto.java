package ex3_work;

import java.util.Random;

public class Ex2_work_lotto {
	public static void main(String[] args) {

		// 1~45사이의 난수를 발생시켜 lotto배열에 담고 결과를 출력

		int[] lotto = new int[6];

		// 랜덤으로 겹치지 않는 로또번호 추출
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = new Random().nextInt(45) + 1;

			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) {
					i--;
				}
			} // inner

		} // outer
		for (int i = 0; i < lotto.length; i++) {

			System.out.print(lotto[i] + " ");
		}

		System.out.println();
		
		//teacher's code
		out : for(int i = 0; i < lotto.length; ) {
		
			lotto[i] = new Random().nextInt(45) + 1;
			
			for(int j = 0; j < i; j++) {
			
				if (lotto[i] == lotto[j]) {
					continue out;
				}
			}//inner
			
			System.out.print(lotto[i] + " ");
			i++;
		}//outer
		
	}// main

}
