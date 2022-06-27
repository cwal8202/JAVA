import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice extends JFrame {
	public Practice() {
		JPanel pnl = new JPanel(null);	//	처음에 null이 아닌 기본값으로 설정 했을때 mouseReleased를  하니깐 마우스 포인트 위치로 오는게 아닌 상단 중앙에 위치하게 되었다. 그 이유는 Panel의 기본값은 flow, 즉 상단 중앙에 위치하는게 기본값이기 때문이다.
		pnl.setPreferredSize(new Dimension(500, 500));
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image image = kit.getImage("춘식2.png");
		Image changeImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		JLabel lbl = new JLabel(new ImageIcon(image));
		lbl.setBounds(0,0,100,100);
		lbl.setIcon(new ImageIcon(changeImage));
		
		pnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				lbl.setIcon(new ImageIcon(kit.getImage("춘식15.png")));
				lbl.setBounds(0,0,lbl.getIcon().getIconHeight(), lbl.getIcon().getIconWidth());
				lbl.setLocation((int)e.getX() + 10, (int)e.getY() - 40);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				lbl.setIcon(new ImageIcon(changeImage));
				// setBounds를 다시 리셋하지 않았을때 바운즈가 춘식15.png범위로 유지되어서 마우스에 이미지가 붙지않고 거리가 조금 띄어졌다.
				lbl.setBounds(0,0,100,100);
				lbl.setLocation((int)e.getX(), (int)e.getY());
			}
			
		});
		
		pnl.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lbl.setLocation((int)e.getX(), (int)e.getY());
			}
			
		});
		
		
		pnl.add(lbl);
		
		
		add(pnl);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
	}
	
	public static void main(String[] args) {
		new Practice().setVisible(true);
	}
}
