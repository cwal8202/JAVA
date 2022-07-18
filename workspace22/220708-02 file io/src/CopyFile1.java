import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
	public static void main(String[] args) {

		FileInputStream in = null; // 파일의 입력 담당 바이트 단위로 써준다.
		FileOutputStream out = null; // 파일의 출력 담당 바이트 단위로 써준다.

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;

			while ((c = in.read()) != -1) {		// 파일의 끝이면 -1이라는 값을 가져온다.
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
