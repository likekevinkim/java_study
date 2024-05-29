package ex4_override;

public class Snake extends Animal {

	String sensor = "밤에도 잘봄";

	public int getSnakeLeg() {
		return 0;
	}

	// 오버라이드 : 메서드를 재 정의하여
	// 부모의 메서드를 가져와 자식사정에 맞게 내용만 재정의 하는 것.
	@Override
	public int getLeg() {

		return 0;
	}

}
