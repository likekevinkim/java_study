package ex1_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		//File 클래스는 폴더를 만들 수 있다 (파일은 안됨)
		//abc폴더 만들기
		String path = "C:/java_kms/abc";
		File f = new File(path);

		if (!f.exists()) {
			// f가 가진 path 경로가 실제로 존재한다면 true
			f.mkdirs(); //make directory, //폴더를 2개 이상 일때는 복수형을 써야하지만 그냥 복수형으로 다쓰면 됨

			
		}else {
			System.out.println("폴더가 존재함");
			
			//path경로의 폴더나 파일 삭제
			//f.delete();
			
		}
	}// main

}
