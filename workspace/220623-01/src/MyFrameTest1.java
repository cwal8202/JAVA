import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame2");
		
		setBackground(Color.red);
		
		JButton button = new JButton("버튼");
		JButton button2 = new JButton("버튼2");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(button);	//	 기본동작은 화면을 가득 채우는 것이다.
		add(button2);
		// getContentPane(). 생략을 해도 똑같다.
		
//		setLayout(new FlowLayout());
//		this.add(button);
		setVisible(true);
	}
}

public class MyFrameTest1 {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}
