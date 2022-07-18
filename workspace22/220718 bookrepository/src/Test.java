import java.sql.SQLException;
import java.util.List;

public class Test {
	public static void main(String[] args) throws SQLException {
		BooksRepository repo = new BooksRepository();
		
		int result;
		try {
//			result = repo.add(new Book("테스트용 책", 50000));
//			
//			System.out.println("확인" + (
//					result == 1));
//			
//			List<Book> list = repo.list();
//			System.out.println(list);
//		
//		Book book = repo.selectByTitle("asdf");
//		System.out.println(book);
//			
			result = repo.update(new Book(37, "자바에서 변경한 새이름", 5000));
			System.out.println(result == 1);
			
			Book book = repo.selectByTitle("자바에서 변경한 새이름");
			System.out.println(book);
		} catch (SQLException e) {
			System.out.println(e.getErrorCode());
			System.out.println(e.getMessage());
		}
	}
}
