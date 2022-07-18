import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main4 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\lineio.txt");
		
		PrintWriter pw = null;
		
		
		try {
			pw = new PrintWriter(new FileWriter(file));
		
			pw.println("문자열 한줄을 출력합니다.");
			pw.println(10);
			pw.println(15.15);
			pw.flush();		// 임시공간, 즉 버퍼에 있는것들을 한번에 다 비워주는 메소드
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}

		
	}

}
