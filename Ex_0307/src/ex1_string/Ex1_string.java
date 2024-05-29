package ex1_string;

import java.util.Scanner;

public class Ex1_string {
	public static void main(String[] args) {

		// String class
		// String class의 두가지 특징
		// 1) 객체 생성방법이 두가지 ( 암시적, 명시적 )
		// 1-1) 암시적 객체생성 - stack 메모리에서 A1이 heap 메모리 영역을 콜할때 heap 메모리 영역에 자료가 없으면 새롭게 생성.
		// A2가 A1과 같은 값을 만드려고 한다면 A1이 만든 값을 암시적 객체 생성. String은 유일하게 암시적, 명시적이 모두 가능
		// 1-2) 명시적 객체생성 - heap 메모리 새로운 주소에 새롭게(new) 만듬 

		// 2) 한번 생성된 문자열의 내용은 변하지 않는다 (immutable 불변의 특징)

		// 암시적 객체생성의 예
		/*String s1 = "abc";
		String s2 = "abc";

		String s3 = new String("abc"); // 명시적 객체생성

		// 객체간 비교시 ==은 값이 아닌 "주소"를 비교
		if (s1 == s3) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");
		}

		// 객체간 heap 메모리의 입력값 비교 ().equals()
		if ( s1.equals(s3)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("y or n : ");
		String ss = sc.next();
		
		if(ss.equals("y")) {
			System.out.println("y입력완료");
		}else {
			System.out.println("n입력완료");
		}*/
		
		
		// 2) 생성된 문자열의 내용은 변하지 않아서 원래 값에 어떤 값을 추가하면 
		// 원래내용에 새롭게 추가한 값을 더한 새로운 영역을 만들고 원래 내용만 있는 영역은 heap메모리 영역안에 garbage collector가 자동 삭제한다.
		String greet = "hello";
		greet += " world";
		System.out.println(greet);
		
		String a1 = "abc";
		String a2 = "abc";
		a2 = "ddd";
		
		
		
	}// main
}
