package ex1_abstract;

public class AbsMain {
	public static void main(String[] args) {

		AbsChild c = new AbsChild();
		c.setValue(10);

		// 추상클래스는 인스턴스를 직접 가질 수 없다
		// 즉, 객체화 시킬 수 없다;
		AbsParent p = new AbsParent() {

			@Override
			public void setValue(int n) {

			}
		};

	}// main
}
