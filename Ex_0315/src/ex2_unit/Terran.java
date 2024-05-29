package ex2_unit;

public class Terran extends Unit {

	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;

	}

	@Override
	public void decEnergy() { // 남은 에너지
		energy -= 3; // 공격받으면 깎이는 에너지
	}

}
