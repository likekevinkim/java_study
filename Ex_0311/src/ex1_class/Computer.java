package ex1_class;

public class Computer {

	//클래스의 구성요소
	//1) 속성, 변수, 멤버, ... 등 다양한 이름으로 불림
	//2) 메서드, 함수, 기능, ...
	
	
	//Computer를 만들기 위한 설계도
	private String brand = "samsung";
	public int ssd = 256;
	public int ram = 512;
	public float cpu = 2.4f;
	String color = "white";
	
	//컴퓨터의 속성을 출력하기 위한 메서드
	//메서드 : 어떤 작업을 수행하기 위한 명령문들의 집합
	
	//접근제한자 반환형  메서드명(인자, 파라미터) {메서드의 실행 영역} //인자, 파라미터는 매개변수 등으로 불리기도 함
	//public  void getInfo() {}
	public void getInfo( ) {
		System.out.println("brand :" + brand);
		System.out.println("ssd : " + ssd + "GB");
		System.out.println("ram : " + ram + "MB");
		System.out.println("cpu : " + ssd + "GHz");
		System.out.println("color : " + color);
		System.out.println("-------------------------");
		
		
		
	}//getInfo
		
	//접근제한자의 종류
	//1. public : 같은 프로젝트의 모든 클래스에서 사용을 허가
	//2. private : 현재 클래스에서만 사용을 허가 -> private 변수는 어떤 객체에서도 변경할 수 없다
	//3. protected : 상속관계의 클래스에서 사용을 허가
	//4. default : 같은 패키지의 클래스에서 사용을 허가
	
}
