package ex3_inheritance;

public class InheriMain {

	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println(c1.money);
		// System.out.println(c1.money1);
		// private를 선언하면 상속되지 않는다.
		System.out.println(c1.str);

		Parent p1 = new Parent();
		// 상속관계라고 할지라도 부모 클래스는 자식의 속성으로 접근할 수 없다
		// System.out.println(p1.car);

		// 왼쪽의 객체와 오른쪽의 클래스의 인스턴스(c1이 Parent의 자식인가?)가 같다면 true를 반환
		if (c1 instanceof Parent) {
			System.out.println("c1은 Parent의 자식");
		}
		
		//Object는 JAVA의 최상위 클래스로서 모든 객체와 인스턴스가 같다. 
		if (p1 instanceof Object) {
			System.out.println("p1은 Object의 자식");
		}

	}// main

}
