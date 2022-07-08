import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main3 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			File file = new File("d:\\filetest\\practice.txt");
			System.out.println("형변환 전 = " + file.length());
			int length = (int)file.length();	// long이 나오면 안되므로 int로 형변환함.
			byte[] buf = new byte[length];
			
			fis = new FileInputStream(file);
			fis.read(buf);
//			fis.read(buf, 0, file.length());	// 처음부터 끝까지
			
			String result = new String(buf);
			
			System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
