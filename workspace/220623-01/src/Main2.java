import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("제목 입니다");		// JFrame은 String title을 필드값으로 가지고 있다.
		frame.setTitle("제목이 변경되었습니다.");
		
		// 안의 내용을 추가 할 수 있다.
		frame.getContentPane().add(new JLabel("Hello World"));
		
		// JFrame 은 닫기 버튼을 눌려도 계속 동작하고 있다. 그래서 닫기 버튼 눌리면 종료해라는 것을 설정해줘야 한다.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
