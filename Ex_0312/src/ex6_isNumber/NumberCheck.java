package ex6_isNumber;

public class NumberCheck {

	// 메인에서 받아온 문자열이 모두 숫자로만 이루어져 있는지 판단
	public boolean check(String num) {

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);

			if (ch < '0' || ch > '9') {
				return false;
			}

		}

		return true;
	}

}
