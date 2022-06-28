import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class SubWindow extends JDialog {	// 최소화 최대화 버튼이 없다.
	private JTextField tf;

	public SubWindow(JFrame owner) {
		super(owner, true);	// Main에서 만든 SubWindow의 참조를 불러 온다. 
	//	setModal(true);	// 이 메소드가 true인 창이 닫히기 전까지 다른 창으로 넘어가지 못하게 하는 메소드이다. 생성자에 true를 넣어도 똑같이 작동한다.
		
		setTitle("부가 창");
		
		tf = new JTextField(10);
		add(tf, "North");
		
		JButton btn = new JButton("다른 버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		setSize(500, 500);
		// dispose가 기본값이다 원래.
		// EXIT_ON_CLOSE 런타임 오류가 난다.
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);	//EXIT_ON_CLOSE 일땐 서브창을 닫으면 메인창도 같이 닫힌다. 그래서 DISPOSE_ON_CLOSE을 써서 부가창을 닫으면 부가창만 닫히게 했다. 
	}
	
	public String showDialog() {
		setVisible(true);
		
		return tf.getText();
	}
	
}

public class Main extends JFrame {
	public Main() {
		super("주요 창");
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SubWindow dialog = new SubWindow(Main.this);
				String result = dialog.showDialog();
						
				System.out.println("이 문장은 언제 호출될까?");	// 엑션이벤트 발생 후 SubSwindow창 되고 흐름이 멈춘것 처럼 된다. modal값이 true라서 그렇다. false면 subWindow발생후 바로 흐름이 내려간다.
			
				btn.setText(result);
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true);
		
	}

}
