package ex3_work;

import java.util.Scanner;

public class Ex3_work_tCode {
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
		int n = sc.nextInt();

		String[] info = { "이름", "수학", "영어" };
		String[][] stu = new String[n][info.length]; // n명만큼 / info의 갯수만큼 정보 입력 받음 -> 유지보수 편하게

		// 값을 입력 받아 stu배열에 저장
		for (int i = 0; i < n; i++) { // n대신 stu.length 사용 가능

			for (int j = 0; j < stu[i].length; j++) {

				System.out.printf("%s : ", info[j]);
				stu[i][j] = sc.next();

			} // inner
			System.out.println("-------------");

		} // outer
		System.out.println(n + "명 등록완료");
		System.out.println("이름\t수학\t영어"); // for문으로 자동화 가능하나 일단 이정도로 넘어감

		for (int i = 0; i < stu.length; i++) {

			for (int j = 0; j < stu[i].length; j++) {

				System.out.print(stu[i][j] + "\t");
			}
			System.out.println();
		}

	}// main
}
