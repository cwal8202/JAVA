import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file = new File("d:\\Java\\test.txt");		// 자바에선 \\(백슬러쉬)는 두번 해야지 인식된다. // 절대적 경로
	
//		System.out.println(file.getName());		// 파일의 이름
//		System.out.println(file.getPath());		// 파일 경로
//		System.out.println(file.exists());		// 파일의 존재여부 boolean값
//
//		File f2 = new File("d:\\Java\\asdf.txt");	// 실제 파일이 아닌 외부의 파일을 가르킬수 있는 객체. 실제 파일이 아니다.
//		
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
	
		File dir = new File("d:\\Java");
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요?" + dir.isFile());	//파일 
		System.out.println("디렉토리인가요?" + dir.isDirectory());
	}
}
