package ex2_overload;

public class OverloadTest {

	// 메서드의 오버로딩 : 메서드의 '중복정의'라고 하며, 하나의 클래스에서
	// 같은 이름을 가진 메서드가 여러개 정의되는 것을 말한다.

	// 오버로딩의 규칙
	// 1) 인자의 갯수가 다른경우
	// 2) 인자의 갯수는 같으나 타입이 다른경우 (인자의 이름이 다른경우는 안됨)
	// 3) 인자의 갯수가 같고, 타입까지 같지만, 순서가 다른 경우

	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}

	public void getResult(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}

	public void getResult(char n) {
		System.out.println("문자를 인자로 받는 메서드");
	}

	public void getResult(String s) {
		System.out.println("문자열을 인자로 받는 메서드");
	}

	public void getResult(int n, String s) {
		System.out.println("정수, 문자을 인자로 받는 메서드");
	}

	public void getResult(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}

}
