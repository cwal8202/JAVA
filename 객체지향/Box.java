public class Box {
	// 값/ 상태 -> 멤버변수(member variable / 필드 (fields) - 객체의 구성요소
	int length;
	int width;
	int height;
	
	//int volume = length * width * height;
	
	// 메소드 / 기능 or 동작
	public void printAllState() {
		System.out.println(width);
		System.out.println(length);
		System.out.println(height);
	
	}
		
		// ???
		// 박스는 자기 자신의 부피를 구해서 정수형 '값'으로 
		// 알려줄 수 있음. (반환을 해준다.) 
	public int getVolume() { // 외부에서 가져오는게 아닌 이미 가지고 있는 값이므로 전달받는 값은 없다.
		return width * length * height;
	}
}