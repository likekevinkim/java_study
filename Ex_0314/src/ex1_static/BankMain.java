package ex1_static;

public class BankMain {
	public static void main(String[] args) {

		Bank b1 = new Bank("홍대", "02-1111-1111");
		Bank b2 = new Bank("이대", "02-2222-2222");
		Bank b3 = new Bank("서강대", "02-3333-3333");

		// static으로 생성된 변수는 객체를 생성하지 않아도, 클래스명으로 단독 호출이 가능
		Bank.interest = 0.1f;

		b1.getBank();
		b2.getBank();
		b3.getBank();

	}// main
}
