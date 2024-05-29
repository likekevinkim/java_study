package ex2_socket;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String msg = sc.nextLine(); //공백포함 장문 받을 수 있음
		
		if(msg != null && msg.trim().length() > 0) {
			
			Socket s = null;
			
			try {
				
				s = new Socket("192.168.0.11", 5000); //서버접속
				
				//msg를 서버에게 전달하기 위한 스트림
				PrintWriter out = new PrintWriter(s.getOutputStream());
				
				//서버에게 문자열 전달
				out.write(msg);
				
				out.close();
				s.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}//main
}
