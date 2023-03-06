package windows;

import java.awt.BorderLayout;

import javax.swing.JButton;

import base.comp.BaseComboBox;
import base.comp.BaseFrame;
import base.comp.BaseLable;
import base.comp.BasePanel;
import base.comp.ImageLabel;

public class MainFrame extends BaseFrame{

	private BasePanel mainP;
	private BaseLable topP;
	private BasePanel bottomP;
	private BaseComboBox cb;
	private JButton loginB;
	private JButton joinB;
	private JButton bookListB;
	private JButton myPageB;
	private JButton bookReadB;
	private JButton exitB;
	private JButton logoutB;
	private JButton bookMB;
	private JButton addBookMB;
	private JButton rentalMB;

	public MainFrame() {
		super("메인", 1000, 870, null);
	}

	@Override
	public void setComp() {
		// TODO Auto-generated method stub
		topP = new ImageLabel("로그인 후 이용해주세요", "메인1", 1000, 500).
				setTextCenter().
				setSize(35).
				setTextWhite()
				;
		
		mainP = new BasePanel();
		bottomP = new BasePanel();
		
		cb = new BaseComboBox("전체", "문학", "과학");
		
		//defort
		loginB = new JButton("로그인");
		joinB = new JButton("회원가입");
		bookListB = new JButton("도서 목록");
		myPageB = new JButton("마이페이지");
		bookReadB = new JButton("책 읽기");
		exitB = new JButton("종료");
		
		//login
		logoutB = new JButton("로그아웃");
		
		
		//admin
		bookMB = new JButton("도서관리");
		addBookMB = new JButton("도서등록");
		rentalMB = new JButton("대출통계");
	}

	@Override
	public void setDigin() {
		
		mainP.setTitle("인기 도서", 20);
		mainP.addChild();
		
		mainP.top.setFlowLayoutLeft().add(cb);
		
		mainP.bottom.setGridLayout(1, 5, 30, 10);
		
		for (int i = 1; i <= 5; i++) {			
			mainP.bottom.add(
					new ImageLabel("마음의 법칙", "book/" + i, 160, 190).
					setCenter().
					setTextBottomCenter().
					setLine());
			
		}
		
		bottomP.setFlowLayoutCenter();
	
		defort();
		
		super.add(topP, BorderLayout.NORTH);
		super.add(mainP, BorderLayout.CENTER);
		super.add(bottomP, BorderLayout.SOUTH);
	}

	@Override
	public void setEvent() {
		loginB.addActionListener(e -> {
			login();
		});
		logoutB.addActionListener(e -> {
			defort();
		});
		joinB.addActionListener(e -> {
			admin();
		});
	}
	
	private void admin() {
		// TODO Auto-generated method stub
		bottomP.removeAll();
		topP.setText("관리자님 환영합니다");
		
		bottomP.add(logoutB);
		bottomP.add(bookMB);
		bottomP.add(addBookMB);
		bottomP.add(rentalMB);
		bottomP.add(exitB);
		
		super.reFresh();
	}

	private void login() {
		// TODO Auto-generated method stub
		bottomP.removeAll();
		topP.setText("님 환영합니다");
		
		bottomP.add(logoutB);
		bottomP.add(joinB);
		bottomP.add(bookListB);
		bottomP.add(myPageB);
		bottomP.add(bookReadB);
		bottomP.add(exitB);
		
		bookListB.setEnabled(true);
		myPageB.setEnabled(true);
		bookReadB.setEnabled(true);
		
		joinB.setEnabled(false);
		
		super.reFresh();
	}

	private void defort() {
		// TODO Auto-generated method stub
		bottomP.removeAll();
		topP.setText("로그인 후 이용해주세요");

		bottomP.add(loginB);
		bottomP.add(joinB);
		bottomP.add(bookListB);
		bottomP.add(myPageB);
		bottomP.add(bookReadB);
		bottomP.add(exitB);
		
		joinB.setEnabled(true);
		bookListB.setEnabled(false);
		myPageB.setEnabled(false);
		bookReadB.setEnabled(false);
		
		super.reFresh();
	}
	

}
