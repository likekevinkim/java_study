package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_ChoiceMain {

	static String res = "서울";

	public static void main(String[] args) {

		Frame f = new Frame();

		f.setBounds(400, 200, 500, 250);
		f.setLayout(null);

		Choice region = new Choice();
		region.add("서울");
		region.add("대전");
		region.add("인천");
		region.add("광주");
		region.add("대구");
		region.add("제주");

		region.setBounds(50, 100, 100, 0);

		// 결과를 보여줄 Label
		Label label = new Label();
		label.setText(res);
		Font labelFont = new Font("", Font.BOLD, 30);
		label.setFont(labelFont);

		label.setBounds(200, 100, 100, 100);

		// region에 감지자 추가
		region.addItemListener(new ChoiceListener(label)); // 이벤트를 요청했을때 초이스리스너 오버라이드 호출

		f.add(region);
		f.add(label);

		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {// 최소화 최대화 감지
			@Override
			public void windowClosing(WindowEvent e) {
				// System.exit(0); //열려있는 모든 프레임을 닫는 메서드
				f.dispose();
			} // 현재 프레임만 단독으로 종료

		});

	}

}
