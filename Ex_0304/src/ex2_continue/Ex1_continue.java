package ex2_continue;

public class Ex1_continue {
	public static void main(String[] args) {

		//continue문 : 반복문 내에서 특정 코드를 건너뛰고자 할 때
		
		for(int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++) {
				if( j % 2 == 0 ) {
					continue; //바로 밑은 어떤 코드도 추가할 수 없음. continue 특징: 1) 가장 가까운 반복문이 for문이라면 아래코드인 System.out.ptint 하지않고 증감식으로 건너뛴다
				}
				
				System.out.print( j + " ");
			}//inner
		
			System.out.println();
			
		}//outer
		
		
		System.out.println("-----------------------------");
		
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j <= 5; ) {
				j++;
				
				if ( j % 2 ==0 ) {
					continue; //continue 특징: 2) 가장 가까운 반복문이 for문이라면 아래코드인 System.out.ptint 하지않고 증감식으로 건너뛰는데, 증감식이 없다면 조건문으로 건너뛴다
				}
				
				System.out.print(j + " ");
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("-----------------------------");

		for (int i = 1; i <= 5; i++) {
			//switch문이 반복문 내부에 있으면 break;대신 continue;를 사용하는 것이 가능하다.
			switch(i) {
			case 2:
				continue; 
			case 4:
				continue;
			
			}//switch
			System.out.println(i);
		}//for
		
		System.out.println("-----------------------------");

		int n = 0;
		
		while(n < 5) {
			n++;
			
			if (n % 2 ==0) {
				continue; //continue 특징: 3) while문 안에서는 증감식이 따로 없어 바로 조건식으로 건너뛴다.
			}
			
			System.out.println(n);
			
		}//while
		
		
		
	}// main
}
