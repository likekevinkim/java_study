package ex2_person;

public class Person {

	private String school;
	private String name;
	private String phone;
	private int age;

	// Alt + Shift + s 단축키 -> Generate setters and getters

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * 
	 * // 출력만 하게 하려면 ↓ public String getSchool() { return school; }
	 * 
	 * // 입출력 모두 가능하려면 ↓ public String getName() { return name; }
	 * 
	 * public void setName(String n) { name = n; }
	 * 
	 * // 여러개 정보 한번에 입력 //파라미터 변수명을 다른 사람이 알아보기 쉽도록 지정하려면 전역변수명과 지역변수명이 겹칠 수 있음
	 * //그래서 this 사용! this : 현재 클래스 자신 public void setInfo(String name, int age) {
	 * this.name = name;
	 */

}
