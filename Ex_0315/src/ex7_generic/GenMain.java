package ex7_generic;

public class GenMain {
	public static void main(String[] args) {
		// <>의 제네릭 타입으로는 반드시 클래스가 들어와야한다
		// <>을 String클래스로 만들어서 원래만들었던 T는 String타입으로 바꼈음
		GenTest<String> g1 = new GenTest<String>();
		g1.setValue("Hi");
		String s = g1.getValue();
		System.out.println(s);

		GenTest<Integer> g2 = new GenTest<Integer>();
		g2.setValue(10);
		int num = g2.getValue();
		System.out.println(num);

	}// main
}
