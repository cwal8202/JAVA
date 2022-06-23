import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main8 extends JFrame {
	private int first;
	private int second;
	private int answer;
	private int random;
	private String operation;
	
	public Main8() {
		super("수학문제");
		JPanel pnlBottom = new JPanel();
		JPanel pnl = new JPanel();
		
		JPanel pnlTop = new JPanel();
		//pnl.setBackground(Color.white);
		JLabel lbl = new JLabel("퀴즈");
		pnlTop.add(lbl);
		
		Random r1 = new Random();
		Random r2 = new Random();
		
		first = r1.nextInt(10);
		second = r1.nextInt(9) + 1;
		random = r2.nextInt(4);
		operation = "";
		if (random == 0) {
			answer = first + second;
			operation = "+";
		} else if (random == 1) {
			answer = first - second;
			operation = "-";
		} else if (random == 2) {
			answer = first * second;
			operation = "*";
		} else if (random == 3) {
			answer = first / second;
			operation = "/";
		}
		
		JLabel question = new JLabel("" + first + operation +  second);
		pnlTop.add(question);
		
		JButton btn0 = new JButton("새로고침");
		ActionListener listener0 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = r1.nextInt(10);
				second = r1.nextInt(9) + 1;
				answer = first + second;
				random = r2.nextInt(4);
				operation = "";
				if (random == 0) {
					answer = first + second;
					operation = "+";
				} else if (random == 1) {
					answer = first - second;
					operation = "-";
				} else if (random == 2) {
					answer = first * second;
					operation = "*";
				} else if (random == 3) {
					answer = first / second;
					operation = "/";
				}
				question.setText("" + first + operation +  second);
			}
		};
		btn0.addActionListener(listener0);
		pnlTop.add(btn0);
		
		String result = Integer.toString(answer);
		
		JTextField tf1 = new JTextField(20);
		pnlBottom.add(tf1);
		
		JButton btn1 = new JButton("확인");
		pnlBottom.add(btn1);
		
		
		
		JLabel lblresult = new JLabel("결과");
		pnlBottom.add(lblresult);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

//					String text = "정답은" + answer;		// 사용자가 textField에 넣은 값을 콘솔창에 전달한다. 
//					JOptionPane.showMessageDialog(Main8.this, text);	// 메세지를 담은 Dialog가 있다. 왼쪽 = 위치, 오른쪽 = 문자 
						// null 이었을땐 무조건 화면 중앙에 위치하지만 컴포넌트를 정하면 그위치에 가장 가깝게 위치하게 한다.
				
				if(tf1.getText().equals(Integer.toString(answer))) {
					lblresult.setText("정답");
				} else {
					lblresult.setText("오답");
				}
			}
		};
		
		btn1.addActionListener(listener);
		pnl.add(pnlTop);
		pnl.add(pnlBottom);
		
		BoxLayout box = new BoxLayout(pnl, BoxLayout.Y_AXIS);
		pnl.setLayout(box);
		
		add(pnl);
		setSize(500, 500);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Main8().setVisible(true);
	}
}
