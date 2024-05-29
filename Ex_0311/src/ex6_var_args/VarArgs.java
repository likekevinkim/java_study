package ex6_var_args;

public class VarArgs {

	// ...<- variable arguments(가변인자)
	// 같은 타입의 파라미터를 갯수 제한없이
	// 배열 구조로 받을 수 있도록 하는 개념
	public String[] setData(String... name) {

		String[] str = new String[2];
		
		for ( int i = 0; i < name.length; i++ ) {
			System.out.print(name[i] + " ");
			str[i] = name[i];
		}//for
		
		return str;
	}

}
