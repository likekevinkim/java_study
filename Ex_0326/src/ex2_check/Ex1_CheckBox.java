package ex2_check;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_CheckBox {
	static String myGender = "female"; // static으로 받아야 어디에서나 쓸 수 있다.
	//

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 500, 250);
		f.setLayout(null); // 자동배치 끄기

		// 폰트 설정
		Font font = new Font("", Font.BOLD, 30); // 글꼴 ,글자스타일,글짜크기

		Label q1 = new Label("1.취미는 무엇입니까?"); // 텍스트를 보여주는 놈
		q1.setBounds(10, 35, 350, 30);
		// q1.setBackground(Color.yellow);
		q1.setFont(font);

		// 체크박스
		Checkbox news = new Checkbox("뉴스시청");
		news.setBounds(20, 70, 90, 30);

		Checkbox sports = new Checkbox("운동");
		sports.setBounds(110, 70, 50, 30);

		Checkbox movie = new Checkbox("영화");
		movie.setBounds(170, 70, 50, 30);

		Checkbox music = new Checkbox("음악감상");
		music.setBounds(240, 70, 90, 30);

		// 체크박스에 이벤트 감시자 등록
		ItemListener checkListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				// System.out.println(e.getItem().toString());

				switch (e.getItem().toString()) { // 아이템에 부착되어있는 글자로 판단할게

				case "뉴스시청":
					if (e.getStateChange() == 1) {// 1번은 체크가 되었다는 것 2번은 체크해제
						System.out.println("select news");
					} else {
						System.out.println("unselect news");
					}

					break;

				case "운동":
					if (e.getStateChange() == 1) {
						System.out.println("select sports");
					} else {
						System.out.println("unselect sports");
					}
					break;

				case "영화":
					if (e.getStateChange() == 1) {
						System.out.println("select moive");
					} else {
						System.out.println("unselect moive");
					}
					break;

				case "음악감상":
					break;
				}// swtich

			}
		};

		news.addItemListener(checkListener);
		sports.addItemListener(checkListener);
		movie.addItemListener(checkListener);
		music.addItemListener(checkListener);

		Label q2 = new Label("성별은 무엇입니까?");
		q2.setFont(font);
		q2.setBounds(10, 110, 300, 30);

		// 라디오버튼
		CheckboxGroup group = new CheckboxGroup();
		Checkbox female = new Checkbox("female", group, true);
		female.setBounds(20, 150, 50, 30);
		Checkbox male = new Checkbox("male", group, false);
		male.setBounds(100, 150, 50, 30);

		// 라디오버튼에 이벤트 감시자 등록
		ItemListener genderListener = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				myGender = e.getItem().toString();
				System.out.println(myGender);
				// System.out.println(e.getItem().toString());
				// TODO Auto-generated method stub

			}
		};

		female.addItemListener(genderListener);
		male.addItemListener(genderListener);

		// 만들어진 객체들을 프레임에 추가
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		f.add(q2);
		f.add(male);
		f.add(female);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {// 최소화 최대화 감지
			@Override
			public void windowClosing(WindowEvent e) {
				// System.exit(0); //열려있는 모든 프레임을 닫는 메서드
				f.dispose();
			} // 현재 프레임만 단독으로 종료

		});

	}// main
}
