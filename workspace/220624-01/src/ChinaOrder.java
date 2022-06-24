import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.xml.ws.soap.AddressingFeature;
import java.awt.Font;

public class ChinaOrder extends JFrame {
	private int price;
	private int check1count = 0;
	private int check2count = 0;
	private int check3count = 0;
	
	public ChinaOrder() {
		JPanel pnl = new JPanel();
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		
		JCheckBox check1 = new JCheckBox("짜장면 = 2500");
		JButton check1plus = new JButton("+");
		JButton check1minus = new JButton("-");
		
		JCheckBox check2 = new JCheckBox(" 짬뽕  = 3000");
		JButton check2plus = new JButton("+");
		JButton check2minus = new JButton("-");
		
		JCheckBox check3 = new JCheckBox("탕수육 = 4000");
		JButton check3plus = new JButton("+");
		JButton check3minus = new JButton("-");

		JLabel check1Number = new JLabel("0");
		JLabel check2Number = new JLabel("0");
		check2Number.setFont(new Font("굴림", Font.PLAIN, 26));
		JLabel check3Number = new JLabel("0");
		check3Number.setFont(new Font("굴림", Font.PLAIN, 26));
		check1Number.setFont(new Font("굴림", Font.PLAIN, 26));
		
		JLabel title = new JLabel("총 수량");
		JLabel result = new JLabel("가격");
		
		check1plus.setEnabled(false);
		check1minus.setEnabled(false);
		
		check2plus.setEnabled(false);
		check2minus.setEnabled(false);
		
		check3plus.setEnabled(false);
		check3minus.setEnabled(false);
		
		
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				check1count++;
				check1Number.setText(Integer.toString(check1count));
				int check = e.getStateChange();
				if (check == 1) {
					check1plus.setEnabled(true);
					check1minus.setEnabled(true);
					price += 2500;
					System.out.println("체크됨");
					result.setText("총 금액  " + price);
				} else if(check == 2) {
					check1plus.setEnabled(false);
					check1minus.setEnabled(false);
					price -= (check1count-1)*2500;
					check1count = 0;
					check1Number.setText(Integer.toString(check1count));
					result.setText("총 금액  " + price);
				}
			}
		});
		
		check1plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					check1count++;
					check1Number.setText(Integer.toString(check1count));
					price += 2500;
					result.setText("총 금액  " + price);
			}
		});
		check1minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(check1count > 0) {
					check1count--;
				
				check1Number.setText(Integer.toString(check1count));
				price -= 2500;
				result.setText("총 금액  " + price);;
				}
			}
		});
		
		///////////////////////////////
		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				check2Number.setText("1");
				check2count++;
				int check = e.getStateChange();
				if (check == 1) {
					check2plus.setEnabled(true);
					check2minus.setEnabled(true);
					price += 3000;
					System.out.println("체크됨");
					result.setText("총 금액  " + price);
				} else if(check == 2) {
					check2plus.setEnabled(false);
					check2minus.setEnabled(false);
					price -= (check2count-1)*3000;
					check2count = 0;
					check2Number.setText(Integer.toString(check2count));
					result.setText("총 금액  " + price);
				}
			}
		});
		
		check2plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					check2count++;
					check2Number.setText(Integer.toString(check2count));
					price += 3000;
					result.setText("총 금액  " + price);
			}
		});
		check2minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(check2count > 0) {
					check2count--;
				
				check2Number.setText(Integer.toString(check2count));
				price -= 3000;
				result.setText("총 금액  " + price);
				}
			}
		});
		
		//////////////////////////////////////////
		
		check3.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				check3Number.setText("1");
				check3count++;
				int check = e.getStateChange();
				if (check == 1) {
					check3plus.setEnabled(true);
					check3minus.setEnabled(true);
					price += 4000;
					System.out.println("체크됨");
					result.setText("총 금액  " + price);
				} else if(check == 2) {
					check3plus.setEnabled(false);
					check3minus.setEnabled(false);
					price -= (check3count-1)*4000;
					check3count = 0;
					check3Number.setText(Integer.toString(check3count));
					result.setText("총 금액  " + price);
				}
			}
		});
		
		check3plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					check3count++;
					check3Number.setText(Integer.toString(check3count));
					price += 4000;
					result.setText("총 금액  " + price);
			}
		});
		check3minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(check3count > 0) {
					check3count--;
				
				check3Number.setText(Integer.toString(check3count));
				price -= 4000;
				result.setText("총 금액  " + price);
				}
			}
		});
		/////////////////////////////
		
		SpringLayout sl_left = new SpringLayout();
		sl_left.putConstraint(SpringLayout.NORTH, check3Number, 6, SpringLayout.SOUTH, check2Number);
		sl_left.putConstraint(SpringLayout.EAST, check3Number, 0, SpringLayout.EAST, check1Number);
		sl_left.putConstraint(SpringLayout.NORTH, check3minus, 0, SpringLayout.NORTH, check3plus);
		sl_left.putConstraint(SpringLayout.EAST, check3minus, 0, SpringLayout.EAST, check1minus);
		sl_left.putConstraint(SpringLayout.WEST, check1Number, 166, SpringLayout.WEST, left);
		sl_left.putConstraint(SpringLayout.WEST, check3, 10, SpringLayout.WEST, left);
		sl_left.putConstraint(SpringLayout.WEST, check1plus, 6, SpringLayout.EAST, check1);
		sl_left.putConstraint(SpringLayout.EAST, check1plus, -12, SpringLayout.WEST, check1Number);
		sl_left.putConstraint(SpringLayout.NORTH, check2Number, 38, SpringLayout.NORTH, left);
		sl_left.putConstraint(SpringLayout.NORTH, check1Number, 0, SpringLayout.NORTH, left);
		sl_left.putConstraint(SpringLayout.SOUTH, check1Number, -6, SpringLayout.NORTH, check2Number);
		sl_left.putConstraint(SpringLayout.NORTH, check2, 0, SpringLayout.NORTH, check2plus);
		sl_left.putConstraint(SpringLayout.EAST, check2, -6, SpringLayout.WEST, check2plus);
		sl_left.putConstraint(SpringLayout.NORTH, check3, 0, SpringLayout.NORTH, check3plus);
		sl_left.putConstraint(SpringLayout.NORTH, check3plus, 9, SpringLayout.SOUTH, check2plus);
		sl_left.putConstraint(SpringLayout.EAST, check3plus, 0, SpringLayout.EAST, check1plus);
		sl_left.putConstraint(SpringLayout.EAST, check2Number, 0, SpringLayout.EAST, check1Number);
		sl_left.putConstraint(SpringLayout.EAST, check1Number, -17, SpringLayout.WEST, check1minus);
		sl_left.putConstraint(SpringLayout.NORTH, check2minus, 0, SpringLayout.NORTH, check2plus);
		sl_left.putConstraint(SpringLayout.EAST, check2minus, 0, SpringLayout.EAST, check1minus);
		sl_left.putConstraint(SpringLayout.NORTH, check2plus, 6, SpringLayout.SOUTH, check1plus);
		sl_left.putConstraint(SpringLayout.WEST, check2plus, 0, SpringLayout.WEST, check1plus);
		sl_left.putConstraint(SpringLayout.WEST, check1minus, 198, SpringLayout.WEST, left);
		sl_left.putConstraint(SpringLayout.NORTH, check1plus, 10, SpringLayout.NORTH, left);
		sl_left.putConstraint(SpringLayout.SOUTH, check1plus, -269, SpringLayout.SOUTH, left);
		sl_left.putConstraint(SpringLayout.NORTH, check1minus, 0, SpringLayout.NORTH, check1plus);
		sl_left.putConstraint(SpringLayout.WEST, check1, 10, SpringLayout.WEST, left);
		sl_left.putConstraint(SpringLayout.NORTH, check1, 5, SpringLayout.NORTH, left);
		left.setLayout(sl_left);
		
	
		left.add(check1plus);
		left.add(check1minus);
		left.add(check1Number);
		
		left.add(check2plus);
		left.add(check2minus);
		left.add(check2Number);

		left.add(check3plus);
		left.add(check3minus);
		left.add(check3Number);
		
		left.add(check1);
		left.add(check2);
		left.add(check3);
		SpringLayout sl_right = new SpringLayout();
		sl_right.putConstraint(SpringLayout.NORTH, result, 7, SpringLayout.SOUTH, title);
		sl_right.putConstraint(SpringLayout.WEST, result, 0, SpringLayout.WEST, title);
		sl_right.putConstraint(SpringLayout.NORTH, title, 5, SpringLayout.NORTH, right);
		sl_right.putConstraint(SpringLayout.WEST, title, 54, SpringLayout.WEST, right);
		right.setLayout(sl_right);
		
		right.add(title);
		right.add(result);
		SpringLayout sl_pnl = new SpringLayout();
		sl_pnl.putConstraint(SpringLayout.WEST, left, 10, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.EAST, left, -6, SpringLayout.WEST, right);
		sl_pnl.putConstraint(SpringLayout.WEST, right, 263, SpringLayout.WEST, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, right, 0, SpringLayout.SOUTH, left);
		sl_pnl.putConstraint(SpringLayout.EAST, right, -43, SpringLayout.EAST, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, right, 103, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.SOUTH, left, 406, SpringLayout.NORTH, pnl);
		sl_pnl.putConstraint(SpringLayout.NORTH, left, 104, SpringLayout.NORTH, pnl);
		pnl.setLayout(sl_pnl);
		
		pnl.add(left);
		pnl.add(right);
		
		getContentPane().add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new ChinaOrder().setVisible(true);
	}
}
