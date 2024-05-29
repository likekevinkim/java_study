package ex2_array_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		
		//ex 배열의 길이 : 5
		//순차적으로 A-E... 자동 입력
		//인덱스네 전체 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int a = sc.nextInt();
		
		char[] arr = new char[a];
		char alpha = 'A';
		
		for (int i = 0; i < arr.length; i++) {
			//arr[i] = alpha++;
			//System.out.print((arr)[i]);
			System.out.print(arr[i] = alpha++);
		}
		
		System.out.println();
		
		System.out.println("---String 배열의 초기값---");
		String[] sArr = new String[2];
		sArr[0] = null;
		sArr[1] = ""; //실무에서는 null 보다 ""를 선호
		
		System.out.println("null로 초기화 : " +sArr[0]);
		System.out.println("빈값(\"\")으로 초기화 : " +sArr[1]);
		
		//String ab = null; 으로 하면 null안녕으로 출력
		String ab = ""; //안녕으로 출력
		ab += "안녕";
		System.out.println(ab);
		
	}//main
}
