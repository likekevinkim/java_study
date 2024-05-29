package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_work_tCode {
	public static void main(String[] args) {

		File f = new File("C:/java_kms/file.txt");
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		String ori = "";
		String rev = "";
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(bis);
			
			bis.read(b_read);
			
			//읽어온 문장
			ori = new String(b_read).trim();
			

			
			
			// 비교
			
			for (int i = ori.length()-1; i >=0; i--) {
				
			}
				
			if ( ori.equals(rev)) {
				System.out.println("회문");
				}else {
					System.out.println("회문 아님");

				}
		} catch (Exception e) {
		} finally {
			try {
				if (bis != null) {

					bis.close();
				}
				if (fis != null) {

					fis.close();
				}

			} catch (Exception e) {
			}
	
		}
}// main
}
