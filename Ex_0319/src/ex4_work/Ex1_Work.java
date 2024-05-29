package ex4_work;

import java.util.Scanner;

public class Ex1_Work {

	public static void main(String[] args) throws InterruptedException {

		// String[] str = {"apple", "grape", "orange", " pineapple", ... }
		// 3초 간격으로 배열의 값중 하나를 랜덤으로 골라내서 ArrayList에 추가
		// ArrayList의 값을 화면에 보여주고
		// 사용자가 입력한 값이 ArrayList에 포함되었다면 제거

		WorkThread q = new WorkThread();
		q.start();
		Thread.sleep(100);
		q.startGame();

	}// main

}
