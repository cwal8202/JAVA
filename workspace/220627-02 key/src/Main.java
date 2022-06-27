import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	private int x;
	private int y;
	
	public Main() {
		JPanel pnl = new JPanel(null);
		JLabel lbl = new JLabel("입력");
		x = 100;
		y = 100;
		lbl.setBounds(x, y, 50, 50);
		
		pnl.add(lbl);
		
		add(pnl);
		
		pnl.setFocusable(true);
		pnl.addKeyListener(new KeyAdapter() {
	
//			@Override
//			public void keyTyped(KeyEvent e) {	// 하나의 클릭처럼 키가 입력이 되면 발생한다.
//				
//			}
//			@Override
//			public void keyReleased(KeyEvent e) {
//				
//			}
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				if (code == KeyEvent.VK_LEFT) {
//					lbl.setLocation( x, y);
//					x += -10;
					lbl.setLocation( lbl.getX() - 10, lbl.getY());
					System.out.println("왼쪽 화살표 누름");
				} else if (code == KeyEvent.VK_RIGHT) {
					lbl.setLocation( lbl.getX() + 10, lbl.getY());
					System.out.println("오른쪽 화살표 누름");
				} else if (code == KeyEvent.VK_UP) {
					lbl.setLocation( lbl.getX(), lbl.getY() - 10);
					System.out.println("위쪽 화살표 누름");
				} else if (code == KeyEvent.VK_DOWN) {
					lbl.setLocation( lbl.getX(), lbl.getY() + 10);
					System.out.println("아래쪽 화살표 누름");
				} else if (code == KeyEvent.VK_SPACE) {
					lbl.setLocation( lbl.getX() + 30, lbl.getY() - 30);
					System.out.println("스페이스  누름");
				}
				
//				char c = e.getKeyChar();
//				lbl.setText(String.valueOf(c));
			}
		});
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Main().setVisible(true);
	}

}