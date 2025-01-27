package ex7_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex4_BufReaderWork {
	public static void main(String[] args) {

		// test.txt에 여러라인의 텍스트를 넣어놀고
		// 사용자가 입력받은 검색어를 포함하고 있는 첫번째 라인을 찾자

		Scanner sc = new Scanner(System.in);
		File f = new File("C:/java_kms/test.txt");
		FileReader fr = null;
		BufferedReader br = null;

		System.out.print("검색 : ");
		String search = sc.next();

		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			String line = "";
			while ((line = br.readLine()) != null) {

				// 현재 가져온 라인에 검색어가 포함되어 있는지 확인
				if (line.contains(search)) {
					System.out.println("결과 : " + line);
					return;

				}
			} // while
			System.out.println("해당단어는 찾을 수 없습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}// main
}
