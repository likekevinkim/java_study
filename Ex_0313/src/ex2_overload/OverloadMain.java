package ex2_overload;

public class OverloadMain {
	public static void main(String[] args) {

		OverloadTest ot = new OverloadTest();
		ot.getResult();
		ot.getResult(10);
		ot.getResult('A');
		ot.getResult("ABC");
		ot.getResult(10, "ABC");
		ot.getResult("ABC", 10);

	}// main

}
