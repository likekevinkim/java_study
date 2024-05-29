package ex4_interface;

public class Kitchen implements MenuAll {
//public class Kitchen implements Menu1, Menu2, Menu3 {
//interface는 구현 능력을 가지고 있지않으므로, 일반 상속과는 다르게 다중 구현이 가능하다

	@Override
	public String jjajang() {
		return "중면 + 춘장소스";
	}

	@Override
	public String jjambbong() {
		return "홍합 + 오징어";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기";
	}

	@Override
	public String boggeumbab() {
		return "이천쌀";
	}

	@Override
	public String mandu() {
		return "다진고기";
	}

}
