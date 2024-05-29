package ex3_formatter;

public class Ex1_fommatter {
	public static void main(String[] args) {
		
		//저의 나이는 23 입니다
		int age = 23;
		System.out.println("저의 나이는 " + age + " 입니다");
		System.out.printf("저의 나이는 %d 입니다\n", age); //정수는 %d

		//나는 23세 이고, 형은 25세 입니다.
		System.out.printf("나는 %d세이고, 형은 %d세 입니다.\n", 23, 25);

		
		// 나의 성적은 B입니다.
		char sj = 'B';
		System.out.printf("나의 성적은 %c입니다.\n", sj); //문자는 %c
		
		//참은 true, 거짓은 false다.
		System.out.printf("참은 %b, 거짓은 %b다.\n", true, false); //참/거짓은 %b
		
		//오늘의 기온은 2.15도 입니다
		float temp = 2.15f;
		System.out.printf("오늘의 기온은 %f입니다.\n", temp); //실수는 %f
		System.out.printf("오늘의 기온은 %.1f입니다.\n", temp); //실수는 %f. %.1f => 소수점 뒤에 한자리까지만 보임. 반올림됨
		
		
		//내 이름은 홍길동이야.
		String name = "홍길동";
		System.out.printf("내 이름은 %s야.\n", name); //문장 %s
		
		//2월 01일과 28일 . 1일에 01이라고 표시하고 싶음
		System.out.printf("2월 %02d일과 %d일\n", 1, 28); //0붙여서 2자리로 만들꺼임, ex> %03d=>001
		
		
		//나는 상위 10%야 => %%두개가 % 문자출력
		System.out.printf("나는 상위 %d%%야\n", 10);
		
		//포맷의 종류 포매터의 시작 %
		//%d : 정수. formatter에서는 아스키코드 적용 안됨. 0붙여서 2자리로 만들꺼임 %02d, ex> %03d=>001
		//%c : 문자
		//%b : 논리(boolean)
		//%f : 실수 (float, double). %.1f => 소수점 뒤에 한자리까지만 보임. 반올림됨
		//%s : 문장(String), 어떤 타입의 문자가 들어가도 오류는 나지 않지만...
		//%% : %문자를 출력하기 위한 코드
		
		
		//escape코드 이스케이프코드 시작 \
		//문자열 안에서 특정한 기능을 가능하게 하는 키워드
		// \n : 개행(줄바꿈)
		// \"내용\" : 내용을 ""로 포장. 문장안에 쌍따옴표 넣고 싶을때 => 나는 \"홍길동\"이야.
		// \t : tab키 만큼 간격 확보
		System.out.println("가\t나\t다\tfk");
		System.out.println("홍길동\t김길동");
		
		
		
		
		
		
	}//main
}






























