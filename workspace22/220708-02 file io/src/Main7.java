import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main7 {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> lotto = new LinkedHashMap<>();
		
		lotto.put(1000, new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));
		lotto.put(1001, new HashSet<Integer>(Arrays.asList(7, 8, 9, 10, 11, 12)));
		lotto.put(1002, new HashSet<Integer>(Arrays.asList(13, 14, 15, 16, 17, 18)));
		
		File file = new File("d:\\filetest\\lotto.txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new FileWriter(file)); 
			for (int i = 0; i < lotto.size(); i++) {
			pw.print(lotto.keySet().toArray()[i] + " : ");
			pw.println(lotto.get(lotto.keySet().toArray()[i]));
//			pw.println(lotto.get(1001));
//			pw.println(lotto.get(1002));
			}
			Set<Integer> keySet = lotto.keySet();
			for (Integer x : keySet) {
				pw.println("forEach문으론 = " + x + " : " + lotto.get(x));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
		
		
		
		
		/////////////////////// println을 하면 기록이 새로 다시 쓰인다.내용을 덧붙이는게 아니다. 덧붙이고 싶을땐 어떻게 해야할까?/////////////////////

		try {
			PrintWriter pw2 = null;
			pw2 = new PrintWriter(new FileWriter(file, true));
			pw2.println("새번호 : 20,22,24,26,28,30");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
		
		
		
		
		
		
		
		
		
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (bf != null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		

		
		
		
	}

}
