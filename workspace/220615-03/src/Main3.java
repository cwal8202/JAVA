import java.lang.reflect.Array;
import java.util.Arrays;

class Member implements Comparable<Member> {	// generic <>안에 비교할 type을 적으면 된다.
	String name; // 이름
	int height; // 키
	int weight; // 몸무게

	public Member(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Member a) {
		return this.height - a.height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		if (height != other.height) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (weight != other.weight) {
			return false;
		}
		return true;
	}

	
}

public class Main3 {
	public static void main(String[] args) {
		Member[] members = {new Member("키큰놈", 190, 60)
				, new Member("키큰놈", 130, 30)
				, new Member("중간놈", 176, 65)
		};
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
	}
}
