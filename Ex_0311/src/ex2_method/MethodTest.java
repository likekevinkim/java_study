package ex2_method;

public class MethodTest {
	public void test() { // 반환형이 void면 빈손으로 돌아감
		System.out.println("test메서드가 호출됨");
		return; // void 타입의 return은 생략해도 되나 아무것도 쓸 수 없음
	}

	// 반환형이 void가 아닐땐 return값이 필요
	// 반환형이 int 면 return값도 int 형태여야한다.
	// 반환값은 무조건 1개이며, 동시에 여러개의 return을 호출할 수 없다.
	// return을 여러개 호출하거나, 한번에 여러개를 보낼 수 없다.
	public int test2(int n) {
		n += 100;
		System.out.println("n:" + n);
		return n;
	}

	public String getMe(String hobby, String gender) {
		String str = "나는 취미가 " + hobby + "인 " + gender + "야";
		return str;
	}

	public char test3(int a) {
		if (a == 1) {
			return 'A';

		} else if (a == 2) {
			return 'B';
		} else {
			return 'F';
		}
	}
}
