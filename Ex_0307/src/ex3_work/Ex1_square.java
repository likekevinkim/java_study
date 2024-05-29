package ex3_work;

import java.util.Scanner;

public class Ex1_square {
	public static void main(String[] args) {

		// 키보드에서 홀수값을 입력받으면
		// 입력받은 값에 따라 규칙을 가지는 "마방진"을 생성한다
		// --
		// 홀수 : 3 입력시 3X3 배열을 만듬
		// 1열의 가운데 1이 찍힘
		// 1칸위 (윗칸이 없을시 맨밑에 칸으로) + 오른쪽 한칸에 다음 숫자 찍힘(오른쪽 끝이면 왼쪽끝으로 이동)
		// 그자리에 숫자가 있으면 직전 숫자 밑으로
		// 각 열, 행, 대각선의 합이 같음
		// 08 01 16
		// 03 05 07
		// 04 09 02

		Scanner sc = new Scanner(System.in);
		// 배열 크기 입력
		System.out.print("배열의 크기를 입력하세요 : ");
		int a = sc.nextInt();
		int[][] arr = new int[a][a];

		// 최초수의 좌표값 및 수 지정
		int x = 0;
		int y = a / 2;
		int s = 1;

		while (s <= a * a) {
			arr[x][y] = s;

			if (s % a == 0) {
				x++;

			} else {
				x--;
				y++;
			}

			if (x < 0)
				x = a - 1;

			if (x > a - 1)
				x = 0; //필요없음

			if (y > a - 1)
				y = 0;

			if (y < 0)
				y = a - 1; //필요없음

			s++;

		} // while

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr[i][j] + "\t");
			} // inner
			System.out.println();
		} // outer

	}// main
}
