package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {

	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		// f.setTitle("버튼 테스트"); 제목을 변경하는 메서드

		f.setBounds(500, 200, 400, 400);

		f.setLayout(null); // 자동배치를 끈다-> 버튼들의 위치와 크기값을 지정해야한다.

		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");

		btn1.setBounds(50, 30, 140, 100); // 버튼들에게 크기와 위치를 설정하는 방법// (가로, 세로 , 너비,높이)
		btn2.setBounds(200, 30, 140, 100);
		btn3.setBounds(50, 150, 140, 100);
		btn4.setBounds(200, 150, 140, 100);

		// 만들어둔 프레임에 버튼객체를 추가
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);

		// 각 버튼별 이벤트 감시자 등록
		btn1.addActionListener(new ActionListener() {
			// 액션 리스너 -> 액션퍼폼드 하고싶은거 입력
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("I PUSH THE BUTTON NO.1");
				// TODO Auto-generated method stub

			}
		}); // 버튼 클릭하면 하고 싶은일

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
				// 버튼에 부착된 텍스트를 가져온다
				// TODO Auto-generated method stub

			}
		});

		f.addWindowListener(new WindowAdapter() {// 최소화 최대화 감지
			@Override
			public void windowClosing(WindowEvent e) {
				// System.exit(0); //열려있는 모든 프레임을 닫는 메서드
				f.dispose();
			} // 현재 프레임만 단독으로 종료

		});

		// 버튼 3,4에 대한 이벤트 감시자
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // 3,4가 act를 공통적으로 가지고있지만 실행하면 다른 결과를 얻을 수 있다.

				switch (e.getActionCommand()) {
				case "버튼3":
					System.out.println(e.getID());
					System.out.println("버튼3번 클릭됨");
					break;

				case "버튼4":
					System.out.println(e.getID());
					System.out.println("button 4 click");
					break;
				}// switch

				// TODO Auto-generated method stub

			}
		};
		btn3.addActionListener(act);
		btn4.addActionListener(act);

		f.setVisible(true); // setVisible은 웬만하면 마지막에 있는게 좋다
	}// main
}
