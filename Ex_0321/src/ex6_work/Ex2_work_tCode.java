package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex2_work_tCode {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		File f = new File("C:/java_kms/work1.txt");
		byte[] b_read = new byte[(int) f.length()];

		String content = ""; // 원본을 담을 변수

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(bis);
			bis.read(b_read);

			content = new String(b_read);

			System.out.println("입력 : ");
			String input = sc.next();

//			int leng = 0;
//			int count = 0;
//			while(leng + input.length() <= content.length()) {
//				if(input.equals(content.substring(leng,leng+input.length()))) {
//					count++;
//				}
//				leng++;
//			}//while
//			System.out.println(input + "횟수" + count);

			int count = 0;
			int idx = content.indexOf(input);

			while (idx != -1) {
				count++;
				idx = content.indexOf(input, idx + 1);
			}
			System.out.println(input + "횟수" + count);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}// main
}
