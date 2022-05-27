// 책 클래스 (class Book)
// 필드(상태) : 제목(title), 저자(author)
// 메소드(기능) : 제목과 저자를 콘솔에 출력 가능
import java.util.*;

class Book {
	String title;
	String author;
	
	void print(){
		System.out.printf("제목 : %s 저자 : %s", title, author);
	}
}

public class Book1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book main = new Book();
		
		System.out.print("책 제목 : ");
		main.title = scan.nextLine();
		System.out.print("저자 이름 : ");
		main.author = scan.nextLine();
		
		main.print();
	}		
}