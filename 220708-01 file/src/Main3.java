import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
//		File file = new File("d:\\filetest");
//		System.out.println("있냐?" + file.exists());	// 처음실행시 false  // 두번째 실행시 true
//		System.out.println("폴더임?" + file.isDirectory()); // 처음실행시 false // 두번째 실행시 true
//		System.out.println("파일임?" + file.isFile()); // 처음실행시 false // 두번째 실행시 false
//		
//		boolean result = file.mkdir(); 
//		System.out.println("생성여부 : " + result); // 처음실행시 true // 두번째 실행시 false = 이미 생성이 되었기 때문에
//		
//		// d드라이브에 filetest 폴더(디렉토리)안에 abc 폴더를 생성해보세요
//		File abc = new File("d:\\filetest\\abc");
//		abc.mkdir();
//
//		File file2 = new File("d:\\fileTest\\abc\\..\\def");
//		file2.mkdir();
//		try {
//			System.out.println(file2.getCanonicalPath());	// 경로 알려주는 '문자열'을 알려주는것
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			File file3 = new File(file2.getCanonicalFile() + "\\def");
//			file3.mkdir();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	// 경로의 파일을 반환하는 값이다. 즉 파일 그자체를 가져오는것이다.
//		
		File textFile = new File("d:\\filetest\\mytext." + "txt");	// 지금까지 폴더 만들었으니깐 지금부턴 파일을 만드는것이다.
		try {
			boolean result = textFile.createNewFile();				// 똑같이 Checked예외발생한다~!
			System.out.println("생성됨? " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
