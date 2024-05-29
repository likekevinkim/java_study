package ex3_interface;

public class InterChild implements InterParent {
//interface는 extends로 상속받지 못하고 implements로 '구현'

	@Override
	public int getA() {
		return 10;
	}

}
