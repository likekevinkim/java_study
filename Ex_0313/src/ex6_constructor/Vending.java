package ex6_constructor;

public class Vending {

	private Can[] can = new Can[5];
	private int money;

	// 자판기에 들어갈 음료의 종류를 결정하는 메서드

	public Vending() {//Vending자체를 생성자로 사용하면서 음료정보 초기화가 필요 없음
		// 음료정보, 깜박하면 안되는 정보를 꼭 입력하게 만듬(음료이름, 가격)
		can[0] = new Can("coke", 1000);
		can[1] = new Can("cider", 1100);
		can[2] = new Can("hotsix", 1200);
		can[3] = new Can("coffe", 1300);
		can[4] = new Can("banana", 1400);
	}
	/*
	 * public void init() {
	 * 
	 * for(int i = 0; i < can.length; i++) {
	 *  can[i] = new Can(); //음료정보 초기화 
	 *  }
	 * 
	 * //음료정보 
	 * can[0].setCanName("coke"); 
	 * can[0].setPrice(1000);
	 * 
	 * can[1].setCanName("cider"); 
	 * can[1].setPrice(1100);
	 * 
	 * can[1].setCanName("hotsix"); 
	 * can[1].setPrice(1200);
	 * 
	 * can[3].setCanName("coffee"); 
	 * can[3].setPrice(1300);
	 * 
	 * can[4].setCanName("banana"); 
	 * can[4].setPrice(1400);
	 * 
	 * }//init()
	 */

	// 사용자가 투입한 금액의 범위에 있는 음료의 목록만 보여주는 메서드
	public void showCans(int money) {
		this.money = money; // 자판기안으로 금액 들어옴

		for (int i = 0; i < can.length; i++) {
			if (can[i].getPrice() <= money) {
				System.out.printf("%s - %d원\n", can[i].getCanName(), can[i].getPrice());
			}
		}
	}

	// 선택한 음료를 제공하고 잔액을 돌려주는 메서드
	public void outCan(String name) {

		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(name + "를 선택하셨네요.");
				System.out.println("잔액 : " + (money - can[i].getPrice()));
			}
		}
	}


}
