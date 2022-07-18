import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
//import javax.swing.JFileChooser.FileFilter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;

public class TextProgram extends JFrame {
	JFileChooser chooser = new JFileChooser();
//	chooser.showOpenDialog(null);

	public TextProgram() {
		File afile;
		JPanel pnl = new JPanel();
		JTextArea ta = new JTextArea("안녕하세요 메모장입니다.");
		ta.setBounds(12, 62, 460, 389);

		FileFilter filter = new FileFilter() {
			@Override
			public String getDescription() {
				return "텍스트 파일";
			}
			
			@Override
			public boolean accept(File pathname) {
				return false;
			}
		};
		
		
		JButton save = new JButton("저장");
		save.setBounds(327, 5, 57, 23);
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("textArea에 저장되는 입력값은 = " + ta.getText());
				int result = chooser.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					System.out.println("저장 버튼 눌렸을 때");
					File file = chooser.getSelectedFile();
					System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
					File saveFile = new File(file.getAbsolutePath()+ ".txt");
					PrintWriter pw = null;
					try {
						pw = new PrintWriter(saveFile);
						pw.println(ta.getText());
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} finally {
						if (pw != null) {
							pw.close();
						}
					}
				}
			}
		});
		
		JButton open = new JButton("열기");
		open.setBounds(99, 5, 57, 23);
		open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				chooser.showOpenDialog(null);
				File file = chooser.getSelectedFile();
				System.out.println("사용자가 선택한 파일 : " + file.getAbsolutePath());
				BufferedReader br = null;
				ta.setText(null);
				try {
					br = new BufferedReader(new FileReader(file));
					String line;
					while ((line = br.readLine()) != null) {		// file의 끝에서 -1이 아닌 null이 반복된다.
						ta.append(line);
						System.out.println(line);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (br != null) {
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		pnl.setLayout(null);
		

		pnl.add(open);
		pnl.add(ta);
		pnl.add(save);

		getContentPane().add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TextProgram().setVisible(true);
	}

}
