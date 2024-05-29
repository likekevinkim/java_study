package ex2_unit;

public class UnitMain {
	public static void main(String[] args) {

		Terran t1 = new Terran("해병", 100, false);
		t1.decEnergy(); // 공격당함
		t1.decEnergy(); // 공격당함

		System.out.println("테란 에너지 : " + t1.getEnergy());

		Zerg z1 = new Zerg("히드라", 200, false);
		z1.decEnergy(); // 공격당함
		System.out.println("히드라 에너지: " + z1.getEnergy());

		Protoss p1 = new Protoss("셔틀", 150, true);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("셔틀 에너지: " + p1.getEnergy());
	}// main
}
