package ex1_socket;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable {

	TextArea area; // 메세지 출력 영역
	TextField input; // 채팅 입력위한 객체
	Button send_bt; // 메세지 전송버튼

	// 서버접속에 필요한 객체들
	Socket s;
	PrintWriter out;
	BufferedReader in;
	Thread t;

	public ChatClient() {

		setBounds(500, 100, 300, 500);
		setLayout(null);

		area = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		area.setBounds(10, 30, 280, 400);

		input = new TextField();
		input.setBounds(10, 440, 200, 30);

		send_bt = new Button("전송");
		send_bt.setBounds(210, 440, 80, 30);
		send_bt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					//이거 마무리해보자
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

		this.add(area);
		this.add(input);
		this.add(send_bt);

		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				// 종료하기 전에 모든 클라이언트에게 종료메시지를 보낸다
				out.println("xx:~X");
			}
		});
		// 메세지 전송 버튼
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendData();
			}
		});
		// 서버접속
		connected();

		// 서버로부터 전달되는 메시지를 받기위한 스레드 생성
		t = new Thread(this);
		t.start();

	}// 생성자

	// 서버접속 메서드
	private void connected() {
		try {
			s = new Socket("192.168.0.11", 4000);
			// 타 클라이언트의 메시지를 읽을 클래스
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			// 메세지를 보내는 클래스
			out = new PrintWriter(s.getOutputStream(), true);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {

		// 서버로부터 전달되는 메세지를 기다렸다가 메세지가 도착하면 화면에 출력
		while (true) {

			try {
				String msg = in.readLine();

				if (msg.equals("xx:~X")) {
					break;
				}
				if (msg != null) {
					area.append(msg + "\n");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		} // while
		closed();// 클라이언트가 접속을 해제하면 열려있는 모든 스트림을 해제
		System.exit(0); // 현재 클라이언트 종료

	}// run()

	// 서버에게 메세지를 전달하는 메서드
	private void sendData() {
		String msg = input.getText();
		if (msg.length() > 0) {
			out.println(msg);// 메세지 전달
		}
		input.setText("");
	}

	private void closed() {
		try {
			out.close();
			in.close();
			s.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
