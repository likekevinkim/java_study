package ex1_class;

public class ComMain {

	public static void main(String[] args) {
		
		Computer com1 = new Computer(); //설계도에서 가져올 수 있음
		com1.getInfo();
		
		System.out.println("----------------------");
		
		Computer com2 = new Computer(); //카피도 한줄로 쉽게 가능
		com2.getInfo();

		
		
		System.out.println("----------------------");
		
		Computer com3 = new Computer();
		com3.getInfo();
		
	}//main
}
