import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>{
	private String title;
	private int price;
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
}

public class Main8 {
	public static void main(String[] args) {
		/*	원래는 hash값이 다 다른데 hashcode값을 Override 해서 원소 값 똑같으면 같은 hash값 되게 만들었다!
		 * int hash1 = Objects.hash(5000, "책1"); 
		 * int hash2 = Objects.hash(5000, "책1");
		 * int hash3 = Objects.hash(5000, "책2"); 
		 * int hash4 = Objects.hash(5001, "책1");
		 * System.out.println(hash1); 
		 * System.out.println(hash2);
		 * System.out.println(hash3); 
		 * System.out.println(hash4);
		 */
		// hash라는 숫자값이 다르면 다르구나, 하고 인식한다. 
		Book b1 = new Book("책1", 5000);
		Book b2 = new Book("책1", 5000);
		Book b3 = new Book("책2", 3000);
		
		Set<Book> tree = new TreeSet<>();		// 대소 비교할 대상이 없다. tree는 비교 가능한 set값들을 비교하는것이다!
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
		System.out.println(tree);
		
		Comparator<Book> com = new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		// Comparator를 TreeSet의 생성자에 알려주면 된다!
		Set<Book> treeByPrice = new TreeSet<>(com);
		treeByPrice.add(b1);
		treeByPrice.add(b2);
		treeByPrice.add(b3);
		
		System.out.println(treeByPrice);
		
//		// hash값이 같으면 2차에서 중복되는지 확인한다.
//		System.out.println(b1.equals(b2));
//		System.out.println(b1.equals(b3));
//		
//		Set<Book> set = new HashSet<>();
//		set.add(b1);
//		set.add(b2);
//		set.add(b3);
//		
//		System.out.println(set.size());
//		System.out.println(set);
	}
}