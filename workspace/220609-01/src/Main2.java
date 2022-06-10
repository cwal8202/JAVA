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
class Book1 {
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
	Book1() {
	}

	Book1(int price) {
		this.price = price;
	}

	// 한번에 입력할수 있는 생성자 만듦.
	public Book1(String title, String author, String publisher, String genre, int price, String information) {
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
		System.out.printf("list (간단 정보) 1. %s / %s / %d원 ", title, author, price);
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
class BookShelf1 {
	Book1[] bookBox = new Book1[5];
//	Book1 book1;
//	Book1 book2;
//	Book1 book3;
//	Book1 book4;
//	Book1 book5;

	// 책장에 책들을 넣는 생성자를 만들었다.
	public BookShelf1(Book1[] bookBox) {

	}

	public BookShelf1(Book1 book1, Book1 book2, Book1 book3, Book1 book4, Book1 book5) {
		bookBox[0] = book1;
		bookBox[1] = book2;
		bookBox[2] = book3;
		bookBox[3] = book4;
		bookBox[4] = book5;
	}
	
	void listAll() {
		for (int i = 0; i < 5; i++) {
			bookBox[i].list();
		}
	}

	void addInformationAll() {
		for (int i = 0; i < 5; i++) {
			bookBox[i].addInformation();
		}
	}
}

public class Main2 {
	public static void main(String[] args) {

		
		// 책을 넣는 박스 5개를 만들었다.
		Book1[] book = new Book1[5];
		Book1 win = null;
		// 책 5권의 정보를 입력한다.
		book[0] = new Book1("1번책", "작가", "출판사", "장르", 10000, "상세정보 입력하세요 : "); 
		book[1] = new Book1("2번책", "작가", "출판사", "장르", 20000, "상세정보 입력하세요 : "); 
		book[2] = new Book1("3번책", "작가", "출판사", "장르", 30000, "상세정보 입력하세요 : "); 
		book[3] = new Book1("4번책", "작가", "출판사", "장르", 40000, "상세정보 입력하세요 : "); 
		book[4] = new Book1("5번책", "작가", "출판사", "장르", 50000, "상세정보 입력하세요 : "); 
		
		// 사용자가 입력하면 값 만들어준다.
//		Scanner scan = new Scanner(System.in);
//		String inputTitle;
//		String inputAuthor;
//		String inputPublisher;
//		String inputgenre;
//		int inputPrice;
//		String inputInformation;
		
		
//		5권 만드는 반복문
//		for (int i = 0; i < book.length; i++) {
//			System.out.println("제목, 작가, 출판사, 장르, 가격, 상세정보 입력하세요 : ");
//			inputTitle = scan.nextLine();
//			inputAuthor = scan.nextLine();
//			inputPublisher = scan.nextLine();
//			inputgenre = scan.nextLine();
//			inputPrice = scan.nextInt();
//			scan.nextLine();
//			inputInformation = scan.nextLine();
//			
//			bookPrice[i] = inputPrice;
//			book[i] = new Book1(inputTitle, inputAuthor, inputPublisher, inputgenre, inputPrice, inputInformation);
//		}

		// 간단 정보 나오게 하는 메소드 호출
		
		//book[0].list();

		// 상세 정보 나오는 메소드 호출.
		
		//book[0].addInformation();

		//////// 책 정보 불러왔다.
		BookShelf1 shelf = new BookShelf1(book[0], book[1], book[2], book[3], book[4]);
		
		//shelf.listAll(); // 간단 정보 전체 나오는 메소드
		//shelf.addInformationAll(); // 상세 정보 전체 나오는 메소드

		System.out.println();
		//////////////////// 오름차순 중임.....
		for(int i = 0; i < book.length; i++) {
			for(int j = i+1; j < book.length; j++) {
				if (book[i].getPrice() > book[j].getPrice()) {
					win = book[i];
					book[i] = book[j];
					book[j] = book[i];
				}
			}
		}

		for(int i=0; i<book.length; i++) {
			book[i].list();
			//// 마지막 값에 쉼표 안넣을려고 만드는 가정 코드이다.
//			if(i+1 != book.length) {
//				System.out.print(", ");
		}
		
		///////////////////// 내림차순 중임....
		for(int i = 0; i < book.length; i++) {
			for(int j = i+1; j < book.length; j++) {
				if (book[i].getPrice() > book[j].getPrice()) {
					win = book[i];
					book[i] = book[j];
					book[j] = book[i];
				}
			}
		}

		for(int i= book.length - 1; i >= 0 ; i--) {
			book[i].list();
			//// 마지막 값에 쉼표 안넣을려고 만드는 가정 코드이다.
//			if(i+1 != book.length) {
//				System.out.print(", ");
		}
	}
}