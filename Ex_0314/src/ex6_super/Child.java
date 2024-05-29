package ex6_super;

public class Child extends Parent {

	// super : 부모클래스. 기본적으로 숨어있음. 부모클래스의 이름을 그대로 쓸 순 없음. 메모리 영역에 부모클래스가 먼저 만들어지므로 다른
	// 명령보다 먼저 쓰여져야함
	// super() - 부모클래스의 생성자
	// super.result(); - 부모의 메서드
	// super.age : 부모의 변수
	// 부모클래스에 파라미터값을 넣어야하는 경우 super를 살려서 파라미터로 보냄. 값이 없으면 자식클래스도 오류 발생

	public Child() {
		super(10);
		System.out.println("자식클래스의 생성자");
	}

	@Override
	public void result() {

		super.result();// 부모의 메서드 호출
	}

	public void setAge(int age) {
		super.age = age; // this.age로 하면 자신의 클래스를 먼저 탐색하고 지정한 변수가 없으면 부모클래스로 간다. //super쓰면 바로 부모클래스로 간다.
	}

}
