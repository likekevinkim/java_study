package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {

		// work1.txt를 만들고 내용을 넣은 후, 키보드에서 입력받은 문장의 출현빈도를 출력하시오

		Scanner sc = new Scanner(System.in);

		File f = new File("C:/java_kms/work1.txt");
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		int cnt = 0;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(bis);
				bis.read(b_read);

				String res = new String(b_read);
				System.out.println(res);

				System.out.print("입력 : ");
				String in = sc.next();

				for (int i = 0; i < res.length() - (in.length() - 1); i++) {
					if (in.equals(res.substring(i, in.length() + i))) {
						cnt++;
					}
				}
				System.out.println("출현횟수는 " + cnt);

			} catch (Exception e) {
				System.out.println("에러");
				e.printStackTrace();
				// TODO: handle exception
			} finally {
				try {
					if (bis != null) {
						bis.close();
					}
					if (fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}

		}

	}// main
}
