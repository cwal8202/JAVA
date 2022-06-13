import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Book {
	String title;
	int page;
	String author;
	public Book(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public int getPage() {
		return page;
	}
	public String getAuthor() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "제목 : " + title + "\n페이지수 : " + page + "\n저자  : " + author;
	}
}


class Magazine extends Book{
	String start;

	public Magazine(String title, int page, String author, String start) {
		super(title, page, author);
		this.start = start;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n발매일 : " + start;
	}
	
	public void printAll() {
		System.out.println(toString());
	}
}
	
public class Ex01{
	public static void main(String[] args) {
		Magazine m = new Magazine("제목", 100, "저자", "22년02월11일");
		m.printAll();
	}	
}
