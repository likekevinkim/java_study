package ex5_constructor;

public class PenMain {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.myPen();
		
		Pen p2 = new Pen("gold", 20000); //생성자 오버로드를 통해 따로 입력 가능
		p2.myPen();
		
		
	}//main
}
