package ex1_abstract;

public class AbsChild extends AbsParent {

	// 추상클래스를 상속받은 자식클래스는
	// 부모가 가지고 있는 추상메서드를 (사용하지 않더라도)반드시 받아두어야한다
	// 부모인 추상클래스는 자신이 미완성한 기능을 자식이 완성시키도록 조건부 상속하고 있다
	@Override
	public void setValue(int n) {

		System.out.println(n);
	}

}
