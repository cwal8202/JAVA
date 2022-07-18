import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// d:\filetest\한글이름.txt
		
		File fileKor = new File("d:\\filetest\\한글이름.txt");
		try {
			System.out.println("생성됨? " + fileKor.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// rename은  파라미터에 파일 객체를 필요로 한다.
//		fileKor.renameTo(new File("d:\\filetest\\newname.txt"));
		
		File mytext = new File("d:\\filetest\\mytext.txt");
		try {
			mytext.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mytext.delete();
		
	}

}
