import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private JCheckBox box1;
	private JCheckBox box2;
	private JCheckBox box3;


	public Main() {
		JPanel pnl = new JPanel();
		box1 = new JCheckBox("짜장면 : 5000원");
		box2 = new JCheckBox("짬뽕 : 6000원");
		box3 = new JCheckBox("탕수육 : 12000원");
		JLabel lblPrice = new JLabel("가격 표시");
		JButton btnAll = new JButton("전체 선택");
		JButton btnCancel = new JButton("취소");
		
		
		pnl.add(box1);
		pnl.add(box2);
		pnl.add(box3);
		pnl.add(lblPrice);
		pnl.add(btnAll);
		pnl.add(btnCancel);
		
		
		add(pnl);
		
		ActionListener btnListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean all = e.getSource() == btnAll;
				box1.setSelected(all);
				box2.setSelected(all);
				box3.setSelected(all);
			}
		};			// 체크가 되어도 클릭이 되야지 되는 action리스너이기 때문에 체크랑은 관계가 없다.

		btnAll.addActionListener(btnListener);
		btnCancel.addActionListener(btnListener);
		
		
		ActionListener actionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = sum();
				lblPrice.setText(String.valueOf(sum));
			}
		};
		box1.addActionListener(actionListener);
		box2.addActionListener(actionListener);
		box3.addActionListener(actionListener);
		
		ItemListener itemListener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				int sum = sum();
				lblPrice.setText(String.valueOf(sum));
			}
		};
		
		box1.addItemListener(itemListener);
		box2.addItemListener(itemListener);
		box3.addItemListener(itemListener);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private int sum() {
		int sum = 0;
		sum += box1.isSelected() ? 5000 : 0;
		sum += box2.isSelected() ? 6000 : 0;
		sum += box3.isSelected() ? 12000 : 0;
		return sum;
	}
	
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}

