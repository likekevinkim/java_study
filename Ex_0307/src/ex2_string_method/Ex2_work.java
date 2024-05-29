package ex2_string_method;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		//사용자의 이메일을 입력받ㄷ고 @ 앞의 문장의 길이가 5미만 9초과인 경우
		//오류메시지 출력하기
		
		//이메일 : abc@n.com
		//이메일의 형식이 올바르지 않습니다.
		
		//이메일 : aabbcc@n.com
		//aaccbbs님 환영합니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		//이메일 입력받기
		System.out.println("이메일을 입력하세요");
		String email = sc.next();
		
		//이메일 체크받기
		String[] check = email.split("@");
		int leng = check[0].length();
		
		if(leng < 5 || leng > 9) {
			System.out.println("@앞에는 5~9 글자의 이메일을 입력하세요.");
			
		}else{
			System.out.println(check[0] + "님 환영합니다.");
		}
		
		//tCode
		String[] sp = email.split("@");
		String res = check[0];
		
		if(res.length() < 5 || res.length() > 9) {
			System.out.println("@앞에는 5~9 글자의 이메일을 입력하세요.");
			
		}else{
			System.out.println(res + "님 환영합니다.");
		}
		
		
	}//main
}
