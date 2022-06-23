import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main6 extends JFrame {
	public Main6() {
		JPanel pnl = new JPanel();	// 기본값이 flow이다. flow로 설정해도 변화가 없다.
		// 레이아웃 관리자 (배치 관리자) // flow는 왼쪽 오른쪽 가운데 설정만 가능하다.
//		FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
//		pnl.setLayout(flow);
		
		// 자신의 component를 가득채운다. JFrame의 contentPane의 기본유형은 border라는것을 알 수 있다.
		// border는 component를 5파트로 나누어 가질 수 있다. 동서남북 중앙.
//		BorderLayout border = new BorderLayout();
//		pnl.setLayout(border);

		// 박스들을 x축으로 쌓을건지 y축으로 쌓을건지 정한다.
//		BoxLayout box = new BoxLayout(pnl, BoxLayout.X_AXIS);
//		pnl.setLayout(box);
		
		// grid는 몇줄 몇칸 으로 설정 할 수 있다.
//		GridLayout grid = new GridLayout(2, 2);
//		pnl.setLayout(grid);
		
		// 모든 레이아웃을 없앨때 쓴다.
		pnl.setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		
		// 레이아웃을 없애면 위치와 크기를 다시 설정해줘야한다.
		btn1.setLocation(10, 40);		// x, y로 시작한다. margin이랑 똑같다.
		btn1.setSize(200, 300); // 가로 세로   항상 기준은 좌측 상단이다.
		
		// 한번에 다 입력 가능하게 한것.	x y 가로 세로
		btn2.setBounds(220, 50 ,100, 10);
		
		
		// border로 가득찬 버튼에서 크기 조절을 할 수 없다. 조절이 잘 안되는 이유는 BorderLayout같은것들 때문일 수 있다.
		btn1.setPreferredSize(new Dimension(300, 300));
		btn1.setMinimumSize(new Dimension(300, 300));
		btn1.setMaximumSize(new Dimension(300, 300));
		
		pnl.add(btn1, "West");
		pnl.add(btn2);
		pnl.add(btn3, "East");
		// 중복된 버튼을 넣으면 값이 복사 되는게 아니고 원래 있던 자리에서 나중에 입력된 자리로 바뀐다.
		pnl.add(btn3, "South");
		
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Main6().setVisible(true);
	}

}
