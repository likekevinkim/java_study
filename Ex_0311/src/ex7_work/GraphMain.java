package ex7_work;

import java.util.Random;

public class GraphMain {
	
	public static void main(String[] args) {
		
		// 0~9까지 난수 100개를 만들고
		// 만들어진 100개의 난수에서 0~9까지 갯수를 판다하여 그래프로 표기하시오
		// 각 난수의 숫자를 판단하는 코드는 main에서,
		// 난수를 그래프화하는 코드는 PrintGraph클래스에서 작업

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
		
		PrintGraph sharp = new PrintGraph();
		sharp.printG(res);
		
		
		
	}//main

}
