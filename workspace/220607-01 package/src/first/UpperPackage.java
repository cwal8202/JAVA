package first;

import first.second.AnotherClass;

public class UpperPackage {
	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();
		a.number = 11;
		//a.mySecret = 22;
		//	a.test = 33; 	// 필드 test는 first.second 의 AnotherClass의 default 접근제한자인데 같은 package가 아니라서 못불러온다.
							// 즉 부모 package라도 같은 package 라고 인식하지 못하기에 못불러온다.
	}
}
