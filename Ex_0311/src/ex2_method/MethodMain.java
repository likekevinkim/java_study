package ex2_method;

public class MethodMain {
	public static void main(String[] args) {

		MethodTest m1 = new MethodTest();
		int su = 100;

		su = m1.test2(su);

		System.out.println("su :" + su);

		System.out.println("------------------");

		String gender = "여자";
		String hobby = "독서";
		String ss = m1.getMe(hobby, gender);
		System.out.println(ss);

		System.out.println("--------------");

		int num = 2;
		char res = m1.test3(num);
		System.out.println(res);

	}// main
}
