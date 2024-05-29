package ex1_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/java_kms";
		
		File f = new File(path);
		
		if(f.isDirectory()) {//!f.isFile도 가능
		
			// 접근하는 마지막 단계가 폴더라면, 폴더내부의 하위 요소들의 이름을 모두 가져온다
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
	}//main
}
