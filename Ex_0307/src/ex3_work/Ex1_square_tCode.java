package ex3_work;

import java.util.Scanner;

public class Ex1_square_tCode {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 1; // 시작수
		int y = 0; // 행(y)
		int x = 0; // 열(x)

		System.out.print("홀수 : ");
		int size = sc.nextInt();

		int[][] arr = new int[size][size];

		x = size / 2; // 열의 가운데 1을 포석

		while (num <= size * size) {
			arr[y][x] = num;

			if (num % size == 0) {
				y++;
			} else {
				y--;
				x++;
			}

			if (y < 0)
				y = size - 1;

			if (x >= size)
				x = 0;

			num++;
		} // while

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.printf("%02d ", arr[i][j] );
			} // inner
			System.out.println();
		} // outer

	}// main
}
