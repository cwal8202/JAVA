import first.InPackageClass;
import first.second.AnotherClass;

// import java.util.Scanner; 자바 안의 util안에 있는 Scanner클래스이다.

public class Main {
	public static void main(String[] args) {
		InPackageClass test = new InPackageClass();
		
		AnotherClass test2 = new AnotherClass();
		test2.number = 10;
		// test.mySecret = 22;	private 필드라서 못불러온다.
		// test2.test = 33;	// default 또는 package 접근제한자라고 한다. 같은 package에서만 불러올 수 있다.
	}

}
