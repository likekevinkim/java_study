package ex3_control_statement;

public class Ex3_switch_case {
	public static void main(String[] args) {
		
		String lastName = "경주김씨";
		
		switch( lastName ) {
		
		case "김해김씨" :
			System.out.println("412만명");
			break;
		
		case "경주김씨" :
			System.out.println("173만명");
			break;	
			
		case "광산김씨" :
			System.out.println("483만명");
			break;
			
		default :
			System.out.println("죄송합니다. 데이터가 없습니다.");
			break;
		}//switch
		
		
	}//main
}
