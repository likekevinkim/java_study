package ex1_objStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ScoreLoader {

	RspInfo info;

	public ScoreLoader(RspInfo info) {
		this.info = info;
		info = new RspInfo();
		load();
	}

	private void load() {

		String path = "C:/java_kms/RspGame/" + info.getId() + "/UserInfo.sav";
		File f = new File(path);

		if (f.exists()) {

			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				info = (RspInfo) ois.readObject();

				System.out.println("로드성공");

			} catch (Exception e) {
				System.out.println("로드실패");
				e.printStackTrace();
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (Exception e2) {
				}
			}

		} else {
			System.out.println("새로운 회원");
		}
	}
}
