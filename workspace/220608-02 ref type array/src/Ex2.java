import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String star = "*";
		String aresult = "";
		String bresult = "";
		String cresult = "";
		String dresult = "";
		String eresult = "";
		String fresult = "";
		String gresult = "";
		String hresult = "";
		String iresult = "";
		String jresult = "";
		
		// 입력하는 칸 갯수
		int[] iBox = new int[10];
		for (int i = 0; i < iBox.length; i++) {
			int input = scan.nextInt();
			iBox[i] = input;
		}
		
		int[] printBox = new int[10];
		for (int i = 0; i < iBox.length; i++) {
			if (iBox[i] <= 10)
				aresult += star;
			if (iBox[i] <= 10)
				bresult += star;
			if (iBox[i] <= 10)
				cresult += star;
			if (iBox[i] <= 10)
				dresult += star;
			if (iBox[i] <= 10)
				eresult += star;
			if (iBox[i] <= 10)
				fresult += star;
			if (iBox[i] <= 10)
				gresult += star;
			if (iBox[i] <= 10)
				hresult += star;
			if (iBox[i] <= 10)
				iresult += star;
			if (iBox[i] <= 10)
				jresult += star;
			
		}
		
		System.out.println("1 - 10: " + aresult);
		System.out.println("10 - 20: " + bresult);
		System.out.println("20 - 30: " + cresult);
		System.out.println("30 - 40: " + dresult);
		System.out.println("40 - 50: " + eresult);
		System.out.println("50 - 60: " + fresult);
		System.out.println("60 - 70: " + gresult);
		System.out.println("70 - 80: " + hresult);
		System.out.println("80 - 90: " + iresult);
		System.out.println("90 - 100: " + jresult);
	}

}
