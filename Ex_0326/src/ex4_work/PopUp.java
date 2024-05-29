package ex4_work;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopUp {
	public static void main(String[] args) {

		Frame f = new Frame("do you want to exit?");
		f.setBounds(500, 200, 400, 400);
		f.setLayout(null);

		Frame f2 = new Frame();
		f2.setBounds(500, 200, 400, 600);
		f2.setLayout(null);

		Label q1 = new Label("종료하시겠습니까?");
		q1.setBounds(10, 35, 350, 30);

		Button yes = new Button("예");
		yes.setBounds(20, 150, 100, 90);

		Button no = new Button("아니오");
		no.setBounds(250, 150, 100, 90);

		yes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// TODO Auto-generated method stub

			}
		});
		no.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				// 버튼에 부착된 텍스트를 가져온다
				// TODO Auto-generated method stub

			}
		});

		f.add(q1);
		f.add(yes);
		f.add(no);

		f2.setVisible(true);

		f2.addWindowListener(new WindowAdapter() {// 최소화 최대화 감지
			@Override
			public void windowClosing(WindowEvent e) {
				// System.exit(0); //열려있는 모든 프레임을 닫는 메서드
				// f.dispose();} //현재 프레임만 단독으로 종료
				// new FramePopup();
				f.setVisible(true);
			}

		});

	}// main
}
