package ex3_overload;

public class Bread {

	public void makeBread() {//메서드 1
		System.out.println("빵을 만들었습니다.");
	}

	public void makeBread(int n) {//메서드 2
		for(int i = 0; i <= n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n", n);
	}
	
	public void makeBread(int n, String s) {//메서드 3
		for(int i = 0; i <= n; i++) {
			System.out.printf("%s빵을 만들었습니다.\n", s);
		}
		System.out.printf("요청하신 %d개의 %s빵을 만들었습니다.\n",n,s);
	}
	
}
