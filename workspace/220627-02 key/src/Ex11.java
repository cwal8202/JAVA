import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Ex11 extends JFrame {
	private String iD;
	private String pW;
	private boolean idCheck;
	private boolean pwCheck;
	
	public Ex11() {
		HashMap map = new HashMap();
		
		JPanel pnl = new JPanel();
		JTextField registrateId = new JTextField("아이디 등록하세요");
		JPasswordField registratePw = new JPasswordField(10);
		JPasswordField checkRegistratePw = new JPasswordField(10);
	//	JButton checkId = new JButton("아이디 중복확인");
		JButton join = new JButton("가입");
		
		
		registrateId.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e) {
				if (registrateId.getText().equals("아이디 등록하세요")) {
					registrateId.setText("");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (registrateId.getText().equals("")) {
					registrateId.setText("아이디 등록하세요");
				}
				if (registrateId.getText().length() >= 4 && registrateId.getText().length() <= 10) {
					System.out.println("아이디 등록");
					idCheck = true;
				} else {
					System.out.println("4자 이상 10자 이하로 입력하세요");
				}
			}
		});
		
		
		registratePw.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (registratePw.getText().length() >= 4 && registratePw.getText().length() <= 10) {
					System.out.println("비밀번호 확인란에 똑같이 입력해주세요.");
					} else {
						System.out.println("4자 이상 10자 이하로 입력하세요");
					}
			}
		});
		
		checkRegistratePw.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (registratePw.getText().equals(checkRegistratePw.getText())) {
					System.out.println("비밀번호 일치");
					pwCheck = true;
				} else {
					System.out.println("비밀번호 일치하지 않습니다.");
				}
			}
		});
		

		join.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {				
					if (idCheck == true && pwCheck == true) {
						iD = registrateId.getText();
						pW = checkRegistratePw.getText();
						JOptionPane.showMessageDialog(Ex11.this, "등록되었습니다!");	// 메세지를 담은 Dialog가 있다. 왼쪽 = 위치, 오른쪽 = 문자
						System.out.println(iD + "\n" +pW);
						map.put(iD, pW);
					} else {
						System.out.println("정보가 일치하지 않습니다.");
						JOptionPane.showMessageDialog(Ex11.this, "정보가 일치하지 않습니다");
					};
				} catch (NullPointerException x) {
					System.out.println("입력되지 않았습니다.");
					JOptionPane.showMessageDialog(Ex11.this, "입력되지 않았습니다.");
				}
				
				
			}
		});
		
		
		pnl.add(registrateId);
		pnl.add(registratePw);
		pnl.add(checkRegistratePw);
		pnl.add(join);
		
		getContentPane().add(pnl);
		/////////////////////////////////회원가입////////////////////////////
		JPanel pnl2 = new JPanel();
		JTextField inputId = new JTextField(10);
		JPasswordField inputPw = new JPasswordField(10);
		JButton login = new JButton("로그인");
		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inputPw.getText().equals(map.get(inputId.getText()))) {
					System.out.println("로그인 성공");
					JOptionPane.showMessageDialog(Ex11.this, "로그인 성공");
				} else {
					System.out.println("로그인 실패");
					JOptionPane.showMessageDialog(Ex11.this, "로그인 실패");
				}
			}
		});
		
		
		pnl2.add(inputId);
		pnl2.add(inputPw);
		pnl2.add(login);
		
		
		getContentPane().add(pnl2, BorderLayout.NORTH);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex11().setVisible(true);
	}

}
