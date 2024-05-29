package ex6_work;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Ex1_work {
	public static void main(String[] args) {

		// FileInputStream을 통해서 file.txt의 내용을 읽어온다
		// 일어온 내용이 회문인지 판단

		File f = new File("C:/java_kms/file.txt");
		byte[] b_read = new byte[(int) f.length()];

		FileInputStream fis = null;
		BufferedInputStream bis = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(bis);

				bis.read(b_read);

				String res = new String(b_read);
				System.out.println(res);
				// 비교
				for (int i = 0; i < res.length() / 2; i++) {
					if (res.charAt(i) != res.charAt(res.length() - i - 1)) {
						System.out.println("회문이 아닙니다.");
						return;
					}
				} // for
				System.out.println("회문입니다.");

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

		}

	}// main
}
