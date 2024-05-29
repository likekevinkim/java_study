package ex2_control_statement;

public class Ex3_else_if {
	public static void main(String[] args) {
		
		//else-if : 여러개의 조건 비교가 필요할 때 사용
		int num = 75;
		String res ="";
		
		if ( num >= 90 ) {
			res = "A";
		}else if( num >= 80 ){
			res = "B";
		}else if( num >= 70) {
			res = "C";
		}else if( num >= 60) {
			res = "D";
		}else {
			res = "F";
			
		}
		
		System.out.println(res);
	
		
	}//main
}
