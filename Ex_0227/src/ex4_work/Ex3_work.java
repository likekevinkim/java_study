package ex4_work;

public class Ex3_work {
	public static void main(String[] args) {

		// 연도가 4로 나누어 떨어지면 윤년이다.
		// 연수가 100으로 나누어 떨어지면 평년
		// 4년 주기라도 100으로 나누어 떨어지면 평년
		// 100으로 나누어 떨어지더라고 400으로 나누어 떨어지면 윤년

		int year = 2040;
		String res = "";

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			res = "윤년";
		} else {
			res = "평년";
		}
		System.out.println(year + "년은 " + res + "입니다");

	}// main
}
