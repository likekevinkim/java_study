package ex1_while;

import java.util.Random;

public class Ex3_do_while {
	public static void main(String[] args) {

		// do-while문 : 선처리, 후비교

		/* do {
		 조건식이 참일때 실행되는 영역 
		 }while(조건식); */

		int i = 5;
		do {
			
			System.out.println(i);
			i++;
			
		} while (i <= 10);

		
		System.out.println("------------------------");
		
		//int a = new Random().nextInt(5 - 0 + 1) + 0;  //Random 코드 0~5까지 숫자 중 하나, 시작수는 0
		
		/* 예제) java, jsp, html의 시험을 봤다.
		   각 과목별 점수는 랜덤으로 0 ~ 130까지의 값이 대입
		   
		   각 과목의 점수를 검사하는데, 100점이 넘어 결과가 나오지 않을때까지 반복문을 수행하고
		   
		   최종적으로 세 과목이 모두 100이하가 되었을 때 과목별 점수를 출력
		
		 예시 결과
		 java : 100
		 jsp : 82
		 html : 90
		 */
		
		int java = 0;
		int jsp = 0;
		int html = 0;
		
		
		do {
			
			java = new Random().nextInt(130 - 0 + 1) + 0; //Random ->  new Random().nextInt(난수의 범위) + 시작수;
			jsp = new Random().nextInt(130 - 0 + 1) + 0;
			html = new Random().nextInt(130 - 0 + 1) + 0;
			
									
		} while (java > 100 || jsp > 100 || html > 100);
		
		System.out.println("java " + java);
		System.out.println("jsp " + jsp);
		System.out.println("html " + html);
		
		System.out.println("====================================");
		
//예제의 경우 while 문으로 하면, 난수를 따로 정의하고 밑에 해야함 (코드 길어짐)
		
		int java1 = new Random().nextInt(130 - 0 + 1) + 0;
		int jsp1 = new Random().nextInt(130 - 0 + 1) + 0;
		int html1 = new Random().nextInt(130 - 0 + 1) + 0;
		
		
		while (java1 > 100 || jsp1 > 100 || html1 > 100) {
			
			java1 = new Random().nextInt(130 - 0 + 1) + 0;
			jsp1 = new Random().nextInt(130 - 0 + 1) + 0;
			html1 = new Random().nextInt(130 - 0 + 1) + 0;
			
		}
		
		System.out.println("java1 " + java);
		System.out.println("jsp1 " + jsp);
		System.out.println("html1 " + html);
		

		
		
	}// main
}
