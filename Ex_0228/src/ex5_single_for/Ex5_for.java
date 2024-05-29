package ex5_single_for;

import java.util.Scanner;

public class Ex5_for {
	public static void main(String[] args) {
		
		//키보드에 정수를 받고 입력받은 숫자에 해당되는 구구단을 출력
		//단, 2~9사이의 값을 입력받지 않았다면
		//'2~9사이의 값만 입력해주세요'를 출력
		
		//단 : 5
		//5 X 1 = 5
		//5 X 2 = 10
		// ...
		//5 X 9 = 45
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 보고 싶은 단을 입력하세요.");
		int num = sc.nextInt();
		
		for (int i = 0 ; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
		
		
		
		System.out.println("--------------------------------------");
		
		int dan = sc. nextInt();
		
		if(dan <= 1 || dan >10) {
			System.out.println("2~9사이 값만 입력하세요");
		} else {
			
			for(int i = 1; i <= 9; i ++) {
				
				System.out.printf("%d X %d = %d\n", dan, i, dan * i);
			}
		}
		
	}//main
}
