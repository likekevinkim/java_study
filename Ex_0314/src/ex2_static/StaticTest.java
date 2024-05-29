package ex2_static;

public class StaticTest {

	int n;
	static int n2;

	public void test() {
		n = 10;
		n2 = 20;
	}
	// static int n3 = 10; // 안됨!!
	// 일반메서드에서는 static 변수를 정의할 수 없다

	public static void test2() {
		int n2 = 10;

		// static메서드에서 일반 변수를 가져오는 것은 불가
		// n = 10;
	}

}
