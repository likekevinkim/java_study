package ex6_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;

import javax.swing.JLabel;

public class Ex_Image {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 200, 1280, 1280);
		
		//그림을 프레임 바탕으로
		ImageIcon img = new ImageIcon("lion.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 30, 1280, 1280);
		
		
		 
		
		f.add(j1); //배경을 제일 마지막에 add를 해야 함
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
}
