package ex3_work;

public class Ex3_mutilFor_star {
	public static void main(String[] args) {
		
		//2중 for문을 가지고 아래의 결과를 완성하시오.
		
		//        *          //414
		//		* * *        //333
		//	  * * * * *      //252
		//  * * * * * * *    //171
		//* * * * * * * * *  //090
	
		for(int i = 5; i >= 1; i--) {
			
			for(int j = 0; j <= 10; j++) {
				if (j >= i && j <= 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
										
			}//inner
			
			System.out.println();
			
		}//outer
		System.out.println("=======================");
		
		//teacher code
		
		for(int i = 0; i < 5; i++) {
			
			for ( int j = 0; j < 5 + i; j++) {
				
				if (i + j  > 3) {
				System.out.print("* ");
				} else {
				System.out.print("  ");
				}
			}//inner
			System.out.println();
		
			
		}//outer
		
				
		System.out.println("=======================");
		
		for(int i = 1; i <= 9; i += 2) {
			
			for(int j = 9; j > i; j -= 2) {
			System.out.print(" ");
			}//inner
			
			for(int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println();
		}//outer
		
		
		System.out.println("=======================");
		
		//거꾸로
		
		for(int i = 0; i <= 5; i++) {
			
			for(int j = 0; j <= 10; j++) {
				if (j >= i && j <= 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
										
			}//inner
			
			System.out.println();
			
		}//outer
		
		System.out.println("===============================");
		
		
		//다이아몬드 모양
		for(int i = 0; i < 5; i++) {
			
			for ( int j = 0; j < 5 + i; j++) {
				
				if (i + j  > 3) {
				System.out.print("* ");
				} else {
				System.out.print("  ");
				}
				

				
			}//inner
			System.out.println();
		}//outer
			
		for(int i = 3; i >= 0; i--) { 
			for (int j = 0; j < 5 + i; j++) {
					
				if (i + j > 3 ) {
					System.out.print("* ");
						
					} else {
					System.out.print("  ");
					}
					
					
				}//inner
			System.out.println();
		}//outer
					
			
		
			

		
		
	}//main
}
