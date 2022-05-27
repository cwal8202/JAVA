import java.util.Scanner;

public class InputString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt(); //scan은 숫자를 먼저 입력한 후 enter키를 눌리면
		scan.nextLine();		//enter키가 저장된다. scan은 enter키에 작동되기때문에 444을 치고 enter를 치면 
								// enter키가 저장되어있어서 빈문자가 이미 입력된 값이 된것이다.
		System.out.println("한줄을 입력하세요 : ");
		String line = scan.nextLine();
		
		System.out.println(line);
	}
}