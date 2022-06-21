import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 일기 관리 프로그램
// 일기 (날짜, 제목, 날씨, 내용 등등)

// 일기 등록
// 같은 일자에는 일기 중복 X

// 일기 목록도 볼 수 있음.
// 날짜 순
// 내용 길이 순

// 날짜를 선택해서 해당 일기 내용을 수정 가능

// 삭제 - 가장 오래된 일기만 가능 

///////////////////////////////////////////////////////////////////////////
// 삭제는 (선입선출이니깐 queue로 하자 선택해서 구현해도 좋다!)
// 일기가 있을 것이고 등록이 가능하다 - list로, 같은일자 일기 중복 안되니깐 equals해서 맞으면 안되게 하기
// 목록 보느ㅜㄴ건

class Diary implements Comparable<Diary>{
	String date;
	String title;
	String contents;
	String weather;
	
	


	public Diary(String date, String title, String contents, String weather) {
		super();
		this.date = date;
		this.title = title;
		this.contents = contents;
		this.weather = weather;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}

	
	public String getWeather() {
		return weather;
	}
	public String getDate() {
		return date;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	@Override
	public String toString() {
		return "Diary [date=" + date + ", title=" + title + ", contents=" + contents + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Diary))
			return false;
		Diary other = (Diary) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}


	@Override
	public int compareTo(Diary o) {
		return date.compareTo(o.date);
	}
	
}


public class Main {
	public static void main(String[] args) {
		List<Diary> list = new ArrayList<>();
		list.add(new Diary("22.06.25", "제목", "오늘은 재밌있었던거 같다.", "맑음"));
		list.add(new Diary("22.06.18", "제목", "오늘은 정말 정말 재밌었다.", "맑음"));
		list.add(new Diary("22.06.20", "제목", "오늘은 많이 어려웠다.", "추움"));
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("\n0번 일기 등록 /  1번 일기 목록 /  2번 날짜순으로 정렬 /  3번 내용길이순으로 정렬 /  4번 일기 삭제 /  5번 일기 내용수정 /  6번 종료");
			int input = scan.nextInt();
			// 일기 등록
			if (input == 0 ) {
				scan.nextLine();
				System.out.println("날짜 : ");
				String date = scan.nextLine();
				System.out.println("제목 : ");
				String title = scan.nextLine();
				System.out.println("내용 : ");
				String contents = scan.nextLine();
				System.out.println("날씨 : ");
				String weather = scan.nextLine();
				list.add(new Diary(date, title, contents, weather));
			}
			// 목록 보여줌
			if (input == 1) {
				for (Diary s : list) {
					System.out.println(s);
				}
			}
			if(input == 2) {
			// 날짜순 정렬
				Collections.sort(list);
				System.out.println("날짜순" + list);
				
				Comparator<Diary>comparator = new Comparator<Diary>() {
					@Override
					public int compare(Diary o1, Diary o2) {
						return o1.contents.length() - o2.contents.length();
					}
				};
			}
			if (input == 3) {
				Comparator<Diary>comparator = new Comparator<Diary>() {
					@Override
					public int compare(Diary o1, Diary o2) {
						return o1.contents.length() - o2.contents.length();
					}
				};
				// 내용 길이 순
				Collections.sort(list, comparator);
				System.out.println("내용길이 순 " + list);
			}
			if (input == 4) {
				Collections.sort(list);
				System.out.println("가장 먼저 있는 일기 삭제할게요" + list.get(0));
			
				// 날짜순에서 제거.
				System.out.println("삭제 하시겠습니까? (예 = 1), (아니오 = 2)");
				int check = scan.nextInt();
				if (check == 1) {
					list.remove(0);	
					System.out.println("삭제 되었습니다.");
					System.out.println(list);
				} else if (check == 2) {
					System.out.println("취소되었습니다.");
					System.out.println(list);
				}
			}
			if (input == 5) {
				System.out.println("몇번째 일기 바꿀래?");
				int diarynumber = scan.nextInt();
				System.out.println(list.get(diarynumber));
				System.out.println("뭘 바꿀래? 1번 날짜 2번 제목 3번 내용 4번 날씨");
				int choice = scan.nextInt();
				if (choice == 1) {	
					scan.nextLine();
					System.out.println(list.get(diarynumber).getDate());
					System.out.print("바꿀 내용을 작성해주세요 : ");
					String change = scan.nextLine();
					list.get(diarynumber - 1).setDate(change);
					System.out.println("날짜가 변경되었습니다\n" + list.get(diarynumber - 1));		
				} if (choice == 2) {	
					scan.nextLine();
					System.out.println(list.get(diarynumber).getTitle());
					System.out.print("바꿀 내용을 작성해주세요 : ");
					String change = scan.nextLine();
					list.get(diarynumber - 1).setTitle(change);
					System.out.println("제목이 변경되었습니다\n" + list.get(diarynumber - 1));		
				} if (choice == 3) {	
					scan.nextLine();
					System.out.println(list.get(diarynumber).getContents());
					System.out.print("바꿀 내용을 작성해주세요 : ");
					String change = scan.nextLine();
					list.get(diarynumber - 1).setContents(change);
					System.out.println("내용이 변경되었습니다\n" + list.get(diarynumber - 1));		
				}if (choice == 4) {	
					scan.nextLine();
					System.out.println(list.get(diarynumber).getWeather());
					System.out.print("바꿀 내용을 작성해주세요 : ");
					String change = scan.nextLine();
					list.get(diarynumber - 1).setWeather(change);
					System.out.println("날씨가 변경되었습니다\n" + list.get(diarynumber - 1));		
				}
			}
			if (input == 6) {
				System.out.println("시스템 종료");
				break;
			}

		}
		
//		원래는 일기내용 수정을 이렇게 했었다. 이렇게 하니깐 내용이 
//		if (choice == 2) {
//			scan.nextLine();
//			String change = scan.nextLine();
//			list.set(diarynumber - 1, new Diary("22.06.25", change, "오늘은 별로던거 같다.", "맑음"));		
//		}
//		
	}
}
