import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice2 {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\연습문제2.txt");
		File file2 = new File("d:\\filetest\\연습문제2의2.txt");
		System.out.println(file.exists());
		FileReader inputStream = null;
		FileWriter outputStream = null;
		int c;
		try {
			inputStream = new FileReader(file);
			outputStream = new FileWriter(file2);
			while ((c = inputStream.read()) != -1) {	// 문자하나를 읽어 오는데 int하나로 변환해준다. UTF형태의 숫자로 바뀐다.
				if ((char) c == ' ') {
					c = Character.toUpperCase(c);
					outputStream.write(c);
					System.out.println("읽는 문자 확인 :  " + (char) (c));	// int로 하나씩 받아오는 값은 UTF형태의 숫자이므로 character로 형변환된다. 
				} else {
					c = Character.toUpperCase(c);
					outputStream.write(c + 3);
					System.out.println("읽는 문자 확인 :  " + (char) (c + 3));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
