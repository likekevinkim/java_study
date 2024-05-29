package ex4_constructor;

public class PokeMain {
	public static void main(String[] args) {
		
		Poke p1 = new Poke("피카츄", "전기");
	
		System.out.println(p1.getGeneral());
		System.out.println(p1.getName());
		System.out.println(p1.getType());
		
		
		
	}//main
}
