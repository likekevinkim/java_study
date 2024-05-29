package ex1_socket;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread {

	ServerSocket ss;

	// 복사된 클라이언트들을 저장할 리스트
	List<CopyClient> list;

	public ChatServer() {
		try {
			list = new ArrayList<CopyClient>();

			ss = new ServerSocket(5000);
			System.out.println("서버시작");

		} catch (Exception e) {
		}
	}

	@Override
	public void run() {

		while (true) {

			try {
				// 접속자 대기
				Socket s = ss.accept();

				// 접속자 ip
				String ip = s.getInetAddress().getHostAddress();

				System.out.println(ip + "님 접속");

				CopyClient cc = new CopyClient(s, this);
				list.add(cc);
				cc.start();

			} catch (Exception e) {
			}

		} // while
	}// run
	
		// 모든 클라이언트들에게 서버의 메세지를 전달
	public void sendMessage(String msg) {
		try {
			// List에 담긴 모든 접속자들(클라이언트)에게 메시지 전달
			for (CopyClient cc : list) {
				cc.out.println(msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}// sendMessage()

	public void removeClient(CopyClient cc) {
		list.remove(cc);
		sendMessage("--" + cc.ip + "님이 퇴장하였습니다.");
	}
}
