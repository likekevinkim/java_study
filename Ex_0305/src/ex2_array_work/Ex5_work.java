package ex2_array_work;

import java.util.Scanner;

public class Ex5_work {
	public static void main(String[] args) {
		
		//배열의 크기를 결정할 값을 입력받고, 배열의 크기만큼 모든 index에
		//키보드에서 입력받은 정수를 채워넣는다.
		//최종적으로 완료된 배열안에서 홀수와 짝수의 갯수를 찾아 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 정하세요 : ");
		int num = sc.nextInt();
		
		int [] size = new int[num];
		
		//키보드에서 배열의 크기만큼 입력 받기
		System.out.printf("%d 개의 정수를 입력하세요\n", num);
		
		for (int i = 0; i < size.length; i++) {

			size[i] = sc.nextInt();
		
		}
		
		//입력한 n개의 숫자를 보자
		for(int c : size) {
			System.out.print(c + " ");
		}
		
		
		//배열 안에서 홀수와 짝수 수 찾기
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < size.length; i++) {
			if (i % 2 != 0) {
				odd++;
			}else {
				even++;
			}
		}//for
		
		System.out.printf("홀수는 %d개, 짝수는 %d개 입니다.", odd, even);

		
	}//main
}
