package ex4_work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FramePopup {

	public FramePopup() {

		Frame f = new Frame("do you want to exit?");

		f.setLayout(null);
		f.setBounds(600, 300, 250, 250);

		Button btnY = new Button("Yes");
		Button btnN = new Button("no");

		btnY.setBounds(10, 50, 70, 50);
		btnN.setBounds(100, 50, 70, 50);

		btnY.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		btnN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});

		f.add(btnY);
		f.add(btnN);

		f.setVisible(true);
	}

}
