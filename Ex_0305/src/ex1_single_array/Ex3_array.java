package ex1_single_array;

public class Ex3_array {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';		
		//ch[4] = '!';		
		
		char[] chArr = {'J','A','V','A'};
		
		// 일반 for문은 특정값만 출력하거나 전체값을 출력하거나 하는 것이 가능
		for (int i = 0; i < chArr.length; i++) {
			System.out.print(chArr[i]);
		}
		
		System.out.println();
		
		// 개선된 for문(향상된 루프...) 특정배열의 모든 값을 출력
		for(char c : chArr) {
			System.out.print(c);
		}
		
	}//main
}
