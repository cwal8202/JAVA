import java.awt.Color;

import javax.print.attribute.standard.JobPriority;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

public class Main3 extends JFrame {
	public Main3() {
		JPanel red = new JPanel();
		red.setBackground(Color.red);
		
		JPanel blue = new JPanel();
		blue.setBackground(Color.blue);
		
		// tab은 인터넷에서 새탭열기 할때 그 탭을 말하는 것이다.
		JTabbedPane tab = new JTabbedPane();
		tab.add("빨강", red);	//	탭의 이름을 설정 할 수 있다. 왼쪽 이름설정, 오른쪽 패널
		tab.add("파랑", blue);
		add(tab);
		
		// 사용자가 크기를 조절할 수 있다. horizontal로 나눌지 또는 vertical로 나눌지
		//											HORIZONTAL_SPLIT
//		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, red, blue);
//		split.setDividerLocation(250); // 초기 위치 정할 수 있다.
//		
//		add(split);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		
	}
	public static void main(String[] args) {
		new Main3().setVisible(true);
	}

}
