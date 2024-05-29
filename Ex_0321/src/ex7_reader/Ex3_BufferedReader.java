package ex7_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex3_BufferedReader {
	public static void main(String[] args) {
		
		File f = new File("C:/java_kms/file.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String msg = "";
			
			while((msg = br.readLine()) != null){ //문장단위로 가져올때 값이 없으면 null, 참고로 한글자씩 가지고 올때는 -1
				System.out.println(msg);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//main
}
