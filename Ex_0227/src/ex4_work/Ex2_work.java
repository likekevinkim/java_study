package ex4_work;

public class Ex2_work {
	public static void main(String[] args) {

		// 아래 세개가 가진 변수를 보고 한줄로 표현 (계산기)
		int su1 = 20;
		int su2 = 5;
		String op = "*";

		switch (op) {
		case "+":
			//System.out.println(su1 + op + su2 + "=" + (su1 + su2));
			System.out.printf("%d + %d = %d\n", su1, su2, su1 + su2);
			break;

		case "-":
			System.out.println(su1 + op + su2 + "=" + (su1 - su2));
			break;

		case "*":
			System.out.println(su1 + op + su2 + "=" + (su1 * su2));
			break;

		case "/":
			System.out.println(su1 + op + su2 + "=" + (su1 / su2));
			break;

		default:
			System.out.println(op + "는 올바른 연산기호가 안닙니다.");
			break;
		}// switch

		// Ctrl+Shift+F //라인정렬
		// 전체 선택 후 Ctrl + i //라인정렬

	}// main
}
