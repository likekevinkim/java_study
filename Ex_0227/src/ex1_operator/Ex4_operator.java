package ex1_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		char res = ++a >= b || 2 + (b - 5) <= b && a + 2 - b >= 0 && (a += b) - (a % b) > 10 ? 'O' : 'X';
		          //11 >= 12 || 9 <= 12  (true) && 1 >= 0 (true)  &&    23    -    11  > 10
		System.out.println(res);
		System.out.println("---------------------");
		
		/* 연습문제
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데
		 하루생산량은 5, 7, 5개
		 
		 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2) 시간당 전체 과일의 평균 생산 갯수를 출력
		  * 단, 평균값을 담을 변수는 float로 생성할 것
		 */
		
		int pear = 5; //처음부터 자료형을 int 말고 float로 해도 됨 (비추)
		int apple = 7;
		int orange = 5;
		int dailyTotal = pear + apple + orange; //dailyTotal을 float 자료형 형태로 받아도 됨
		System.out.println("일 전체 생산 갯수 : " + dailyTotal);
		
		float dailyAvgPerHour = (float)dailyTotal / 24; //이렇게 예외적 캐스팅해도 되고, 24를 24f 타입으로 바꿔도 됨
		System.out.println("일 평균 생산 갯수 : " + dailyAvgPerHour);

		
		
	}//main
}

























