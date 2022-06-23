import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Main3 {
	public static void main(String[] args) {		
	//	JFrame frame = new MyFrame("나만의 프레임"); 이것도 가능!
		MyFrame frame = new MyFrame("나만의 프레임");
		frame.setVisible(true);
		
		frame.getContentPane().add(new JLabel("Hello World"));
	}
}
