import java.net.*;	// net.디렉토리 밑에 있는 모든 클래스파일 안에 소켓이 있따.
import java.io.*;	// 입출력 관한거
import java.util.*;	// 많은 툴들

public class 메가존아이티 {
	public static void main(String[] args) throws Exception {
		System.out.println("클라이언트가 서버와의 통신을 준비합니다.");
		Socket socket = new Socket("localhost", 8000);	// localhost 내 컴퓨터라는 뜻이다.	ip주소, 포트번호
		System.out.println("서버와의 연결에 성공했습니다.");
		
		System.out.println("서버와의 송수신을 위한 스트리밍 객체를 생성합니다");	// socket 연결을 하면서 만들어진 객체. 소켓 안에 있는 데이터를 꺼내서 어플리케이션 프로그램에 받을수 있는 객체
		BufferedReader receiveString = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 상대방에서 보내준 데이터를 어플리케이션 프로그램한테 받을수 있는 객체. 만들수 있는 클래스를 제공할 수 있다.
 		BufferedWriter sendString = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		System.out.println("서버로 보낼 메세지를 입력하면 됩니다.");
		Scanner keyboardInput = new Scanner(System.in);
		String msg = keyboardInput.nextLine();
		System.out.println("서버로 보낼 메세지는 (" + msg + ")입니다");
		
		System.out.println("서버로 메세지를 전송합니다");
		sendString.write(msg + "\n");
		sendString.flush();		//	 네트워크 카드에 데이터를 집어넣은 다음에 네트워크카드가 알아서 보낸다. 언제 보내는지 몰라서 지금 당장 보내라는 것이다.
	
		System.out.println("서버로부터 메세지 전송을 기다립니다.");
		msg = receiveString.readLine();
		System.out.println("서버로부터 (" + msg + ") 를 수신했습니다.");
		
		System.out.println("소켓을 종료합니다.");
		keyboardInput.close();
		socket.close();
		
		// 오류가 난다. 서버를 구현해야 하기때문!
	}
}

