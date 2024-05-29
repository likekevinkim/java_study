package ex5_override;

public class CalMain {
	public static void main(String[] args) {

		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();

		cp.getResult(10, 5); // 15
		cm.getResult(10, 5); // 5

	}// main
}
