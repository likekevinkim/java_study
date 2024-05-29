package ex8_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {

		// 문장 : aabbbcc
		// 압축결과 : a2b4c2

		// 값을 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		char[] str = sc.next().toCharArray();

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[j] > str [i]) {
					char temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			

		}
		for(char i : str)
		System.out.print(i + " ");

	}// main
}
