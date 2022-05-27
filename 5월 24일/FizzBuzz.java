// Fizz Buzz
// 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz 16....
// 35까지

public class FizzBuzz {
	public static void main(String[] args){
		for (int i = 1; i <= 35; i++) {
			if ( i % 15 == 0){
				System.out.print("fizz buzz");
			} else if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} 
			else{System.out.print(i);}
		}
	}
}