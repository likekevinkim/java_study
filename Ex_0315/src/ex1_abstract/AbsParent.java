package ex1_abstract;

public abstract class AbsParent {
	// ↑ 추상메서드를 하나라도 가지고 있는 클래스는 abstract 클래스로 만들어줘야한다.

	int value = 100;
	String str = "";

	public int getValue() {
		return value;
	}

	// 추상메서드 abstract
	// 추상메서드는 body가 없다
	// abstract 키워드를 가지고 있다
	abstract public void setValue(int n);

}
