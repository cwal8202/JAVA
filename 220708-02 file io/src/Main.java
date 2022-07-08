import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File diaryFile = new File("d:\\filetest\\diary.txt");
		System.out.println(diaryFile.exists());
		
		Scanner scanner = null;		// 외부의 파일안에 텍스트를 빨대로 빨아와야 한다. 그 빨대 역할 중 하나가 Scanner다.
		try {
			scanner = new Scanner(diaryFile);
//			scanner = new Scanner(diaryFile, "UTF-8"); 아까 값 불러오는데 오류가 났다. 왜냐면 UTF-8이 아니었기 때문이다.
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		} finally {
			if (scanner != null) {	// null 체크를 먼저 한다. 이게 뭐지??
				scanner.close(); 	// 자원해제를 위해서 close();를 한다.
			}
		}
		
	}
}
