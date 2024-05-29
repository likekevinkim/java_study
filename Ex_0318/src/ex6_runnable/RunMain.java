package ex6_runnable;

public class RunMain {
	public static void main(String[] args) {

		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt); //어떤 클래스가 이미 상속(extends) 되어 있을때 runnable을 이용하여(implements) 스레드 사용 가능. 어떤것을 run 시킬지 rt자리에 씀
		t1.start();
		
		System.out.println("메인종료");

	}// main
}
