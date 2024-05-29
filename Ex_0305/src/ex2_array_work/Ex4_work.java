package ex2_array_work;

public class Ex4_work {
	public static void main(String[] args) {
		
		//배열 arr이 가진 내용 들을 오름차순으로 정렬하여 출력
		int [] arr = {4, 13, 7, 19, 1, 15};
		
		
		for (int i = 0; i < arr.length; i++) {
						
			for (int j = i; j < arr.length; j++) { 
			
				if (arr[i] > arr[j]) {
				
				int num3 = arr[i];
				arr[i] = arr[j];
				arr[j] = num3;
				
				}//if
				
			}//for1

			System.out.print(arr[i] + " ");
				
			}//for2

		
		System.out.println();
		System.out.println("--------------");
		
		//teacher code
		
		for(int i = 0; i < arr.length; i++) {
	
			for(int j = i; j < arr.length; j++) {
				
				if( arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}//if
				
			}//inner

		}//outer
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}//main
}
