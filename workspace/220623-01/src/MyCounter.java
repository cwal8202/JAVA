import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame {
	private int number = 0;
	private int number2 = 1000;
	private int count = 0;
	
	public MyCounter() {
		super("카운터");
		
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("0");
		JButton btn = new JButton("증가");
		
		ActionListener aListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				if (btn.getText().equals("증가")) {
					number += 100;
				}
				
//				if (e.getSource() == btn) { //	어떤 버튼으로 이벤트 발생한지 구별해줌
//					number++;
//				} else {
//					number--;
//				}
				lbl.setText(String.valueOf(number));
				System.out.println("액션 리스너입니다.");
			}
		};
		
		
		btn.addActionListener(aListener);
		// 액션 이벤트 발생 - 처리하는 친구가 리스너  버튼에서발생된 액션이벤트를 액션리스너의 액션퍼폼이 전달받아서 처리하는 과정이다.
		JLabel label = new JLabel("1000");
		JButton btn2 = new JButton("감소");
		btn2.addActionListener(aListener);
		
		
		JButton btn3 = new JButton("색깔 바뀌는 버튼");
		btn3.addActionListener(aListener);
		pnl.add(btn3);
		
		
		pnl.add(label);
		pnl.add(btn2);
		
		
		pnl.add(lbl);
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyCounter().setVisible(true);
	}

}
