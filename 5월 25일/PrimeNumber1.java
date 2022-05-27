public class PrimeNumber1 {
	public static void main(String[] agrs) {
	
		for (int a = 2; a <= 100; a ++) {
			int count = 0;
			for (int i = a; i > 0; i--) {
				if (a % i == 0) {count++;
				} 	
			} 
			if (count == 2){System.out.println(a);}
		}
	}
}