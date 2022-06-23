import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main4 extends JFrame implements ActionListener {
	private JButton btnEnable;
	private JPanel pnl;
	private JButton btnNotShown;
	private JButton btnDisable;
//	private List<JButton> list;
	
	public Main4() {
		super("버튼 활성화 테스트~");
		pnl = new JPanel();
		btnEnable = new JButton("활성화");
		btnDisable = new JButton("비활성화");
		btnNotShown = new JButton("보이나??");
		//list = new ArrayList<>();
		
		
//		JButton[] btn = new JButton[5];
//		for (int i = 0; i < btn.length; i++) {
//			btn[i] = new JButton(String.valueOf(i));
//		}
		
//		JButton btn1 = new JButton(String.valueOf(1));
//		JButton btn2 = new JButton(String.valueOf(2));
//		JButton btn3 = new JButton(String.valueOf(3));
//		JButton btn4 = new JButton(String.valueOf(4));
//		JButton btn5 = new JButton(String.valueOf(5));
//		
	
		
//		btnDisable.setEnabled(false);	// set활성화 false = 비활성화
		btnNotShown.setVisible(false);	//	set보이게 false	= 안보임
		
		pnl.add(btnEnable);
		pnl.add(btnDisable);
		pnl.add(btnNotShown);
		
		for (int i = 0; i < btn.length; i++) {
			pnl.add(btn[i]);
			
			list.add(btn[i]);
		}
		
		
//		pnl.add(btn1);
//		pnl.add(btn2);
//		pnl.add(btn3);
//		pnl.add(btn4);
//		pnl.add(btn5);
		
//		ActionListener look = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (e.getSource() == btnEnable) {
//					btn1.setEnabled(true);
//					btn2.setEnabled(true);
//					btn3.setEnabled(true);
//					btn4.setEnabled(true);
//					btn5.setEnabled(true);
//				} else if (e.getSource() == btnDisable) {
//					btn1.setEnabled(false);
//					btn2.setEnabled(false);
//					btn3.setEnabled(false);
//					btn4.setEnabled(false);
//					btn5.setEnabled(false);
//				}
//			}
//		};
		
		ActionListener look = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnEnable) {
					for (int i = 0; i < btn.length; i++) {
					btn[i].setEnabled(true);
					}
				} else if (e.getSource() == btnDisable) {
					for (int i = 0; i < btn.length; i++) {
						btn[i].setEnabled(false);
						}
					}
			}
		};
		
		btnEnable.addActionListener(look);
		btnDisable.addActionListener(look);
		
		add(pnl);
		
		setSize(new Dimension(500, 500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnable) {
			
		}
	}
}
