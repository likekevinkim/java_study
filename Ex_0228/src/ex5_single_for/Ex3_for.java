package ex5_single_for;

public class Ex3_for {
	public static void main(String[] args) {
		
		//1부터 10까지의 숫자중에서 홀수의 합을 계산하여 출력
		//결과 : 25
		
		int sum = 0;
		for(int i = 1; i <= 10; i += 2) {
			sum += i;
			}
		System.out.println(sum);
		
		
		System.out.println("-----------------------------------");

		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}//main

}
