import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//interface이다. 버튼 클릭 동작을 들을수 있는.
//class MyActionListener implements ActionListener {
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("사용자가 버튼을 클릭했습니다.");
//	}
//	
//}

// click 했을떄 actionperform이 실행된다.

public class MyColorFrame extends JFrame {
	public MyColorFrame() {
		super("색깔 있는 프레임");
		
		JPanel pnl = new JPanel(); // 배경을 추가한다. 패널.
		pnl.setBackground(Color.red);
		
		// 버튼을 클릭하면 action이  일어나고 ActionListener가 그걸 알고 
		JButton btn = new JButton("컨테이너 안의 버튼");
		// MyActionListener listener = new MyActionListener();
		// btn.addActionListener(listener);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pnl.setBackground(Color.BLUE);
				System.out.println("익명 클래스 구현");
			}
		});
				
		pnl.add(btn);
		
		add(pnl);
	
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyColorFrame f = new MyColorFrame();
		f.setVisible(true);
	}

}
