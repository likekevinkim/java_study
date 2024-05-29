package ex1_pokemon;

public class Poke {

	private String name = "";
	private String type = "";

	public String getType() {
		return type;
	}

	public void setType(String t) {
		type = t;
	}

	String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public void myPoke() {
		System.out.println("이름 : " + name);
		System.out.println("타입 : " + type);
		System.out.println("------------------");
	}
}
