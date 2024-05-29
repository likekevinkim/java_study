package ex5_method_param;

public class ParamMain {

	public static void main(String[] args) {

		ParamTest pt = new ParamTest();
		int num = 10;
		pt.setArr(num);
		System.out.println("num : " + num);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		pt.realArr(arr);

		System.out.print("메인에서 출력한 arr : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}// main

}
