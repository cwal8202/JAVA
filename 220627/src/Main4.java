import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main4 extends JFrame {
	public Main4() {
		JPanel pnl = new JPanel();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("춘식6.gif");
		Image image2 = kit.getImage("춘식9.gif");
		JButton reset = new JButton("돌아가기");
		
		// 텍스트도 가능하지만 이미지도 가능하다!
		JLabel lbl = new JLabel(new ImageIcon(image));
		lbl.setText("춘식이 이미지 '꾹~' 눌러보세요~!");
		pnl.add(lbl);
		
		lbl.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(image2));
				reset.setVisible(false);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(null);
				lbl.setText("잘하셨어요~^^");
				pnl.add(reset);
				reset.setVisible(true);
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(new ImageIcon(image));
				lbl.setText("춘식이 이미지 꾹 눌러보세요~!");
				reset.setVisible(false);
			}
		});
		
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Main4().setVisible(true);
	}
}
