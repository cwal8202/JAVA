import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main9 {
	public static boolean isNumberChar(char c) {
		return c >= '0' && c <= '9';
	}
	
	
	public static boolean isNumberStr(String s) {
		for (int i = 0; i < s.length(); i++) {
		if (!isNumberChar(s.charAt(i))) {
				return false;
			}
		} 
		return true;
	}
	
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList
				("apple", "banana", "carrot", "donut", "egg"));
		
		//  위의 리스트에서
		// 문자열 길이가 5글자인 문자열만을 원소로 가지는 리스트 생성
		List<String> listFive = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 5) {
				listFive.add(list.get(i));
			}
		}
		System.out.println(listFive);
		
		
		// 문자열 중에 'e' 문자를 포함하는 문자열만을 원소로 가지는 리스트 생성
//		List<String> listGetE = new ArrayList<>();
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list.get(i).length(); j++) {
//				if (list.get(i).charAt(j) == 'e') {
//					listGetE.add(list.get(i));
//					break;
//				}
//			}
//		}
//		System.out.println(listGetE);
		
		List<String> empty = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.contains("e")) {
				empty.add(str);
			}
		}
		System.out.println(empty);
		
		
		
		List<String> list2 = new ArrayList<>(Arrays.asList("가", "1", "@", "3", "나"));
		
		// 위의 2번 리스트에서 '정수 형태의 값'을 가지는 문자열을 찾아
		// 해당 원소를 가지는 정수형 리스트 생성
//		char c = "가".charAt(0);
//		System.out.println(c >= '0' && c <= '9');
//		
//		String a = list2.toString();
//		String str;
//	
		
		//// 아직 미완성
//		List<Integer> listInt = new ArrayList<>(Arrays.asList());
//		int intStr;
//		for (int i = 0; i < a.length(); i++) {
//		    char ch = a.charAt(i);
//		    if (48 <= ch && ch <= 57) {
//		    	
//		    }
//		}
//		//// 아직 미완성
		
		
		
		// '정수 형태의 값' 을 가지는 문자열을 -> Integer 형으로
//		Integer i = Integer.valueOf("1234"); // => 1234 Integer 반환
//		Integer exp = Integer.valueOf("숫자아니면"); // => NumberFormatException 예외 발생
		List<Integer> listInteger = new ArrayList<>();
		
		for (int i = 0; i < list2.size(); i++) {
			String str = list2.get(i);
		
			if (isNumberStr(str)) {
				listInteger.add(Integer.valueOf(str));
			}
		}
		System.out.println(listInteger);
		
//		for (int i = 0; i < list2.size(); i++) {
//			String str = list2.get(i);
//			try {	
//				Integer value = Integer.valueOf(str);
//				listInteger.add(value);
//			} catch (NumberFormatException e) {
//				System.out.println("문자열을 정수로 변환하는데 실패해서 예외 발생했지만 정상흐름으로 돌아가기원합니다.");
//			}
//		}
//		System.out.println(listInteger);
	}
}
