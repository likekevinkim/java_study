package ex3_overload;

public class BreadMain {

	public static void main(String[] args) {
		
	/*
	 * 빵을 만들었습니다 <-- 메서드 1 호출
	 * ------------
	 * 빵을 만들었습니다
	 * 빵을 만들었습니다
	 * 요청하신 2개의 빵을 만들었습니다. <-- 메서드 2 호출
	 * ------------
	 * 크림빵을 만들었습니다
	 * 크림빵을 만들었습니다
	 * 요청하신 2개의 크림빵을 만들었습니다. <메서드 3 호출
	 */
	
	Bread b = new Bread();
	b.makeBread();
	b.makeBread(2);
	b.makeBread(2,"크림");
	
	}
}
