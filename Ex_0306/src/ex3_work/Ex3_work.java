package ex3_work;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// 학생들의 수학, 영어 성적을 등록하고 출력하는 프로그램을 제작

		// 등록할 인원 수 : n
		// 이름 : hong
		// 수학 : 90
		// 영어 : 87
		// ---------------
		// 이름 : kim
		// 수학 : 70
		// 영어 : 100
		// 2명등록 완료
		// hong 90 87
		// kim 70 100

		Scanner sc = new Scanner(System.in);

		System.out.print("등록인원을 입력하세요 : ");
		int studentNum = sc.nextInt();

		String[][] score = new String[studentNum][3];

		for (int i = 0; i < score.length; i++) {

			System.out.printf("%d 학생의 이름을 입력하세요 : ", i + 1);
			String name = sc.next();
			score[i][0] = name;
			System.out.printf("%d 학생의 수학성적을 입력하세요 : ", i + 1);
			String math = sc.next();
			score[i][1] = math;
			System.out.printf("%d 학생의 영어성적을 입력하세요 : ", i + 1);
			String english = sc.next();
			score[i][2] = english;

		} // inner

		System.out.println();

		System.out.println(studentNum + "명 등록완료");

		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");

			}

		}

	}// main
}
