package ex2_array_work;

import java.util.Scanner;

public class Ex7_work {
	public static void main(String[] args) {

		// 키보드에서 입력받은 값만큼의 배열을 생성하고
		// 학생들의 성적을 입력받는다.
		// 입력된 모든 학생들을 기반으로 평균성적 이상인 학생들의 목록과
		// 평균이상인 학생들의 수를 출력
		// --------예시결과---------
		// 학생 수 : 3
		// 학생 1의 성적 : 90
		// 학생 2의 성적 : 75
		// 학생 3의 성적 : 84
		// .....
		// 평균성적 : 83.0
		// --평균이하
		// 학생1
		// 학생3
		// 평균이상 학생 수 :2

		Scanner sc = new Scanner(System.in);

		// 학생 수 입력
		System.out.print("학생 수 입력 : ");
		int s = sc.nextInt();
		int[] student = new int[s];

		// 학생 점수 입력
		for (int i = 0; i < student.length; i++) {
			System.out.printf("학생 %d의 성적을 입력하세요 : ", i + 1);
			student[i] = sc.nextInt();
		}
		System.out.println("--입력완료--");

		// 학생의 성적 평균
		int sum = 0;
		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}
		float avg = (float) sum / s;
		System.out.printf("평균 성적 : %.1f", avg);

		System.out.println("--평균 이상인 학생----");

		// 평균이하 학생
		for (int i = 0; i < student.length; i++) {
			if (student[i] <= avg) {

				System.out.printf("=> 학생 %d\n", i + 1);
			}
		}

		// 평균이상 학생 수
		int avgCount = 0;
		for (int i = 0; i < student.length; i++) {
			if (avg <= student[i]) {
				avgCount++;
				System.out.printf("평균이상의 학생수 : %d", avgCount);
			}
		}

	}// main
}
