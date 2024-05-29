package ex4_interface;

public interface MenuAll extends Menu1, Menu2, Menu3 {
// interface만이 유일하게 interface끼리 extends로 다중 상속가능하다	
	public String mandu();

}
