package ex2_string_method;

public class Ex4_work {
	public static void main(String[] args) {

		// 변수 question에 O, X 값을 집어 넣는다.
		// OOXXO 라면 1 + 2 + 0 + 0 + 1의 결과인 4
		// OXXOOXOOO 라면 1+0+0+1+2+0+1+2+3의 결과인 10

		String question = "OOXXOOXO";

		int oPlus = 0;
		int sum = 0;
		for (int i = 0; i < question.length(); i++) {
			if (question.charAt(i) == 'O') {
				oPlus++;
				sum += oPlus;
			} else {
				oPlus = 0;
				continue;
			}
		}

		System.out.println(sum);

	}// main
}
