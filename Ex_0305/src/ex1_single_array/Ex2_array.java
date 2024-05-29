package ex1_single_array;

public class Ex2_array {
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 7;
		arr[1] = 15;
		arr[2] = 30;
		
		//배열의 선언 생성 초기화를 한번에
		int[] arr2 = {7, 15, 30};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}//main
}
