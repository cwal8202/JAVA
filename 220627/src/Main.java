import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	public Main() {
		MouseListener listener = new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("마우스 버튼을 땜");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("마우스 버튼을 누름");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("EXIT");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("호버 ??");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
				case MouseEvent.BUTTON1: 
					System.out.println("버튼 1번 누름");
					break;
					
				case MouseEvent.BUTTON2: 
					System.out.println("버튼 2번 누름");
					break;
					
				case MouseEvent.BUTTON3: 
					System.out.println("버튼 3번 누름");
					break;
				
				}
				
				// 왼쪽버튼인지 오른쪽 버튼인지 가운데 버튼인지 알 수 있다!
				System.out.println("왼쪽버튼인가요? " + SwingUtilities.isLeftMouseButton(e));
				System.out.println("오른쪽버튼인가요? " + SwingUtilities.isMiddleMouseButton(e));
				System.out.println("스크롤버튼인가요? " + SwingUtilities.isRightMouseButton(e));
				
				
//				if(e.getButton() == MouseEvent.BUTTON1) {
//					System.out.println("버튼 1번 누름!");
//				} 
//				if(e.getButton() == MouseEvent.BUTTON2) {
//					System.out.println("버튼 2번 누름!");
//				}
//				if(e.getButton() == MouseEvent.BUTTON3) {
//					System.out.println("버튼 3번 누름!");
//				}
				
				
				System.out.println("마우스 클릭!!");
				if (e.getClickCount() == 2) {
					System.out.println("더블 클릭!! ");
				}
			}
		};
		
		MouseMotionListener motion = new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스가 움직입니다." + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		JPanel pnl = new JPanel();
		
//		pnl.addMouseListener(listener);
		pnl.addMouseMotionListener(motion);
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}
