import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main7 extends JFrame {
	public Main7() {
		JPanel pnlTop = new JPanel();		// 위에 담을 패널
		JPanel pnlBottom = new JPanel();	// 아래에 담을 패널
		JPanel pnlBox = new JPanel();		// 위 아래 패널을 담는 패널
		
		BoxLayout box = new BoxLayout(pnlBox, BoxLayout.Y_AXIS);
		pnlBox.setLayout(box);
		pnlBox.add(pnlTop);
		pnlBox.add(pnlBottom);
		
		
		JTextField tf1 = new JTextField(20);	// int값은 가로 길이
		JTextField tf2 = new JTextField(20);
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf1.getText();		// 사용자가 textField에 넣은 값을 콘솔창에 전달한다. 
				tf2.setText(text);	// 값을 설정할 수 있다. 지금같은 경우는 tf1에 입력한 값이 설정되게 하였다.
				JOptionPane.showMessageDialog(Main7.this, text);	// 메세지를 담은 Dialog가 있다. 왼쪽 = 위치, 오른쪽 = 문자 
				// null 이었을땐 무조건 화면 중앙에 위치하지만 컴포넌트를 정하면 그위치에 가장 가깝게 위치하게 한다.
			}
		});
		
		pnlTop.add(tf1);
		pnlTop.add(btn1);
		pnlBottom.add(tf2);
		pnlBottom.add(btn2);
		
		add(pnlBox);
		
		pack();		//	창을 내부에 있는 컴포넌트의 크기에 맞춰서 조절해주는것 display = flex;느낌
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main7().setVisible(true);

	}

}
