package ex2_array_work;

public class Ex3_work {
	public static void main(String[] args) {
		
		//배열 arr에 담긴 값 중, 가장 큰 값을 출력
		
		int [] arr = {4, 13, 7, 19, 1, 15};
		int num = arr[0];

		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > num) {
					num = arr[i];
					
				}//if
			
		}//for
		System.out.println(num);
		
		
		//향상된 for
		num = arr[0]; //초기화
		
		for (int a : arr) {
			if (a > num) {
				num = a;
			}
		}
		System.out.println(num);
		
	}//main
}
