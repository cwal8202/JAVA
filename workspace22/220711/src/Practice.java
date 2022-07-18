import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		File file = new File("d:\\filetest\\연습문제1.txt");
		List<Integer> list = new ArrayList<>();
		System.out.println(file.exists());
		BufferedReader br = null;	// bufferedReader은 문자 1개를 읽는다. 하지만 10 20 430 같은 경우 1개가 아닌 2~3개의 글자로 되어 있다. 그리고
		// 값들은 enter로 줄 바꿈해서 값을 구분하고 있다. 그래서 한줄씩 끊어서 읽어야 한다.
		int a = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			while (true) {
				a = Integer.valueOf(br.readLine());
				System.out.println(a);
				list.add(a);
				Collections.sort(list);
				System.out.println(list);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
		} finally {
			if ( br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//////////////////////////////////////
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("d:\\filetest\\연습문제1.txt"));
			for (int i = 0; i < list.size(); i++){
				pw.println(list.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		System.out.println("list" + a);
	}
}
