import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {
	public Main5() {
		JPanel pnl = new JPanel();
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setActionCommand("임의의 커맨드");	// 커맨드 문자열 바꿀때 쓴다.
		
		
		pnl.add(btn1);
		pnl.add(btn2);
		
		add(pnl);
		
		ActionListener listener = new ActionListener() {
			@Override		// 엑션이벤트 정보가 담긴다. 엑션이벤트는 버튼이 만든다. 엑션커멘드 또한 버튼이 만드는데 그것또한 포함해서 listener에게 준다.
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 발생");
				System.out.println(e.getActionCommand());
			}
		};
		
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main5().setVisible(true);
	}

}
