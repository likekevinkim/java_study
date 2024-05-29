package ex8_work;

public class Palindrome {

	public void palindrome(String in) {

		for (int i = 0; i < in.length()/2; i++) {

			if (in.charAt(i) != in.charAt(in.length() - i - 1)) {
				System.out.println("회문이 아닙니다.");
				return;

			}
		} // for
		System.out.println("회문입니다.");

	}

}

//t_code

/*//글을 뒤집는다.
String rev = "";
for( int i = in.length()-1; i >= 0; i-- ) {
	rev += in.charAt(i);
}
return rev;
*/ //출력은 메인에서