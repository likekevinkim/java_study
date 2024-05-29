package ex2_array_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		//배열 arr에 담긴 모든 값의 합을 출력
		
		int[] arr = {15, 22, 17, 40 ,51};
		int sum = 0;
		
		//기존 for문으로
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		//향상된 for문으로

		sum = 0; //sum값 초기화 시키고
		
		//시작!
		for (int s : arr) {
			sum += s;
		}
		System.out.println(sum);
	}//main
}
