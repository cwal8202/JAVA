import java.util.Arrays;
import java.util.Scanner;

/*
 * 도서 관리 프로그램
 * 
 * 목록 보기
 * 1. 가격순으로(오름차순, 내림차순 선택가능)
 * 2. 분야를 선택해서 해당 분야만 보기
 */

// 1. 작별인사 					/ 김영하 / 복복서가 / 장편소설 / 12,600원
// 2. 불편한 편의점 					/ 김호연 / 나무옆의자 / 장편소설 / 12,600원
// 3. 지금 알고 있는 걸 그때도 알았더라면 	/ 류시화 / 열림원 / 시집 / 8,100원
// 4. 코스모스						/ 칼 세이건 / 사이언스북스 / 과학 공학 / 16,650원
// 5. 여행의 이유					/ 김영하 / 문학동네 / 에세이 / 12,150원

// -----
// 3. 상세보기
// 4. 도서 정보 수정
// 5. 도서 정보 추가

// 책을 만들어요 - 책에는 제목, 저자, 출판사, 장르, 가격

// 책장 만들어요  - 분야별로
// 책장 관리하는 프로그램 만들기~!

// 책 - 제목, 저자 등 정보 있다.
// 정보 축소해서 보이는 메소드 있다.
// 모든 정보 보이는 메소드 있다.
// 도서 정보 수정 하는 메소드 있다.
//************* 도서 정보 추가하는 메소드 만들어야함 ****************//
class Book {
	String title;
	String author;
	String publisher;
	String genre;
	int price;

	String information;

	////////////////// get 메소드 시작
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrice() {
		return price;
	}

	public String getInformation() {
		return information;
	}
	/////////////////////// get 메소드 끝

	// 기본 생성자 만듦.
	Book() {
	}

	Book(int price) {
		this.price = price;
	}

	// 한번에 입력할수 있는 생성자 만듦.
	public Book(String title, String author, String publisher, String genre, int price, String information) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.genre = genre;
		this.price = price;
		this.information = information;
	}

	////////////////// set 메소드 시작
	String setTitle(String title) {
		this.title = title;
		return title;
	}

	String setAuthor(String author) {
		this.author = author;
		return author;
	}

	String setPublisher(String publisher) {
		this.publisher = publisher;
		return publisher;
	}

	String setGenre(String genre) {
		this.genre = genre;
		return genre;
	}

	int setPrice(int price) {
		this.price = price;
		return price;
	}

	String setInformation(String information) {
		this.information = information;
		return information;
	}
	///////////////////////////// set 메소드 끝

	// 간단한 정보만 나오는 메소드
	public void list() {
		System.out.printf("list (간단 정보) %s / %s / %d원 ", title, author, price);
		System.out.println();
	}

	// 책의 모든 정보 나오는 메소드
	public void addInformation() {
		System.out.printf("1. %s    / %s / %s / %s / %d원", title, author, publisher, genre, price);
		System.out.println();
		System.out.printf("addInformaion 상세 정보 : %s", information);
		System.out.println();
	}
}

// 책을 담을수 있는 책장을 만들었다. 책장은 가격 순으로 오름, 내림 가능
// 분야 선택해서 해당분야만 나오게
// 목록 보게 하는 메소드
class BookShelf {
	Book[] bookBox = new Book[5];
	Book win;
	
	// 책장에 책들을 넣는 생성자를 만들었다.
	public BookShelf(Book book1, Book book2, Book book3, Book book4, Book book5) {
		bookBox[0] = book1;
		bookBox[1] = book2;
		bookBox[2] = book3;
		bookBox[3] = book4;
		bookBox[4] = book5;
	}
	
	// 모든 책 간단 정보 출력 메소드
	void listAll() {
		for (int i = 0; i < 5; i++) {
			bookBox[i].list();
		}
	}

	// 모든 책 상세 정보 출력 메소드
	void addInformationAll() {
		for (int i = 0; i < 5; i++) {
			bookBox[i].addInformation();
		}
	}
	
	// 오름차순 메소드
	void asc() {
		for(int i = 0; i < bookBox.length; i++) {
			for(int j = i+1; j < bookBox.length; j++) {
				if (bookBox[i].getPrice() > bookBox[j].getPrice()) {
					win = bookBox[i];
					bookBox[i] = bookBox[j];
					bookBox[j] = bookBox[i];
				}
			}
		}

		for(int i=0; i<bookBox.length; i++) {
			bookBox[i].list();
		}
	}
	// 오름차순 끝
	
	// 내림차순 메소드
	void desc() {
		for(int i = 0; i < bookBox.length; i++) {
			for(int j = i+1; j < bookBox.length; j++) {
				if (bookBox[i].getPrice() > bookBox[j].getPrice()) {
					win = bookBox[i];
					bookBox[i] = bookBox[j];
					bookBox[j] = bookBox[i];
				}
			}
		}

		for(int i= bookBox.length - 1; i >= 0 ; i--) {
			bookBox[i].list();
		}
	}
	// 내림차순 끝
	
	// 장르 분류 메소드
	//******** 오류****** 5번 반복하니깐 똑같은 장르임에도 중복출력됨.(1번 장르~~~로 분류 했는데 또 1번장르로 ~~~나온다.)
	void genreSelect() {
		for (int x = 0; x < bookBox.length; x++) {	
			System.out.println(bookBox[x].getGenre());
			for (int i = 0; i < bookBox.length; i++) {
				if (bookBox[i].getGenre().equals(bookBox[x].getGenre())) {
					bookBox[i].list();
				}
			}
		}
	}
	// 장르 분류 끝
}

public class BookProgram {
	public static void main(String[] args) {

		
		// 책을 넣는 박스 5개를 만들었다.
		Book[] book = new Book[5];
		Book win = null;
		// 책 5권의 정보를 입력한다.
		book[0] = new Book("1번책", "작가", "출판사", "장르1", 10000, "상세정보 입력하세요 : "); 
		book[1] = new Book("2번책", "작가", "출판사", "장르1", 20000, "상세정보 입력하세요 : "); 
		book[2] = new Book("3번책", "작가", "출판사", "장르3", 30000, "상세정보 입력하세요 : "); 
		book[3] = new Book("4번책", "작가", "출판사", "장르1", 40000, "상세정보 입력하세요 : "); 
		book[4] = new Book("5번책", "작가", "출판사", "장르5", 50000, "상세정보 입력하세요 : "); 

		// 간단 정보 나오게 하는 메소드 호출
		
		//book[0].list();

		// 상세 정보 나오는 메소드 호출.
		
		//book[0].addInformation();

		//////// 책 정보 불러왔다.
		BookShelf shelf = new BookShelf(book[0], book[1], book[2], book[3], book[4]);
		
		//shelf.listAll(); // 간단 정보 전체 나오는 메소드
		//shelf.addInformationAll(); // 상세 정보 전체 나오는 메소드

		System.out.println();
		
		// 1번 오름 내림 차순 완료
//		shelf.asc();
//		shelf.desc();
		
		// 2번 장르 분류
//		shelf.genreSelect();
		
		for (int x = 0; x < book.length; x++) {	
			System.out.println(book[x].getGenre());
			for (int i = 0; i < book.length; i++) {
				if (book[i].getGenre().equals(book[x].getGenre())) {
					book[i].list();
				}
			}
		}

	}
}