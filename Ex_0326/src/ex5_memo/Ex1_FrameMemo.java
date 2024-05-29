package ex5_memo;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Ex1_FrameMemo {
	public static void main(String[] args) {

		Frame frame = new Frame();
		frame.setBounds(500, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		frame.setLayout(null); // 자동배치 끄기 - 프레임안 배치

		// TODO : 최상단 컴포넌트
		TextField tf = new TextField(10);
		tf.setBounds(10, 35, 150, 20);

		Button btn = new Button("입력");
		btn.setBounds(165, 35, 75, 20);
		btn.setEnabled(false);// 버튼 비활성화
		///////////////

		// TODO : 중앙 컴포넌트
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 290);
		ta.setEditable(false);// 읽기전용으로 만들기
		///////////////

		// TODO : 최하단 컴포넌트
		Button btnSave = new Button("저장");
		btnSave.setBounds(10, 355, 110, 30);

		Button btnClose = new Button("닫기");
		btnClose.setBounds(130, 355, 110, 30);
		//////////////

		// 프레임에 자식 컴포넌트들 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);

		// tf에 값이 들어간 경우에만 입력버튼 활성화
		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				if (tf.getText().equals("")) {
					btn.setEnabled(false);
				} else {
					btn.setEnabled(true);
				}
			}
		});

		// 입력버튼 클릭시 ta에 내용을 추가
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n"); // append - 값이 누적되서 저장

				tf.setText("");// 텍스트 필드 비우기
				tf.requestFocus();// 커서를 tf로 이동
			}
		});

		// 엔터를 치면 tf의 값이 ta로 전달되도록 처리
		tf.addKeyListener(new KeyListener() { // addKeyListner 키보드의 입력시 인지하는 코드

			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					ta.append(tf.getText() + "\n"); // append - 값이 누적되서 저장

					tf.setText("");// 텍스트 필드 비우기
					tf.requestFocus();// 커서를 tf로 이동
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		//닫기버튼
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//frame.dispose();
				System.exit(0);
			}
		});
		
		//저장버튼
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();
				
				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE);
					
					fd.setVisible(true);
					
					String path = fd.getDirectory() + fd.getFile();
					//System.out.println(path);
					
					if(!message.equals("")) {
						fw = new FileWriter(path);
						bw = new BufferedWriter(fw);
						
						bw.write(message);
						bw.flush();
					}else {
						JOptionPane.showMessageDialog(frame, "저장할 내용이 없습니다");//(부모프레임, 내용)
					}
					
				} catch (Exception e2) {
				}finally {
					try {
						bw.close();
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		frame.setVisible(true);
		frame.setResizable(false); // 화면크기 변경 여부

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// main
}
