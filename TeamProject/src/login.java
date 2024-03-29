import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class login extends JFrame {
	
	public login() {
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel id_lbl = new JLabel("아이디");
		id_lbl.setBounds(57, 76, 57, 34);
		getContentPane().add(id_lbl);
		
		JLabel pw_lbl = new JLabel("비밀번호");
		pw_lbl.setBounds(57, 120, 57, 34);
		getContentPane().add(pw_lbl);
		
		
////////////////////////////////////텍스트필드/////////////////////////////////////////////////		
		
		JTextField id_tf = new JTextField("아이디");
		id_tf.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (id_tf.getText().equals("")) {
					id_tf.setText("아이디");
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				if (id_tf.getText().equals("아이디")) {
					id_tf.setText("");
				}
			}
		});
		
		id_tf.setBounds(142, 83, 116, 21);
		getContentPane().add(id_tf);
		id_tf.setColumns(10);
		
		JTextField pw_tf = new JTextField("비밀번호");
		pw_tf.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				if (pw_tf.getText().equals("")) {
					pw_tf.setText("비밀번호");
				}	
			}
			@Override
			public void focusGained(FocusEvent e) {
				if (pw_tf.getText().equals("비밀번호")) {
					pw_tf.setText("");
				}
			}
		});
		
		pw_tf.setColumns(10);
		pw_tf.setBounds(142, 127, 116, 21);
		getContentPane().add(pw_tf);
		
		JButton login_button = new JButton("로그인");
		login_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("로그인 벝은");
			}
		});
		login_button.setBounds(60, 212, 97, 23);
		getContentPane().add(login_button);
		
		JButton signUp_button = new JButton("회원가입");
		signUp_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new signUp().setVisible(true);
			}
		});
		
		signUp_button.setBounds(203, 212, 97, 23);
		getContentPane().add(signUp_button);
	}
	
	public static void main(String[] args) {
		new login().setVisible(true);
	}
}
