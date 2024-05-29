package ex9_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex1_Work {
	public static void main(String[] args) {

		/*
		 * word : ☆☆☆☆☆ >> o
		 * o는 포함되어있지 않습니다. 
		 * word : ☆☆☆☆☆ >> p 
		 * word : ☆pp☆☆ >> aa 
		 * 한글자 영소문자만 입력하세요 
		 * word : ☆pp☆☆ >> a 
		 * word : app☆☆ >> a 
		 * a는 이미 입력한 문자입니다. 
		 * word : app☆☆
		 * >> e word : app☆e >> l word : apple >> apple 정답! 정답횟수 7회
		 */

		String[] str = { "hope", "view", "banana", "apple" };
		Scanner sc = new Scanner(System.in);

		int randomArr = new Random().nextInt(str.length);
		String question = str[randomArr];

		String[] que = question.split("");
		for (int i = 0; i < que.length; i++) {
			System.out.print(que[i] + "");
		}
		System.out.println();

		System.out.print("word : ");
		String[] star = new String[que.length];
		for (int i = 0; i < que.length; i++) {
			star[i] = "☆";
			System.out.print(star[i]);
		}
		System.out.println(" >>");

//		System.out.print("word : " + star + ">>");
		int count = 0; //횟수체크
		
		while(true) {
		// 단어 입력 맞추기
		String answer = sc.next();

		// 1글자만 입력
		if (answer.length() > 1) {
			System.out.println("한글자만 입력하세요.");
		}

		// 입력한 글자가 랜덤 단어에 있는지 확인하고 별을 원래 글자로
		for (int i = 0; i < que.length; i++) {
			if (que[i].equals(answer)) {
				star[i] = que[i];
			}
			System.out.print(star[i]);
		}//for
		
		System.out.println();
		
		//글자 확인하고 문제내는 거 반복
		System.out.print("word : ");
		for (int i = 0; i < que.length; i++) {
			System.out.print(star[i]);
		}//for
		System.out.println(" >>");
		
		count++;
		}//while
		
	}// main

}
