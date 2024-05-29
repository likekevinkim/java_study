package ex7_object;

public class ObjTest {

	private Object value;
	
	public void setTest(int n) {
		System.out.println("int : " + n);
	}
	
	public void setTest(String s) {
		System.out.println("String : " + s);
	}
	
	public void setValue(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}
}
