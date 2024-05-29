package ex4_work;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 300, 300);

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {// 최소화 최대화 감지
			@Override
			public void windowClosing(WindowEvent e) {
				// System.exit(0); //열려있는 모든 프레임을 닫는 메서드
				// f.dispose(); //현재 프레임만 단독으로 종료
				new FramePopup(); // 새로운 화면을 띄우겠다 }
			}
		});
	}// main
}
