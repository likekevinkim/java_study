package ex1_pokemon;

public class PokeMain {
	public static void main(String[] args) {

		Poke p1 = new Poke();
		p1.setName("피카츄");
		p1.setType("전기");
		p1.myPoke();

		Poke p2 = new Poke();
		p2.setName("꼬부기");
		p2.setType("물");
		p2.myPoke();

	}// main
}
