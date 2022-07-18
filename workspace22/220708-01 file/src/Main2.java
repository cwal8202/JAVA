import java.io.File;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		File file = new File(".\\");	//현재경로이다. "."은 현재 프로젝트 경로이다. 상대적인 경로 . 내기준의 경로이다. d:로 직접 찾아가는 경로는 절대적 경로이다.
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath()); // 상대경로를 포함한 경로를 보여준다.
		try {
			System.out.println(file.getCanonicalPath()); // 상대경로를 실제 경로로 보여주는 경로
			// 예외가 발생하고 이 예외는 무조건 처리해야하는 Checked예외이다. 안해도 되는건 unChecked
		} catch (IOException e) {	// Checked 예외이다.
			e.printStackTrace();
		}
		
		File fileParent = new File("..\\");	// 한단계 위의 경로를 찾는다. 즉 부모경로 찾는다.
		System.out.println(fileParent.getAbsolutePath());
		try {
			System.out.println(fileParent.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			File file3 = file.getCanonicalFile().getParentFile();
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(fileParent.equals(file3));
			System.out.println(fileParent.compareTo(file3));
			System.out.println(fileParent.getCanonicalFile().equals(file3));		// 경로를 비교할땐 경로끼리 비교할 수 있게 경로 메소드로 비교한다.
			System.out.println(fileParent.getCanonicalFile().compareTo(file3));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
