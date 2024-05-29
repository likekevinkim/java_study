package ex2_string_method;

public class Ex1_stringMethod {
	public static void main(String[] args) {

		// <String Method>
		// Method란 어떠한 작업을 수행하기 위한 명령문들의 집합 (method 코드는 기본적으로 ()를 가지고 있다._
		// 반복적으로 사용되는 코드를 Method의 재활용을 통해 줄여줄 수 있다

		String name = "Hong Gil Dong";

		// .length 값의 길이
		int idx = name.length();
		System.out.println("1. name의 길이 : " + idx);

		// .indexOf
		idx = name.indexOf('o'); // 찾는 값의 처음 위치를 알려줌
		System.out.println("2. 맨 처음 o의 위치 : " + idx);

		idx = name.indexOf('z'); // 찾는 값이 없으면 -1을 돌려줌
		System.out.println("3. 맨 처음 z의 위치 : " + idx);

		idx = name.indexOf("Gil"); // 문장 Gil의 시작 위치도 가능
		System.out.println("4. 맨 처음 Gil의 위치 : " + idx);

		idx = name.lastIndexOf("o"); // 찾는 값의 마지막 위치를 알려줌
		System.out.println("5. 마지막 o의 위치 : " + idx);

		// .charAt (많이 사용됨)
		char c = name.charAt(7);
		System.out.println("6. 7번째 위치의 문자 : " + c);

		// .substring
		String str = name.substring(5, 8); // (0부터 시작)5번째부터 8앞의 (7)번째 값
		System.out.println("7. : " + str);

		// .split : 공백을 기준으로 배열에 입력
		String[] sArr = name.split(" ");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println("8. 배열에 입력된 값 : " + sArr[i]);
		}

		// .replace : 문장교체
		String greet = "hello world";
		String g2 = greet.replace("world", "java");
		System.out.println("9. greet을 변경한 g2의 값 : " + g2);

		// .trim : 앞뒤 공백 제거
		String s1 = " jyh ";
		System.out.println("10-1. 이건 몇자지? " + s1.length());
		if (s1.trim().equals("jyh")) {
			System.out.println("10. trim쓰면 앞뒤 공백이 제거되서 3글자로 값이 같다");
		}

		// .equalsIgnoreCase : 대소문자 구분없이 같다고 인식
		String que = "apple";
		String ans = "Apple";
		if (que.equalsIgnoreCase(ans)) {
			System.out.println("11. 대소문자가 다른 두 글자가 같다고 인식해서 정답");
		}

		// Integer.parseInt(숫자형태문장) : 숫자형태문장을 실제 정수로 바꿔 줌
		String number = "80";
		int num = Integer.parseInt(number);
		System.out.println("12. 80이 숫자로 바꿔 인식하고 + 1도 잘됨 : " + num + 1);

		// <기본 자료형의 wrapper class>
		// int - Integer
		// char - Character
		// boolean - Boolean
		// byte - Byte
		// short - Shout
		// long - Long
		// float - Float
		// double - Double

	}// main
}