package ex4_calculator;

public class Cal {

	public int getResult(int su1, int su2, String op) {

		switch (op) {
		case "+":
			return su1 + su2;
		case "-":
			return su1 - su2;
		case "*":
			return su1 * su2;
		case "/":
			return su1 / su2;

		}
		return -1;

	}

}
