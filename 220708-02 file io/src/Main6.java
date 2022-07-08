import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main6 {
	public static void main(String[] args) {
		// 파일 생성 (직접 손으로)
		// person.txt
		File file = new File("d:\\filetest\\person.txt");
		PrintWriter pw = null;
		try {
			 pw = new PrintWriter(new FileWriter(file));
			pw.println("홍길동,22");
			pw.println("둘리,33");
			pw.println("도우너,44");
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
		
		
		
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			int sum = 0;
			int count = 0;
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
				int index = line.indexOf(',');
				String strAge = line.substring(index + 1);
				Integer age = Integer.valueOf(strAge);
				
				System.out.println("숫자변환 결과: " + age);
				sum += age;
				count++;
			}
			System.out.println("평균 나이 : " + sum / count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
 
		}
		
		
		
		
		
		
		
		
		
		
	}

}
