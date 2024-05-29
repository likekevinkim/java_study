package ex7_object;

public class ObjMain {

	public static void main(String[] args) {

		// 모든 것을 Object로 만들면 모든 자료형을 받을 수 있어 편하지만 방대한 메모리가 필요해서 비추
		ObjTest ot1 = new ObjTest();
		int num = 100;
		ot1.setValue(num);// 기본자료형 -> 객체 : AutoBoxing 자동 형변환

		// 객체 -> 기본자료형 : Unboxing
		int num2 = (int) ot1.getValue();

		ObjTest ot2 = new ObjTest();
		ot2.setValue("String 문자열");
		String str = (String) ot2.getValue();

	}// main
}
