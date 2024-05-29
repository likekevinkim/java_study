package ex1_exception;

public class Ex1_try_catch {
	public static void main(String[] args) {

		// try-catch(예외처리)
		// 자바에서 프로그램이 실행되는 도중 예외(오류, 에러, 버그...)가 발생하면
		// 그 시점에서 강제적으로 종료된다. 이것은 올바른 판단이지만, 때로는 예상할 수 있는
		// 예외에 대해 프로그램을 종료하지 않고 이후의 작업을 이어 나가야 할때가 있다.
		// 예외 처리를 통해 프로그램의 비정상적인 종료를 줄일 수 있다.

		int result = 0;
		int[] arr = new int[2];

		// try는 하나밖에 만들지 못함
		// try 영역 밖에서 오류가 나면 코드 자체가 실행이 안됨
		try { 
			int n = 2; // try 영역에서 만든 변수는 지역 변수로서 catch에서도 사용 불가

			result = 10 / n; // try에서 오류가 나면 오류가 난 시점에서 아래 내용을 실행하지 않고 바로 catch로 빠져 나간다

			arr[1] = 100; // try영역에서는 최초 오류만 확인 가능하고 그 다음 생긴 오류에 대해서는 위 오류를 수정할때까지 확인 할 수 없다.
			System.out.println("안녕");

			// catch를 여러개 만들어 각 오류에 대해 대응할 수 있다.
			// 이때는 Exception의 명칭을 정확히 해주는 것이 좋다
		} catch (ArithmeticException e) { // try에서 오류가 나면 실행 되는 영역으로 오류가 없을 경우 실행된지 않는다
			// n = 10;
			System.out.println("0으로 나눌 수 없어요");
			// e.printStackTrace(); //오류의 문제 파악 (개발자 측면)

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 index로 접근함");

		} finally {
			//예외 발생 여부와 관계 없이 반드시 실행되는 영역
			System.out.println("finally");
		}

		System.out.println(result);

	}// main
}
