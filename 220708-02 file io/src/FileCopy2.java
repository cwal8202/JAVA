import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) throws IOException {
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader("input.txt");  // 문자단위로 읽는다.
			outputStream = new FileWriter("output.txt");  // 문자단위로 출력한다.
			int c;
			while ((c = inputStream.read()) != -1) {	// 문자하나를 읽어 오는데 int하나로 변환해준다. UTF형태의 숫자로 바뀐다.
				System.out.println("읽는 문자 확인 :  " + (char) c);	// int로 하나씩 받아오는 값은 UTF형태의 숫자이므로 character로 형변환된다. 
				
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if(outputStream != null) {
				outputStream.close();
			}
		}
		
	}

}
