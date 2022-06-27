import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ex1 extends JFrame {
	private static final String ID = "chlwkdgh";
	private static final String PW = "chlwkdgh1";
	public Ex1() {
		JPanel pnl = new JPanel();
		JTextField inputId = new JTextField(10);
		JPasswordField inputPw = new JPasswordField(10);
		JButton login = new JButton("로그인");
		
		KeyListener idcheck = new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (inputId.getText().equals(ID)) {
					System.out.println("아이디 확인되었습니다.");
				};
			}
			
		};
		
//		ActionListener idCheck = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (inputId.getText().equals(ID)) {
//					System.out.println("아이디 확인되었습니다.");
//				};
//			}
//		};
		
		ActionListener pwCheck = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("체크");
				if (inputPw.getText().equals(PW)) {
					System.out.println("비밀번호 확인되었습니다.");
				}
				
				// 비밀번호까지 쳐서 enter쳐도 가능하게 할려고 조건문 만들었다.
				if (inputId.getText().equals(ID) && inputPw.getText().equals(PW)) {
					System.out.println("로그인됐습니다.");
				}
			}
		};
		
//		login.addActionListener(idCheck);
//		inputId.addActionListener(idCheck);
		
		inputId.addKeyListener(idcheck);
		login.addKeyListener(idcheck);

		
		
		login.addActionListener(pwCheck);
		inputPw.addActionListener(pwCheck);
		
		
		
		inputId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getID() == KeyEvent.KEY_TYPED) {
					System.out.println(inputId.getText());
				}
			}
		});
		
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (inputId.getText().equals(ID) && inputPw.getText().equals(PW)) {
					System.out.println("로그인됐습니다.");
				}
			}
		});
		
		pnl.add(inputId);
		pnl.add(inputPw);
		pnl.add(login);
		
		
		add(pnl);
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	public static void main(String[] args) {
		new Ex1().setVisible(true);
	}

}
