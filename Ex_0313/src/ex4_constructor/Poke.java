package ex4_constructor;

public class Poke {

	// 생성자 : 객체생성시 메모리 할당 및 멤버의 초기화를 위해 사용하는 영역
	// 객체가 생성될때 딱 한번만 호출 할 수 있다
	// 반환형(return)이 없으며 클래스와 반드시 동일한 이름을 가진다

	private String general = "포켓몬 1세대";
	private String name;
	private String type;

	// 생성자 방식: public + 반환형없이 이름 ( 생성할 속성 ){}
	public Poke(String name, String type) {// 생성자
		general = "1세대";
		this.name = name;// name은 main에서 주는 값을 받을께
		this.type = type;// type은 main에서 주는 값을 받을께
		System.out.println("나는 Pok의 생성자야");
	}

	public String getGeneral() {
		return general;
	}

	public void setGeneral(String general) {
		this.general = general;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
